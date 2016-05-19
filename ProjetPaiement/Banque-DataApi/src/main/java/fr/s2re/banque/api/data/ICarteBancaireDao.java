package fr.s2re.banque.api.data;

import java.util.List;

import fr.s2re.banque.entity.Cartebancaire;

public interface ICarteBancaireDao {

	List<Cartebancaire> getCarteByCompte(Integer idCompte);
}
