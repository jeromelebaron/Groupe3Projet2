package fr.s2re.ibusiness;

public interface IBusinessServicePaiement {
	
	boolean verifierSolde(String nomClient, double montantCommande);

}
