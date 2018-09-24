package hberumen.com.xml.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.ssl.PKCS8Key;

import hberumen.com.xml.titulo.TituloElectronico;



public class TituloUtils {
	
	private static final String SCHEMA_TITULO = "https://www.siged.sep.gob.mx/titulos/ schema.xsd";
	
	public static final String PATH_SAT = "/srv/CARPETA_ARCHIVOS";
	private static String LLAVE_RECTOR  = "llave.key";
	private static String CERTIFICADO_RECTOR = "certificado.cer";
	private static String PASS_LLAVE_RECTOR	= "password";	

	private static String LLAVE_SECRETARIO = "llave.key";
	private static String CERTIFICADO_SECRETARIO = "certificado.cer";
	private static String PASS_LLAVE_SECRETARIO	= "password";
			
	public static String USUARIO_SERVER = "usuario";
	public static String PASSWORD_SERVER = "password";
	
	public static String TIPO_RECTOR	    = "RECTOR";
	public static String TIPO_SECRETARIO	 = "SECRETARIO";

	private String sello;
	private String certificado;    
	private String noCertificadoResponsable;
	private String llaveCurrent;
	private String certificadoCurrent;
	private String passCurrent;
	private String cadenaOriginal;
	private TituloElectronico titulo;

	public TituloUtils(TituloElectronico titulo) {
		this.titulo = titulo;      		
	}



	private void generaCadenaOriginal() {
		String pip = "|";
		int tipoPersona = (passCurrent.equals(PASS_LLAVE_RECTOR))?1:0;			

		List<Object> item = new ArrayList<Object>();
		item.add(titulo.getVersion());
		item.add(titulo.getFolioControl());
		item.add(titulo.getFirmaResponsables().getFirmaResponsable().get(tipoPersona).getCurp());
		item.add(titulo.getFirmaResponsables().getFirmaResponsable().get(tipoPersona).getIdCargo());
		item.add(titulo.getFirmaResponsables().getFirmaResponsable().get(tipoPersona).getCargo());
		item.add(validaOpcional(titulo.getFirmaResponsables().getFirmaResponsable().get(tipoPersona).getAbrTitulo()));
		item.add(titulo.getInstitucion().getCveInstitucion());
		item.add(titulo.getInstitucion().getNombreInstitucion());
		item.add(titulo.getCarrera().getCveCarrera());
		item.add(titulo.getCarrera().getNombreCarrera());
		item.add(validaOpcional(titulo.getCarrera().getFechaInicio()));
		item.add(titulo.getCarrera().getFechaTerminacion());
		item.add(titulo.getCarrera().getIdAutorizacionReconocimiento());
		item.add(titulo.getCarrera().getAutorizacionReconocimiento());
		item.add(validaOpcional(titulo.getCarrera().getNumeroRvoe()));
		item.add(titulo.getProfesionista().getCurp());
		item.add(titulo.getProfesionista().getNombre());
		item.add(titulo.getProfesionista().getPrimerApellido());
		item.add(validaOpcional(titulo.getProfesionista().getSegundoApellido()));
		item.add(titulo.getProfesionista().getCorreoElectronico());
		item.add(titulo.getExpedicion().getFechaExpedicion());
		item.add(titulo.getExpedicion().getIdModalidadTitulacion());
		item.add(titulo.getExpedicion().getModalidadTitulacion());
		item.add(validaOpcional(titulo.getExpedicion().getFechaExamenProfesional()));
		item.add(validaOpcional(titulo.getExpedicion().getFechaExencionExamenProfesional()));
		item.add(titulo.getExpedicion().getCumplioServicioSocial());
		item.add(titulo.getExpedicion().getIdFundamentoLegalServicioSocial());
		item.add(titulo.getExpedicion().getFundamentoLegalServicioSocial());
		item.add(titulo.getExpedicion().getIdEntidadFederativa());
		item.add(titulo.getExpedicion().getEntidadFederativa());
		item.add(titulo.getAntecedente().getInstitucionProcedencia());
		item.add(titulo.getAntecedente().getIdTipoEstudioAntecedente());
		item.add(titulo.getAntecedente().getTipoEstudioAntecedente());
		item.add(titulo.getAntecedente().getIdEntidadFederativa());
		item.add(titulo.getAntecedente().getEntidadFederativa());
		item.add(validaOpcional(titulo.getAntecedente().getFechaInicio()));
		item.add(titulo.getAntecedente().getFechaTerminacion());
		item.add(validaOpcional(titulo.getAntecedente().getNoCedula()));

		cadenaOriginal = item.stream()
				.map(it -> String.valueOf(it))
				.collect(Collectors.joining(pip));
		cadenaOriginal = pip+pip+cadenaOriginal+pip+pip;		
	}



