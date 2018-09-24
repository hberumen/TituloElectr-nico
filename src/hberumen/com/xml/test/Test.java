package hberumen.com.xml.test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.Base64;

import hberumen.com.xml.titulo.TituloElectronico;
import hberumen.com.xml.titulo.TituloElectronico.Antecedente;
import hberumen.com.xml.titulo.TituloElectronico.Carrera;
import hberumen.com.xml.titulo.TituloElectronico.Expedicion;
import hberumen.com.xml.titulo.TituloElectronico.FirmaResponsables;
import hberumen.com.xml.titulo.TituloElectronico.Institucion;
import hberumen.com.xml.titulo.TituloElectronico.Profesionista;
import hberumen.com.xml.titulo.TituloElectronico.FirmaResponsables.FirmaResponsable;
import mx.sep.mec.web.ws.schemas.AutenticacionType;
import mx.sep.mec.web.ws.schemas.CargaTituloElectronicoRequest;
import mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse;
import mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoRequest;
import mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse;
import mx.sep.mec.web.ws.schemas.TitulosPortTypeProxy;

public class Test {
	
	private static final String VERSION = "1.0";	

	public Test() {
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		//Generar xml
		String xml = new Test().test();
		System.out.println(xml);
		
		//Conectar server
		//new Test().test(xml);
		
		//Consultar archivo enviado
		//new Test().consultaWebService();
	}
	
	
	
	

