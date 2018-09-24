/**
 * DescargaTituloElectronicoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.sep.mec.web.ws.schemas;

public class DescargaTituloElectronicoResponse  implements java.io.Serializable {
    private java.math.BigInteger numeroLote;

    private java.lang.String mensaje;

    private byte[] titulosBase64;

    public DescargaTituloElectronicoResponse() {
    }

    public DescargaTituloElectronicoResponse(
           java.math.BigInteger numeroLote,
           java.lang.String mensaje,
           byte[] titulosBase64) {
           this.numeroLote = numeroLote;
           this.mensaje = mensaje;
           this.titulosBase64 = titulosBase64;
    }


    /**
     * Gets the numeroLote value for this DescargaTituloElectronicoResponse.
     * 
     * @return numeroLote
     */
    public java.math.BigInteger getNumeroLote() {
        return numeroLote;
    }


    /**
     * Sets the numeroLote value for this DescargaTituloElectronicoResponse.
     * 
     * @param numeroLote
     */
    public void setNumeroLote(java.math.BigInteger numeroLote) {
        this.numeroLote = numeroLote;
    }


    /**
     * Gets the mensaje value for this DescargaTituloElectronicoResponse.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this DescargaTituloElectronicoResponse.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the titulosBase64 value for this DescargaTituloElectronicoResponse.
     * 
     * @return titulosBase64
     */
    public byte[] getTitulosBase64() {
        return titulosBase64;
    }


    /**
     * Sets the titulosBase64 value for this DescargaTituloElectronicoResponse.
     * 
     * @param titulosBase64
     */
    public void setTitulosBase64(byte[] titulosBase64) {
        this.titulosBase64 = titulosBase64;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescargaTituloElectronicoResponse)) return false;
        DescargaTituloElectronicoResponse other = (DescargaTituloElectronicoResponse) obj;
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
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.titulosBase64==null && other.getTitulosBase64()==null) || 
             (this.titulosBase64!=null &&
              java.util.Arrays.equals(this.titulosBase64, other.getTitulosBase64())));
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
        if (getTitulosBase64() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitulosBase64());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitulosBase64(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescargaTituloElectronicoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">descargaTituloElectronicoResponse"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulosBase64");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "titulosBase64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
