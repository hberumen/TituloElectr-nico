/**
 * TitulosPortTypeServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.sep.mec.web.ws.schemas;

public class TitulosPortTypeServiceLocator extends org.apache.axis.client.Service implements mx.sep.mec.web.ws.schemas.TitulosPortTypeService {

    public TitulosPortTypeServiceLocator() {
    }


    public TitulosPortTypeServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TitulosPortTypeServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TitulosPortTypeSoap11
    private java.lang.String TitulosPortTypeSoap11_address = "https://metqa.siged.sep.gob.mx:443/met-ws/services/";

    public java.lang.String getTitulosPortTypeSoap11Address() {
        return TitulosPortTypeSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TitulosPortTypeSoap11WSDDServiceName = "TitulosPortTypeSoap11";

    public java.lang.String getTitulosPortTypeSoap11WSDDServiceName() {
        return TitulosPortTypeSoap11WSDDServiceName;
    }

    public void setTitulosPortTypeSoap11WSDDServiceName(java.lang.String name) {
        TitulosPortTypeSoap11WSDDServiceName = name;
    }

    public mx.sep.mec.web.ws.schemas.TitulosPortType getTitulosPortTypeSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TitulosPortTypeSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTitulosPortTypeSoap11(endpoint);
    }

    public mx.sep.mec.web.ws.schemas.TitulosPortType getTitulosPortTypeSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.sep.mec.web.ws.schemas.TitulosPortTypeSoap11Stub _stub = new mx.sep.mec.web.ws.schemas.TitulosPortTypeSoap11Stub(portAddress, this);
            _stub.setPortName(getTitulosPortTypeSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTitulosPortTypeSoap11EndpointAddress(java.lang.String address) {
        TitulosPortTypeSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.sep.mec.web.ws.schemas.TitulosPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.sep.mec.web.ws.schemas.TitulosPortTypeSoap11Stub _stub = new mx.sep.mec.web.ws.schemas.TitulosPortTypeSoap11Stub(new java.net.URL(TitulosPortTypeSoap11_address), this);
                _stub.setPortName(getTitulosPortTypeSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TitulosPortTypeSoap11".equals(inputPortName)) {
            return getTitulosPortTypeSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "TitulosPortTypeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "TitulosPortTypeSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TitulosPortTypeSoap11".equals(portName)) {
            setTitulosPortTypeSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