	public String test() throws Exception {
		
		try {
			TituloElectronico titulo = new TituloElectronico();
			titulo.setVersion(VERSION);
			titulo.setFolioControl("HBM20000031");		
			
			titulo.setFirmaResponsables(new FirmaResponsables());
			titulo.getFirmaResponsables().getFirmaResponsable().add(new FirmaResponsable());
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setNombre("FERNANDO");
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setPrimerApellido("FERNANDEZ");
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setSegundoApellido("FERNANDEZ");
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setCurp("FEFE750712HZSGRN04");
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setIdCargo(1);
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setCargo("RECTOR");
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setAbrTitulo("Dr.");
			
			
			titulo.getFirmaResponsables().getFirmaResponsable().add(new FirmaResponsable());
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setNombre("JOSE");
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setPrimerApellido("PEREZ");
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setSegundoApellido("PEREZ");
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setCurp("JOPE800210HTSBYB04");
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setIdCargo(6);
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setCargo("SECRETARIO GENERAL");
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setAbrTitulo("Mtro.");

			
			titulo.setInstitucion(new Institucion());
			titulo.getInstitucion().setCveInstitucion("280004");
			titulo.getInstitucion().setNombreInstitucion("UNIVERSIDAD AUTONÓMA DE NUEVO LEON");
			
			titulo.setCarrera(new Carrera());
			titulo.getCarrera().setCveCarrera("612301");
			titulo.getCarrera().setNombreCarrera("LICENCIATURA EN DERECHO");
			titulo.getCarrera().setFechaInicio("2004-08-15");
			titulo.getCarrera().setFechaTerminacion("2012-12-15");
			titulo.getCarrera().setIdAutorizacionReconocimiento(3);
			titulo.getCarrera().setAutorizacionReconocimiento("AUTORIZACIÓN FEDERAL");		
			
			titulo.setProfesionista(new Profesionista());
			titulo.getProfesionista().setCurp("LOPEZ850422MRSRRL04");
			titulo.getProfesionista().setNombre("CLAUDIA MARIA");
			titulo.getProfesionista().setPrimerApellido("LOPEZ");
			titulo.getProfesionista().setSegundoApellido("PEREZ");
			titulo.getProfesionista().setCorreoElectronico("hberumen@uaz.edu.mx");
			
			
			titulo.setExpedicion(new Expedicion());
			titulo.getExpedicion().setFechaExpedicion("2018-09-12");
			titulo.getExpedicion().setIdModalidadTitulacion(1);
			titulo.getExpedicion().setModalidadTitulacion("POR TESIS");
			titulo.getExpedicion().setFechaExamenProfesional("2013-01-05");
			titulo.getExpedicion().setCumplioServicioSocial(1);
			titulo.getExpedicion().setIdFundamentoLegalServicioSocial(1);
			titulo.getExpedicion().setFundamentoLegalServicioSocial("ART. 52 LRART. 5 CONST");
			titulo.getExpedicion().setIdEntidadFederativa("32");
			titulo.getExpedicion().setEntidadFederativa("ZACATECAS");
			
			titulo.setAntecedente(new Antecedente());
			titulo.getAntecedente().setInstitucionProcedencia("UNIDAD ACADEMIA DE PREPARATORIA");
			titulo.getAntecedente().setIdTipoEstudioAntecedente(4);
			titulo.getAntecedente().setTipoEstudioAntecedente("BACHILLERATO");
			titulo.getAntecedente().setIdEntidadFederativa("23");
			titulo.getAntecedente().setEntidadFederativa("NUEVO LEON");
			titulo.getAntecedente().setFechaInicio("2000-08-15");
			titulo.getAntecedente().setFechaTerminacion("2003-06-05");
			
			
			TituloUtils utils = new TituloUtils(titulo);
			utils.setTipo(TituloUtils.TIPO_RECTOR);
			
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setSello(utils.getEncodeSello());
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setCertificadoResponsable(utils.getCertificadoResponsable());
			titulo.getFirmaResponsables().getFirmaResponsable().get(0).setNoCertificadoResponsable(utils.getNoCertificadoResponsable());
			
			utils.setTipo(TituloUtils.TIPO_SECRETARIO);
			
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setSello(utils.getEncodeSello());
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setCertificadoResponsable(utils.getCertificadoResponsable());
			titulo.getFirmaResponsables().getFirmaResponsable().get(1).setNoCertificadoResponsable(utils.getNoCertificadoResponsable());
			
			String xml = utils.generaXml(titulo);								
			
														
			return xml;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
				
	}

	

	public void testWebService(String xml) throws UnsupportedEncodingException {
		
		AutenticacionType pass = new AutenticacionType();
		pass.setPassword(TituloUtils.USUARIO_SERVER);
		pass.setUsuario(TituloUtils.PASSWORD_SERVER);
		
		CargaTituloElectronicoRequest wsTitulo = new CargaTituloElectronicoRequest();
		wsTitulo.setNombreArchivo("HBM20000031.xml");
		wsTitulo.setAutenticacion(pass);
		wsTitulo.setArchivoBase64(Base64.getEncoder().encodeToString(xml.getBytes("utf-8")).getBytes("utf-8"));	
		
		TitulosPortTypeProxy ws = new TitulosPortTypeProxy();
		try {
			CargaTituloElectronicoResponse response =  ws.cargaTituloElectronico(wsTitulo);			
			System.out.println(" - "+response.getMensaje()+" - "+response.getNumeroLote());
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	public void consultaWebService() {
		
		AutenticacionType pass = new AutenticacionType();
		pass.setPassword(TituloUtils.USUARIO_SERVER);
		pass.setUsuario(TituloUtils.PASSWORD_SERVER);
		
		ConsultaProcesoTituloElectronicoRequest consulta = new ConsultaProcesoTituloElectronicoRequest();
		consulta.setAutenticacion(pass);
		consulta.setNumeroLote(new BigInteger("28291"));
		
		TitulosPortTypeProxy ws = new TitulosPortTypeProxy();
		ConsultaProcesoTituloElectronicoResponse consultaResp;
		try {
			consultaResp = ws.consultaProcesoTituloElectronico(consulta);
			System.out.println(consultaResp.getMensaje()+" - "+consultaResp.getEstatusLote()+" - " +consultaResp.getNumeroLote());
		} catch (RemoteException e) {
			e.printStackTrace();
		}		
		
	}
	
	
	
	

}
