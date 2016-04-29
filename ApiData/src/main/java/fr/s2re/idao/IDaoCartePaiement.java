package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.CartePaiement;
import fr.s2re.entity.Client;
import fr.s2re.entity.Utilisateur;

public interface IDaoCartePaiement {
	CartePaiement addCarte (CartePaiement paramCartePaiement);
	CartePaiement deleteCarte (CartePaiement paramCartePaiement);
	CartePaiement getById (Integer paramId);
	List<CartePaiement> getByClient(Client paramClient);
}