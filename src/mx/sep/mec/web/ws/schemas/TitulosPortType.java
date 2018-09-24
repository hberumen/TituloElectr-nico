/**
 * TitulosPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.sep.mec.web.ws.schemas;

public interface TitulosPortType extends java.rmi.Remote {
    public mx.sep.mec.web.ws.schemas.CargaTituloElectronicoResponse cargaTituloElectronico(mx.sep.mec.web.ws.schemas.CargaTituloElectronicoRequest cargaTituloElectronicoRequest) throws java.rmi.RemoteException;
    public mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoResponse consultaProcesoTituloElectronico(mx.sep.mec.web.ws.schemas.ConsultaProcesoTituloElectronicoRequest consultaProcesoTituloElectronicoRequest) throws java.rmi.RemoteException;
    public mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoResponse descargaTituloElectronico(mx.sep.mec.web.ws.schemas.DescargaTituloElectronicoRequest descargaTituloElectronicoRequest) throws java.rmi.RemoteException;
    public mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoResponse cancelaTituloElectronico(mx.sep.mec.web.ws.schemas.CancelaTituloElectronicoRequest cancelaTituloElectronicoRequest) throws java.rmi.RemoteException;
}
