package fr.s2re.business;

import fr.s2re.banque.servicebanque.IServiceBanqueWebService;
import fr.s2re.banque.servicebanque.ServiceBanqueWS;
import fr.s2re.ibusiness.IBusinessServicePaiement;

public class BusinessServicePaiementImpl implements IBusinessServicePaiement {

	@Override
	public boolean verifierSolde(String nomClient, double montantCommande) {
		ServiceBanqueWS serviceBanque = new ServiceBanqueWS();
		IServiceBanqueWebService proxy = serviceBanque.getServiceBanqueWebServiceImpPort();
		boolean disponibiliteSolde = proxy.verifierSolde(nomClient, montantCommande);
		return disponibiliteSolde;
	}

}
