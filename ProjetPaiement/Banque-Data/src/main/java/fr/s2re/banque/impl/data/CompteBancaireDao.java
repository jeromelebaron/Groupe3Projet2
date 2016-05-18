package fr.s2re.banque.impl.data;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import fr.s2re.banque.api.data.ICompteBancaireDao;
import fr.s2re.banque.entity.Client;
import fr.s2re.banque.entity.Comptebancaire;
import fr.s2re.banque.entity.Credit;
import fr.s2re.banque.entity.Debit;
@Remote(ICompteBancaireDao.class)
@Stateless
public class CompteBancaireDao implements ICompteBancaireDao {
	@PersistenceContext(unitName="Banque-Entity")
	EntityManager em;

	@Override
	public double getSolde(String code) {
		Comptebancaire compte = em.find(Comptebancaire.class, code);
		return compte.getSolde(); 
	}

	@Override
	public boolean verifierSolde(int idCompte, double montantCommande) {
		Comptebancaire compte = em.find(Comptebancaire.class, idCompte);
		if(compte.getSolde() <=montantCommande){
			return false;
		}
		if(compte.getSolde() >montantCommande){
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comptebancaire> getCompteByClient(Client paramClient) {
		javax.persistence.Query req = em.createQuery("SELECT c FROM Comptebancaire c WHERE c.client = :paramClient");
		return req.getResultList();
	}

	@Override
	public void crediter(String code, Double montant) {
		if(montant <=0) throw new RuntimeException( "le montant doit etre supérieur à 0)");
		Comptebancaire compte = em.find(Comptebancaire.class, code);
		compte.setSolde((compte.getSolde()) + montant);
		compte.addOperationbancaire(new Credit(montant,compte));
		em.persist(compte);	
	}

	@Override
	public void debiter(String code, Double montant) {
		if(montant <=0) throw new RuntimeException( "le montant doit etre supérieur à 0)");
		Comptebancaire compte = em.find(Comptebancaire.class, code);
		if(compte.getSolde() <=montant) throw new RuntimeException("le solde est insuffisant");
		compte.setSolde((compte.getSolde()-montant));
		compte.addOperationbancaire(new Debit(montant,compte));
		em.persist(compte);

	}

}
