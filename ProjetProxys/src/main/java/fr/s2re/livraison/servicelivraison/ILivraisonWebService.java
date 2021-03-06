
package fr.s2re.livraison.servicelivraison;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ILivraisonWebService", targetNamespace = "http://servicelivraison.livraison.s2re.fr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ILivraisonWebService {


    /**
     * 
     * @param paramCommande
     * @return
     *     returns fr.s2re.livraison.servicelivraison.CommandeDto
     */
    @WebMethod
    @WebResult(name = "commandeInseree", targetNamespace = "")
    @RequestWrapper(localName = "insertCommande", targetNamespace = "http://servicelivraison.livraison.s2re.fr", className = "fr.s2re.livraison.servicelivraison.InsertCommande")
    @ResponseWrapper(localName = "insertCommandeResponse", targetNamespace = "http://servicelivraison.livraison.s2re.fr", className = "fr.s2re.livraison.servicelivraison.InsertCommandeResponse")
    public CommandeDto insertCommande(
        @WebParam(name = "paramCommande", targetNamespace = "")
        CommandeDto paramCommande);

    /**
     * 
     * @param paramIdTypeLivraison
     * @return
     *     returns java.util.List<fr.s2re.livraison.servicelivraison.ServiceLivraisonDto>
     */
    @WebMethod
    @WebResult(name = "listeResultatServiceLivraisonByIdTypeLivraison", targetNamespace = "")
    @RequestWrapper(localName = "getServiceLivraisonByIdTypeLivraison", targetNamespace = "http://servicelivraison.livraison.s2re.fr", className = "fr.s2re.livraison.servicelivraison.GetServiceLivraisonByIdTypeLivraison")
    @ResponseWrapper(localName = "getServiceLivraisonByIdTypeLivraisonResponse", targetNamespace = "http://servicelivraison.livraison.s2re.fr", className = "fr.s2re.livraison.servicelivraison.GetServiceLivraisonByIdTypeLivraisonResponse")
    public List<ServiceLivraisonDto> getServiceLivraisonByIdTypeLivraison(
        @WebParam(name = "paramIdTypeLivraison", targetNamespace = "")
        Integer paramIdTypeLivraison);

    /**
     * 
     * @param paramCpVille
     * @return
     *     returns java.util.List<fr.s2re.livraison.servicelivraison.ServiceLivraisonDto>
     */
    @WebMethod
    @WebResult(name = "listeResultatServiceLivraisoncodePostalVille", targetNamespace = "")
    @RequestWrapper(localName = "getServiceLivraisonByCodePostalVille", targetNamespace = "http://servicelivraison.livraison.s2re.fr", className = "fr.s2re.livraison.servicelivraison.GetServiceLivraisonByCodePostalVille")
    @ResponseWrapper(localName = "getServiceLivraisonByCodePostalVilleResponse", targetNamespace = "http://servicelivraison.livraison.s2re.fr", className = "fr.s2re.livraison.servicelivraison.GetServiceLivraisonByCodePostalVilleResponse")
    public List<ServiceLivraisonDto> getServiceLivraisonByCodePostalVille(
        @WebParam(name = "paramCpVille", targetNamespace = "")
        String paramCpVille);

}
