package mx.sep.mec.web.ws.schemas;

public class TitulosPortTypeProxy implements mx.sep.mec.web.ws.schemas.TitulosPortType {
  private String _endpoint = null;
  private mx.sep.mec.web.ws.schemas.TitulosPortType titulosPortType = null;
  
  public TitulosPortTypeProxy() {
    _initTitulosPortTypeProxy();
  }
  
  public TitulosPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTitulosPortTypeProxy();
  }
  
  private void _initTitulosPortTypeProxy() {
    try {
      titulosPortType = (new mx.sep.mec.web.ws.schemas.TitulosPortTypeServiceLocator()).getTitulosPortTypeSoap11();
      if (titulosPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)titulosPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)titulosPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (titulosPortType != null)
      ((javax.xml.rpc.Stub)titulosPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.sep.mec.web.ws.schemas.TitulosPortType getTitulosPortType() {
    if (titulosPortType == null)
      _initTitulosPortTypeProxy();
    return titulosPortType;
  }
  
  public mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse cargaTituloElectronico(mx.sep.mec.web.ws.schemas.CargaTituloElectronicoRequest cargaTituloElectronicoRequest) throws java.rmi.RemoteException{
    if (titulosPortType == null)
      _initTitulosPortTypeProxy();
    return titulosPortType.cargaTituloElectronico(cargaTituloElectronicoRequest);
  }
  
  public mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse consultaProcesoTituloElectronico(mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoRequest consultaProcesoTituloElectronicoRequest) throws java.rmi.RemoteException{
    if (titulosPortType == null)
      _initTitulosPortTypeProxy();
    return titulosPortType.consultaProcesoTituloElectronico(consultaProcesoTituloElectronicoRequest);
  }
  
  public mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoResponse descargaTituloElectronico(mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoRequest descargaTituloElectronicoRequest) throws java.rmi.RemoteException{
    if (titulosPortType == null)
      _initTitulosPortTypeProxy();
    return titulosPortType.descargaTituloElectronico(descargaTituloElectronicoRequest);
  }
  
  public mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoResponse cancelaTituloElectronico(mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoRequest cancelaTituloElectronicoRequest) throws java.rmi.RemoteException{
    if (titulosPortType == null)
      _initTitulosPortTypeProxy();
    return titulosPortType.cancelaTituloElectronico(cancelaTituloElectronicoRequest);
  }
  
  
}