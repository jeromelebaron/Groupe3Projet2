package fr.s2re.banque.api.business;

import java.util.List;

import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;

public interface ICompteBancaireBusiness {
	void crediter (Integer idCompte, Double montant);
	void debiter (Integer idCompte, Double montant);
	double getSolde(Integer paramIdCompte);
	boolean verifierSolde(int idCompte, double montantCommande);
	List<CompteBancaireDto> getCompteByClient(Integer idClient);
}
