/**
 * CancelaTituloElectronicoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.sep.mec.web.ws.schemas;

public class CancelaTituloElectronicoRequest  implements java.io.Serializable {
    private java.lang.String folioControl;

    private java.lang.String motCancelacion;

    private mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion;

    public CancelaTituloElectronicoRequest() {
    }

    public CancelaTituloElectronicoRequest(
           java.lang.String folioControl,
           java.lang.String motCancelacion,
           mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion) {
           this.folioControl = folioControl;
           this.motCancelacion = motCancelacion;
           this.autenticacion = autenticacion;
    }


    /**
     * Gets the folioControl value for this CancelaTituloElectronicoRequest.
     * 
     * @return folioControl
     */
    public java.lang.String getFolioControl() {
        return folioControl;
    }


    /**
     * Sets the folioControl value for this CancelaTituloElectronicoRequest.
     * 
     * @param folioControl
     */
    public void setFolioControl(java.lang.String folioControl) {
        this.folioControl = folioControl;
    }


    /**
     * Gets the motCancelacion value for this CancelaTituloElectronicoRequest.
     * 
     * @return motCancelacion
     */
    public java.lang.String getMotCancelacion() {
        return motCancelacion;
    }


    /**
     * Sets the motCancelacion value for this CancelaTituloElectronicoRequest.
     * 
     * @param motCancelacion
     */
    public void setMotCancelacion(java.lang.String motCancelacion) {
        this.motCancelacion = motCancelacion;
    }


    /**
     * Gets the autenticacion value for this CancelaTituloElectronicoRequest.
     * 
     * @return autenticacion
     */
    public mx.sep.mec.web.ws.schemas.AutenticacionType getAutenticacion() {
        return autenticacion;
    }


    /**
     * Sets the autenticacion value for this CancelaTituloElectronicoRequest.
     * 
     * @param autenticacion
     */
    public void setAutenticacion(mx.sep.mec.web.ws.schemas.AutenticacionType autenticacion) {
        this.autenticacion = autenticacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelaTituloElectronicoRequest)) return false;
        CancelaTituloElectronicoRequest other = (CancelaTituloElectronicoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folioControl==null && other.getFolioControl()==null) || 
             (this.folioControl!=null &&
              this.folioControl.equals(other.getFolioControl()))) &&
            ((this.motCancelacion==null && other.getMotCancelacion()==null) || 
             (this.motCancelacion!=null &&
              this.motCancelacion.equals(other.getMotCancelacion()))) &&
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
        if (getFolioControl() != null) {
            _hashCode += getFolioControl().hashCode();
        }
        if (getMotCancelacion() != null) {
            _hashCode += getMotCancelacion().hashCode();
        }
        if (getAutenticacion() != null) {
            _hashCode += getAutenticacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelaTituloElectronicoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cancelaTituloElectronicoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "folioControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motCancelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "motCancelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
