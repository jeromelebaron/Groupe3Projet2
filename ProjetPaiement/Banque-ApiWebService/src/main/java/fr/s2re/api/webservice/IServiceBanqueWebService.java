package fr.s2re.api.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;

@WebService(targetNamespace = "http://servicebanque.banque.s2re.fr")
public interface IServiceBanqueWebService {
    @WebMethod(operationName="crediter")
	void crediter (@WebParam(name="paramCode")String code,@WebParam(name="paramMontant") Double montant);
    @WebMethod(operationName="debiter")
	void debiter (@WebParam(name="paramCode")String code,@WebParam(name="paramMontant") Double montant);
    @WebMethod(operationName="getSolde")
    @WebResult(name="le solde dans le compte")
	double getSolde(@WebParam(name="paramCode")String code);
    @WebMethod(operationName="verifierSolde")
	boolean verifierSolde(@WebParam(name="paramIdCompte")int idCompte, @WebParam(name="paramMontantCommande")double montantCommande);
	@WebMethod(operationName="getCompteByClient")
	@WebResult(name="liste des comptes bancaires du client")
    List<CompteBancaireDto> getCompteByClient(@WebParam(name="paramClient")ClientDto client);
	
}
