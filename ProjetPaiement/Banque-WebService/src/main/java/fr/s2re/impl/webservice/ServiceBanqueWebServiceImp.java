package fr.s2re.impl.webservice;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.s2re.api.webservice.IServiceBanqueWebService;
import fr.s2re.banque.api.business.ICompteBancaireBusiness;
import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;

@Remote(IServiceBanqueWebService.class)
@Stateless
@WebService(endpointInterface = "fr.s2re.api.webservice.IServiceBanqueWebService", targetNamespace = "http://servicebanque.banque.s2re.fr", serviceName = "ServiceBanqueWS")
public class ServiceBanqueWebServiceImp implements IServiceBanqueWebService {

	private Logger logger = Logger.getLogger(ServiceBanqueWebServiceImp.class);

	@EJB
	ICompteBancaireBusiness compteBancaireBusiness;

	@Override
	public void crediter(String code, Double montant) {
		logger.debug("crediter le solde");
		compteBancaireBusiness.crediter(code, montant);

	}

	@Override
	public void debiter(String code, Double montant) {
		logger.debug("debiter le solde");
		compteBancaireBusiness.debiter(code, montant);

	}

	@Override
	public double getSolde(String code) {
		logger.debug("recuperer le solde");
		return compteBancaireBusiness.getSolde(code);

	}

	@Override
	public boolean verifierSolde(int idCompte, double montantCommande) {
		logger.debug("verification du solde dans le compte client");
		return compteBancaireBusiness.verifierSolde(idCompte, montantCommande);
	}

	@Override
	public List<CompteBancaireDto> getCompteByClient(ClientDto client) {
		logger.debug("verification du solde dans le compte client");
		return compteBancaireBusiness.getCompteByClient(client);
	}

}
