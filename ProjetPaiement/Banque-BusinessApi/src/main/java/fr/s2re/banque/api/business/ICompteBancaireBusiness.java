package fr.s2re.banque.api.business;

import java.util.List;

import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;

public interface ICompteBancaireBusiness {
	void crediter (String code, Double montant);
	void debiter (String code, Double montant);
	double getSolde(String code);
	boolean verifierSolde(int idCompte, double montantCommande);
	List<CompteBancaireDto> getCompteByClient(ClientDto client);
}
