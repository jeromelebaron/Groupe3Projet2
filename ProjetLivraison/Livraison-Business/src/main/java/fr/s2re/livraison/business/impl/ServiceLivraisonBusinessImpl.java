/*
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.api.business.IServiceLivraisonBusiness;
import fr.s2re.api.data.IServiceLivraisonDao;
import fr.s2re.livraison.business.assembleur.EntityToDto;
import fr.s2re.livraison.dto.ServiceLivraisonDto;
import fr.s2re.livraison.entity.ServiceLivraison;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IServiceLivraisonBusiness.class)
@Stateless
public class ServiceLivraisonBusinessImpl implements IServiceLivraisonBusiness {

    @EJB
    private IServiceLivraisonDao serviceLivraisonDao;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByIdVille(final Integer paramIdVille) {
        final List<ServiceLivraison> lesServiceLivraison = serviceLivraisonDao
                .getServiceLivraisonByIdVille(paramIdVille);
        final List<ServiceLivraisonDto> lesServiceLivraisonDto = new ArrayList<>();
        for (ServiceLivraison localServiceLivraison : lesServiceLivraison) {
            final ServiceLivraisonDto serviceLivraisonDto = EntityToDto
                    .fromServiceLivraisonEntityToServiceLivraisonDto(localServiceLivraison);
            lesServiceLivraisonDto.add(serviceLivraisonDto);
        }
        return lesServiceLivraisonDto;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByITypeLivraison(
            Integer paramIdTypeLivraison) {
        return null;
    }

}
