package fr.s2re.banque.api.business;

import java.util.List;

import fr.s2re.banque.dto.CarteBancaireDto;

public interface ICarteBancaireBusiness {
	List<CarteBancaireDto> getCarteByCompte(Integer idCompte);

}
