/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.impl;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.s2re.stock.api.IStockWebService;
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
     * {@inheritDoc}
     */
    @Override
    public Produit getProduitByReference(String paramReference) {
        LOGGER.debug("Méthode WebService getProduitByReference");
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Produit updateProduit(Produit paramProduit) {
        LOGGER.debug("Méthode WebService updateProduit");
        return null;
    }

}
