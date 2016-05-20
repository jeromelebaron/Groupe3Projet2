package fr.s2re.livraison.servicelivraison.test;

import org.apache.log4j.Logger;

import fr.s2re.banque.servicebanque.IServiceBanqueWebService;
import fr.s2re.banque.servicebanque.ServiceBanqueWS;

public class PaiementTest {
   private PaiementTest() {
	
   }
   private final static Logger LOGGER = Logger.getLogger(ServiceLivraisonTest.class);
	public static void main(String[] args) {
		  LOGGER.debug("Début des tests");
		 ServiceBanqueWS serviceBanque = new ServiceBanqueWS();
		 IServiceBanqueWebService serviceBanqueWS = serviceBanque.getServiceBanqueWebServiceImpPort();
		 
		 serviceBanqueWS.getSolde(1);
		 serviceBanqueWS.crediter(1, 100.0);
		 serviceBanqueWS.getSolde(1);
		 serviceBanqueWS.debiter(1, 50.0);
		 LOGGER.info(serviceBanqueWS.getCarteByCompte(1));
		serviceBanqueWS.getCompteByClient(1);
		 

	}

}
