/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.webservice.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.s2re.api.business.IServiceLivraisonBusiness;
import fr.s2re.api.webservice.IServiceLivraisonWebService;
import fr.s2re.livraison.dto.ServiceLivraisonDto;
import fr.s2re.livraison.entity.ServiceLivraison;

/**
 * Le webservice concernant le {@link ServiceLivraison}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IServiceLivraisonWebService.class)
@Stateless
@WebService(endpointInterface = "fr.s2re.api.webservice.IServiceLivraisonWebService", targetNamespace = "http://servicelivraison.livraison.s2re.fr", serviceName = "ServiceLivraisonWS")
public class ServiceLivraisonWebServiceImpl implements IServiceLivraisonWebService {

    /**
     * Pour faire du log.
     */
    private static final Logger LOGGER = Logger.getLogger(ServiceLivraisonWebServiceImpl.class);

    /**
     * Pour le business du {@link ServiceLivraison}.
     */
    @EJB
    private IServiceLivraisonBusiness serviceLivraisonBusiness;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByIdVille(final Integer paramIdVille) {
        LOGGER.debug("Méthode Webservice getServiceLivraisonByIdVille");
        return serviceLivraisonBusiness.getServiceLivraisonByIdVille(paramIdVille);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByIdTypeLivraison(
            final Integer paramIdTypeLivraison) {
        LOGGER.debug("Méthode Webservice getServiceLivraisonByIdTypeLivraison");
        return serviceLivraisonBusiness.getServiceLivraisonByIdTypeLivraison(paramIdTypeLivraison);
    }

}