	private Object validaOpcional(Object object) {
		Object retorno;
		if(object == null)
			retorno = "";
		else
			retorno = object;

		return retorno;
	}



	@SuppressWarnings("unused")
	private static String parseExtensionArrayToDescriptionMessage(String[] extensionArray) {
		final StringBuffer result = new StringBuffer();
		result.append("Archivos (");

		for (int i = 0; i < extensionArray.length; i++) {
			result.append("*.");
			result.append(extensionArray[i]);
			result.append(i < (extensionArray.length - 1) ? ", " : "");
		}

		result.append(")");

		return result.toString();
	}

	private  String sign() throws Exception {				
		final PKCS8Key pkcs8Key = new PKCS8Key(toByteArray(llaveCurrent), passCurrent.toCharArray());
		final PrivateKey privateKey = pkcs8Key.getPrivateKey();

		final Signature signature = Signature.getInstance("SHA256withRSA");
		signature.initSign(privateKey);
		signature.update(cadenaOriginal.getBytes("UTF-8"));

		return Base64.encodeBase64String(signature.sign());
	}

	public  String verifySign(String cerPath, String toVerify, String sign) {

		String resultado = null;
		Boolean blnResultado = false;
		try (InputStream cer = new FileInputStream(new File(cerPath))) {
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			Certificate cert = (X509Certificate) cf.generateCertificates(cer).iterator().next();

			final Signature signature = Signature.getInstance("SHA256withRSA");
			signature.initVerify(cert.getPublicKey());
			signature.update(toVerify.getBytes("UTF-8"));

			blnResultado = signature.verify(Base64.decodeBase64(sign.getBytes("UTF-8")));

		} catch (Exception e) {
			e.printStackTrace();

		}
		if(blnResultado.equals(Boolean.FALSE)) {
			resultado = new String("Firma Incorrecta");
		} else {
			resultado = new String("Firma Correcta");
		}
		return resultado;
	}

	private  byte[] toByteArray(String filePath) throws Exception {
		File f = new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		byte[] fbytes = new byte[(int) f.length()];
		fis.read(fbytes);
		fis.close();
		return fbytes;
	}

	private X509Certificate getX509Certificate(File certificateFile) throws CertificateException,
	IOException{

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(certificateFile);
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			return (X509Certificate) cf.generateCertificate(fis);
		} finally {
			if(fis != null){
				fis.close();
			}
		}

	}

	public void generaNoCertificado() throws CertificateException, IOException{

		File certiFile = new File(certificadoCurrent);
		X509Certificate x509Cert = getX509Certificate(certiFile);
		BigInteger serial = x509Cert.getSerialNumber();
		byte[] sArr = serial.toByteArray();
		StringBuffer buffer = new StringBuffer();
		for(byte caracter : sArr){
			buffer.append((char) caracter);
		}
		setNoCertificadoResponsable(buffer.toString());
	}

	public String getSello() {
		return sello;
	}

	public void setSello(String sello) {
		this.sello = sello;
	}

	public String getEncodeSello() throws Exception {		
		certificado = Base64.encodeBase64String(toByteArray(certificadoCurrent));
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	public String getCertificadoResponsable() throws Exception {
		return sign();
	}

	public void setCertificadoResponsable(String noCertificadoResponsable) {
		this.setNoCertificadoResponsable(noCertificadoResponsable);
	}



	public void setTipo(String tipo) {
		if(tipo.equals(TIPO_RECTOR)) {
			llaveCurrent = PATH_SAT+LLAVE_RECTOR;
			certificadoCurrent = PATH_SAT+CERTIFICADO_RECTOR;
			passCurrent = PASS_LLAVE_RECTOR;
		}else {
			llaveCurrent = PATH_SAT+LLAVE_SECRETARIO;
			certificadoCurrent = PATH_SAT+CERTIFICADO_SECRETARIO;
			passCurrent = PASS_LLAVE_SECRETARIO;
		}
		generaCadenaOriginal();
	}



	public String getNoCertificadoResponsable() throws CertificateException, IOException {
		generaNoCertificado();
		return noCertificadoResponsable;
	}



	public void setNoCertificadoResponsable(String noCertificadoResponsable) {
		this.noCertificadoResponsable = noCertificadoResponsable;
	}

	
	 public String generaXml(TituloElectronico titulo) throws Exception {

	        JAXBContext context = null;
	        try {           
	        	
	            context = JAXBContext.newInstance(new Class[]{TituloElectronico.class});
	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, SCHEMA_TITULO);

	            StringWriter xml = new StringWriter();
	            marshaller.marshal(titulo, xml);
	            return xml.toString();

	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }

	        return new String();
	   }

}
