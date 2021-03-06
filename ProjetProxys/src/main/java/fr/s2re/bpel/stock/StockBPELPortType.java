
package fr.s2re.bpel.stock;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StockBPELPortType", targetNamespace = "http://stock.bpel.s2re.fr")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    fr.s2re.bpel.stock.ObjectFactory.class,
    fr.s2re.stock.webservice.ObjectFactory.class
})
public interface StockBPELPortType {


    /**
     * 
     * @param payload
     * @return
     *     returns fr.s2re.bpel.stock.StockBPELResponse
     */
    @WebMethod(action = "http://stock.bpel.s2re.fr/process")
    @WebResult(name = "StockBPELResponse", targetNamespace = "http://stock.bpel.s2re.fr", partName = "payload")
    public StockBPELResponse process(
        @WebParam(name = "StockBPELRequest", targetNamespace = "http://stock.bpel.s2re.fr", partName = "payload")
        StockBPELRequest payload);

}
