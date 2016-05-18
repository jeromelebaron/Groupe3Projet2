/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.data.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.api.data.ICommandeDao;
import fr.s2re.livraison.entity.Commande;

/**
 * L'implémentation pour le dao des {@link Commande}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(ICommandeDao.class)
@Stateless
public class CommandeDaoImpl implements ICommandeDao {

    @PersistenceContext(name = "Livraison-Data")
    private EntityManager entityManager;

    @Override
    public Commande insertCommande(Commande paramCommande) {
        entityManager.persist(paramCommande);
        entityManager.flush();
        return paramCommande;
    }

}
