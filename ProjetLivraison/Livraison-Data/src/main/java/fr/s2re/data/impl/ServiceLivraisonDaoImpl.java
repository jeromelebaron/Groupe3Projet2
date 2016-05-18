/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.s2re.api.data.IServiceLivraisonDao;
import fr.s2re.livraison.entity.ServiceLivraison;
import fr.s2re.livraison.entity.TypeLivraison;

/**
 * Pour l'accès à la bdd concernant le {@link ServiceLivraison}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class ServiceLivraisonDaoImpl implements IServiceLivraisonDao {

    @PersistenceContext(name = "Livraison-Data")
    private EntityManager entityManager;

    /**
     * La requête HQL pour récupérer les {@link ServiceLivraison} par ville.
     */
    private static final String REQUETE_FIND_SERVICE_LIVRAISON_BY_VILLE = "FROM ServiceLivraison s WHERE s.adresseLocalisation.ville.id = :idVille";
    /**
     * La requête HQL pour récupérer les {@link ServiceLivraison} par {@link TypeLivraison}.
     */
    private static final String REQUETE_FIND_SERVICE_LIVRAISON_BY_TYPE_LIVRAISON = "FROM ServiceLivraison s WHERE s.typeLivraison..id = :idTypeLivraison";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraison> getServiceLivraisonByIdVille(final Integer paramIdVille) {
        final TypedQuery<ServiceLivraison> queryFindServiceLivraisonByVille = entityManager
                .createQuery(REQUETE_FIND_SERVICE_LIVRAISON_BY_VILLE, ServiceLivraison.class);
        queryFindServiceLivraisonByVille.setParameter("idVille", paramIdVille);
        return queryFindServiceLivraisonByVille.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraison> getServiceLivraisonByTypeLivraison(
            final Integer paramIdTypeLivraison) {
        final TypedQuery<ServiceLivraison> queryFindServiceLivraisonByTypeLivraison = entityManager
                .createQuery(REQUETE_FIND_SERVICE_LIVRAISON_BY_TYPE_LIVRAISON,
                        ServiceLivraison.class);
        queryFindServiceLivraisonByTypeLivraison.setParameter("idTypeLivraison",
                paramIdTypeLivraison);
        return queryFindServiceLivraisonByTypeLivraison.getResultList();
    }

}
