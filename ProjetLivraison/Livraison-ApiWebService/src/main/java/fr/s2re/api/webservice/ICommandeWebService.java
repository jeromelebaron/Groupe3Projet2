/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.api.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.s2re.livraison.dto.CommandeDto;

@WebService(targetNamespace = "http://commande.livraison.s2re.fr")
public interface ICommandeWebService {

    @WebMethod(operationName = "insertCommande")
    @WebResult(name = "commandeInseree")
    CommandeDto insertCommande(@WebParam(name = "paramCommande") CommandeDto paramCommandeDto);

}
