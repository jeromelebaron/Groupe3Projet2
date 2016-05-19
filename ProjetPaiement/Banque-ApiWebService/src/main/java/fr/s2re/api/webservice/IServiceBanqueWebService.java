package fr.s2re.api.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.s2re.banque.dto.CarteBancaireDto;
import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;

@WebService(targetNamespace = "http://servicebanque.banque.s2re.fr")
public interface IServiceBanqueWebService {
	//Services pour le Compte bancaire
    @WebMethod(operationName="crediter")
	void crediter (@WebParam(name="paramidCompte")Integer idCompte,@WebParam(name="paramMontant") Double montant);
    @WebMethod(operationName="debiter")
	void debiter (@WebParam(name="paramidCompte")Integer idCompte,@WebParam(name="paramMontant") Double montant);
    @WebMethod(operationName="getSolde")
	double getSolde(@WebParam(name="paramIdCompte")Integer paramIdCompte);
    @WebMethod(operationName="verifierSolde")
	boolean verifierSolde(@WebParam(name="paramIdCompte")int idCompte, @WebParam(name="paramMontantCommande")double montantCommande);
	@WebMethod(operationName="getCompteByClient")
    List<CompteBancaireDto> getCompteByClient(@WebParam(name="paramIdClient")Integer idClient);
	//Service pour le client
	@WebMethod(operationName="getCLientByNom")
	ClientDto getCLientByNom(@WebParam(name="paramNom")String nom);
	//Service pour la carte bancaire
	@WebMethod(operationName="getCarteByCompte")
	List<CarteBancaireDto> getCarteByCompte(@WebParam(name="paramidCompte")Integer idCompte);
	
}
