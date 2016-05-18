package fr.s2re.banque.api.data;

import java.util.List;

import fr.s2re.banque.entity.Client;
import fr.s2re.banque.entity.Comptebancaire;

public interface ICompteBancaireDao {
	void crediter (String code, Double montant);
	void debiter (String code, Double montant);
	double getSolde(String code);
	boolean verifierSolde(int idCompte, double montantCommande);
	List<Comptebancaire> getCompteByClient(Client client);
}
