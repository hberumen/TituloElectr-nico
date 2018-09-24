/**
 * CargaTituloElectronicoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.sep.mec.web.ws.schemas;

public class CargaTituloElectronicoRequest  implements java.io.Serializable {
    private java.lang.String nombreArchivo;

    private byte[] archivoBase64;

    private mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion;

    public CargaTituloElectronicoRequest() {
    }

    public CargaTituloElectronicoRequest(
           java.lang.String nombreArchivo,
           byte[] archivoBase64,
           mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion) {
           this.nombreArchivo = nombreArchivo;
           this.archivoBase64 = archivoBase64;
           this.autenticacion = autenticacion;
    }


    /**
     * Gets the nombreArchivo value for this CargaTituloElectronicoRequest.
     * 
     * @return nombreArchivo
     */
    public java.lang.String getNombreArchivo() {
        return nombreArchivo;
    }


    /**
     * Sets the nombreArchivo value for this CargaTituloElectronicoRequest.
     * 
     * @param nombreArchivo
     */
    public void setNombreArchivo(java.lang.String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }


    /**
     * Gets the archivoBase64 value for this CargaTituloElectronicoRequest.
     * 
     * @return archivoBase64
     */
    public byte[] getArchivoBase64() {
        return archivoBase64;
    }


    /**
     * Sets the archivoBase64 value for this CargaTituloElectronicoRequest.
     * 
     * @param archivoBase64
     */
    public void setArchivoBase64(byte[] archivoBase64) {
        this.archivoBase64 = archivoBase64;
    }


    /**
     * Gets the autenticacion value for this CargaTituloElectronicoRequest.
     * 
     * @return autenticacion
     */
    public mx.sep.mec.web.ws.schemas.AutenticacionType getAutenticacion() {
        return autenticacion;
    }


    /**
     * Sets the autenticacion value for this CargaTituloElectronicoRequest.
     * 
     * @param autenticacion
     */
    public void setAutenticacion(mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion) {
        this.autenticacion = autenticacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CargaTituloElectronicoRequest)) return false;
        CargaTituloElectronicoRequest other = (CargaTituloElectronicoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombreArchivo==null && other.getNombreArchivo()==null) || 
             (this.nombreArchivo!=null &&
              this.nombreArchivo.equals(other.getNombreArchivo()))) &&
            ((this.archivoBase64==null && other.getArchivoBase64()==null) || 
             (this.archivoBase64!=null &&
              java.util.Arrays.equals(this.archivoBase64, other.getArchivoBase64()))) &&
            ((this.autenticacion==null && other.getAutenticacion()==null) || 
             (this.autenticacion!=null &&
              this.autenticacion.equals(other.getAutenticacion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNombreArchivo() != null) {
            _hashCode += getNombreArchivo().hashCode();
        }
        if (getArchivoBase64() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArchivoBase64());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArchivoBase64(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutenticacion() != null) {
            _hashCode += getAutenticacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CargaTituloElectronicoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cargaTituloElectronicoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreArchivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "nombreArchivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivoBase64");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "archivoBase64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autenticacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "autenticacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "autenticacionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
