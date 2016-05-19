package fr.s2re.banque.api.data;

import java.util.List;

import fr.s2re.banque.entity.Client;
import fr.s2re.banque.entity.Comptebancaire;

public interface ICompteBancaireDao {
	void crediter ( Integer idCompte, Double montant);
	void debiter ( Integer idCompte, Double montant);
	double getSolde(Integer paramIdCompte);
	boolean verifierSolde(int idCompte, double montantCommande);
	List<Comptebancaire> getCompteByClient(Integer idClient);
}
