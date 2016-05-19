/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.api.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.s2re.livraison.dto.CommandeDto;
import fr.s2re.livraison.dto.ServiceLivraisonDto;

@WebService(targetNamespace = "http://servicelivraison.livraison.s2re.fr")
public interface IServiceLivraisonWebService {

    @WebMethod(operationName = "getServiceLivraisonByIdVille")
    @WebResult(name = "listeResultatServiceLivraisonByIdVille")
    List<ServiceLivraisonDto> getServiceLivraisonByIdVille(
            @WebParam(name = "paramIdVille") Integer idVille);

    @WebMethod(operationName = "getServiceLivraisonByIdTypeLivraison")
    @WebResult(name = "listeResultatServiceLivraisonByIdTypeLivraison")
    List<ServiceLivraisonDto> getServiceLivraisonByIdTypeLivraison(
            @WebParam(name = "paramIdTypeLivraison") Integer idTypeLivraison);

    @WebMethod(operationName = "insertCommande")
    @WebResult(name = "commandeInseree")
    CommandeDto insertCommande(@WebParam(name = "paramCommande") CommandeDto paramCommandeDto);

    
}
