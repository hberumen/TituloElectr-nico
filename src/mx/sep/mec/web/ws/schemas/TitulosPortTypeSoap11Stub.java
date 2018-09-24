/**
 * TitulosPortTypeSoap11Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.sep.mec.web.ws.schemas;

public class TitulosPortTypeSoap11Stub extends org.apache.axis.client.Stub implements mx.sep.mec.web.ws.schemas.TitulosPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cargaTituloElectronico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "cargaTituloElectronicoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cargaTituloElectronicoRequest"), mx.sep.mec.web.ws.schemas.CargaTituloElectronicoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cargaTituloElectronicoResponse"));
        oper.setReturnClass(mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "cargaTituloElectronicoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaProcesoTituloElectronico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "consultaProcesoTituloElectronicoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">consultaProcesoTituloElectronicoRequest"), mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">consultaProcesoTituloElectronicoResponse"));
        oper.setReturnClass(mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "consultaProcesoTituloElectronicoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("descargaTituloElectronico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "descargaTituloElectronicoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">descargaTituloElectronicoRequest"), mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">descargaTituloElectronicoResponse"));
        oper.setReturnClass(mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "descargaTituloElectronicoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelaTituloElectronico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "cancelaTituloElectronicoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cancelaTituloElectronicoRequest"), mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cancelaTituloElectronicoResponse"));
        oper.setReturnClass(mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "cancelaTituloElectronicoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public TitulosPortTypeSoap11Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TitulosPortTypeSoap11Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TitulosPortTypeSoap11Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">>cargaTituloElectronicoRequest>nombreArchivo");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cancelaTituloElectronicoRequest");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cancelaTituloElectronicoResponse");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cargaTituloElectronicoRequest");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.CargaTituloElectronicoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">cargaTituloElectronicoResponse");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">consultaProcesoTituloElectronicoRequest");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">consultaProcesoTituloElectronicoResponse");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">descargaTituloElectronicoRequest");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", ">descargaTituloElectronicoResponse");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.web.mec.sep.mx/schemas", "autenticacionType");
            cachedSerQNames.add(qName);
            cls = mx.sep.mec.web.ws.schemas.AutenticacionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse cargaTituloElectronico(mx.sep.mec.web.ws.schemas.CargaTituloElectronicoRequest cargaTituloElectronicoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cargaTituloElectronico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cargaTituloElectronicoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse consultaProcesoTituloElectronico(mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoRequest consultaProcesoTituloElectronicoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultaProcesoTituloElectronico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaProcesoTituloElectronicoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoResponse descargaTituloElectronico(mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoRequest descargaTituloElectronicoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "descargaTituloElectronico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {descargaTituloElectronicoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoResponse cancelaTituloElectronico(mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoRequest cancelaTituloElectronicoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelaTituloElectronico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelaTituloElectronicoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
