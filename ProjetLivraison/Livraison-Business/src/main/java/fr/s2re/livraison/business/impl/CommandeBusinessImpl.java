/*
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.business.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.api.business.ICommandeBusiness;
import fr.s2re.api.data.ICommandeDao;
import fr.s2re.livraison.business.assembleur.DtoToEntity;
import fr.s2re.livraison.dto.CommandeDto;
import fr.s2re.livraison.entity.Commande;

/**
 * L'implémentation pour le business des {@link Commande}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(ICommandeBusiness.class)
@Stateless
public class CommandeBusinessImpl implements ICommandeBusiness {

    @EJB
    private ICommandeDao commandeDao;

    /**
     * {@inheritDoc}
     */
    @Override
    public CommandeDto insertCommande(CommandeDto paramCommande) {
        Commande commande = DtoToEntity.fromCommandeDtoToCommandeEntity(paramCommande);
        commandeDao.insertCommande(commande);
        paramCommande.setId(commande.getId());
        return paramCommande;
    }

}
