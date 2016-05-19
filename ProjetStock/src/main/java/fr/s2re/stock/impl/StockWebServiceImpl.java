/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.impl;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.s2re.stock.api.IStockWebService;
import fr.s2re.stock.dto.ProduitDto;
import fr.s2re.stock.entity.Produit;

/**
 * Implémentation pour le webservice de gestion du stock.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@WebService(targetNamespace = "http://webservice.stock.s2re.fr", endpointInterface = "fr.s2re.stock.api.IStockWebService", serviceName = "webServiceStock")
public class StockWebServiceImpl implements IStockWebService {

    /**
     * Pour faire du log.
     */
    private static final Logger LOGGER = Logger.getLogger(StockWebServiceImpl.class);
    /**
     * Pour faire les requetes.
     */
    private SessionFactory sessionFactory;
    /**
     * Pour récupérer un produit via sa référence.
     */
    private static final String GET_PRODUIT_BY_REFERENCE = "FROM Produit p WHERE p.reference = :reference";

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Produit getProduitByReference(final String paramReference) {
        LOGGER.debug("Méthode WebService getProduitByReference");
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(GET_PRODUIT_BY_REFERENCE);
        query.setParameter("reference", paramReference);
        return (Produit) query.uniqueResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Produit updateProduit(final ProduitDto paramProduit) {
        return null;
    }

    /**
     * Accesseur en écriture du champ <code>sessionFactory</code>.
     * @param paramSessionFactory la valeur à écrire dans <code>sessionFactory</code>.
     */
    @Autowired
    public void setSessionFactory(SessionFactory paramSessionFactory) {
        sessionFactory = paramSessionFactory;
    }


}
