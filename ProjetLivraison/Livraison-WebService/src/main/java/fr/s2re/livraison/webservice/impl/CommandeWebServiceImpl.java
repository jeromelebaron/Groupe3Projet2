/*
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.webservice.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.s2re.api.business.ICommandeBusiness;
import fr.s2re.api.webservice.ICommandeWebService;
import fr.s2re.livraison.dto.CommandeDto;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(ICommandeWebService.class)
@Stateless
@WebService(endpointInterface = "fr.s2re.api.webservice.ICommandeWebService", targetNamespace = "http://commande.livraison.s2re.fr", serviceName = "CommandeWS")
public class CommandeWebServiceImpl implements ICommandeWebService {

    private Logger logger = Logger.getLogger(ServiceLivraisonWebServiceImpl.class);

    @EJB
    private ICommandeBusiness commandeBusiness;

    /**
     * {@inheritDoc}
     */
    @Override
    public CommandeDto insertCommande(CommandeDto paramCommandeDto) {
        logger.debug("Méthode WebService insertCommande");
        return commandeBusiness.insertCommande(paramCommandeDto);
    }

}
