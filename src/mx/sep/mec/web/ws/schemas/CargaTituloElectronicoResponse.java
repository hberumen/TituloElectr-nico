/**
 * CargaTituloElectronicoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.sep.mec.web.ws.schemas;

public class CargaTituloElectronicoResponse  implements java.io.Serializable {
    private java.math.BigInteger numeroLote;

    private java.lang.String mensaje;

    public CargaTituloElectronicoResponse() {
    }

    public CargaTituloElectronicoResponse(
           java.math.BigInteger numeroLote,
           java.lang.String mensaje) {
           this.numeroLote = numeroLote;
           this.mensaje = mensaje;
    }


    /**
     * Gets the numeroLote value for this CargaTituloElectronicoResponse.
     * 
     * @return numeroLote
     */
    public java.math.BigInteger getNumeroLote() {
        return numeroLote;
    }


    /**
     * Sets the numeroLote value for this CargaTituloElectronicoResponse.
     * 
     * @param numeroLote
     */
    public void setNumeroLote(java.math.BigInteger numeroLote) {
        this.numeroLote = numeroLote;
    }


    /**
     * Gets the mensaje value for this CargaTituloElectronicoResponse.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this CargaTituloElectronicoResponse.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CargaTituloElectronicoResponse)) return false;
        CargaTituloElectronicoResponse other = (CargaTituloElectronicoResponse) obj;
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
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje())));
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
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CargaTituloElectronicoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cargaTituloElectronicoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "numeroLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
