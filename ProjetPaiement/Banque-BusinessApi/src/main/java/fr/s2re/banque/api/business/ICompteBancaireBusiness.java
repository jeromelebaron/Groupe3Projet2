package fr.s2re.banque.api.business;

import java.util.List;

import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;

public interface ICompteBancaireBusiness {
	boolean verifierSolde(String nomClient, double montantCommande);
	List<CompteBancaireDto> getCompteByClient(Integer idClient);
}
