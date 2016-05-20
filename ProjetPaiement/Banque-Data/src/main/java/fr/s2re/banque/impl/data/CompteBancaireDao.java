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
	@PersistenceContext(unitName="Banque-Data")
	EntityManager em;

	/*@Override
	public double getSolde(Integer paramIdCompte) {
		Comptebancaire compte = em.find(Comptebancaire.class, paramIdCompte);
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
*/
	@SuppressWarnings("unchecked")
	@Override
	public List<Comptebancaire> getCompteByClient(Integer idClient) {
		javax.persistence.Query req = em.createQuery("Select distinct c FROM Comptebancaire c WHERE c.client.idClient = :idClient");
		req.setParameter("idClient", idClient);
		return req.getResultList();
	}

/*	@Override
	public void crediter( Integer idCompte, Double montant) {
		if(montant <=0) throw new RuntimeException( "le montant doit etre supérieur à 0)");
		Comptebancaire compte = em.find(Comptebancaire.class, idCompte);
		compte.setSolde((compte.getSolde()) + montant);
		compte.addOperationbancaire(new Credit(montant,compte));
		em.persist(compte);	
	}

	@Override
	public void debiter(Integer idCompte, Double montant) {
		if(montant <=0) throw new RuntimeException( "le montant doit etre supérieur à 0)");
		Comptebancaire compte = em.find(Comptebancaire.class, idCompte);
		if(compte.getSolde() <=montant) throw new RuntimeException("le solde est insuffisant");
		compte.setSolde((compte.getSolde()-montant));
		compte.addOperationbancaire(new Debit(montant,compte));
		em.persist(compte);

	}*/

}
