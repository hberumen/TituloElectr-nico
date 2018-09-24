/**
 * ConsultaProcesoTituloElectronicoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.sep.mec.web.ws.schemas;

public class ConsultaProcesoTituloElectronicoRequest  implements java.io.Serializable {
    private java.math.BigInteger numeroLote;

    private mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion;

    public ConsultaProcesoTituloElectronicoRequest() {
    }

    public ConsultaProcesoTituloElectronicoRequest(
           java.math.BigInteger numeroLote,
           mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion) {
           this.numeroLote = numeroLote;
           this.autenticacion = autenticacion;
    }


    /**
     * Gets the numeroLote value for this ConsultaProcesoTituloElectronicoRequest.
     * 
     * @return numeroLote
     */
    public java.math.BigInteger getNumeroLote() {
        return numeroLote;
    }


    /**
     * Sets the numeroLote value for this ConsultaProcesoTituloElectronicoRequest.
     * 
     * @param numeroLote
     */
    public void setNumeroLote(java.math.BigInteger numeroLote) {
        this.numeroLote = numeroLote;
    }


    /**
     * Gets the autenticacion value for this ConsultaProcesoTituloElectronicoRequest.
     * 
     * @return autenticacion
     */
    public mx.sep.mec.web.ws.schemas.AutenticacionType getAutenticacion() {
        return autenticacion;
    }


    /**
     * Sets the autenticacion value for this ConsultaProcesoTituloElectronicoRequest.
     * 
     * @param autenticacion
     */
    public void setAutenticacion(mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion) {
        this.autenticacion = autenticacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaProcesoTituloElectronicoRequest)) return false;
        ConsultaProcesoTituloElectronicoRequest other = (ConsultaProcesoTituloElectronicoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroLote==null && other.getNumeroLote()==null) || 
             (this.numeroLote!=null &&
              this.numeroLote.equals(other.getNumeroLote()))) &&
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
        if (getNumeroLote() != null) {
            _hashCode += getNumeroLote().hashCode();
        }
        if (getAutenticacion() != null) {
            _hashCode += getAutenticacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaProcesoTituloElectronicoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">consultaProcesoTituloElectronicoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "numeroLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
