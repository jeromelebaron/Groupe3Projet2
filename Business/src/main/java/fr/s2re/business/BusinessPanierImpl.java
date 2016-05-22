/**
 * Créé le 22 mai 2016 par Jérome LE BARON
 */
package fr.s2re.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.ibusiness.IBusinessPanier;

/**
 * Implémentation concernant le business du panier.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IBusinessPanier.class)
@Stateless
public class BusinessPanierImpl implements IBusinessPanier {



    /**
     * {@inheritDoc}
     */
    @Override
    public Map<LigneDeCommandeDto, Double> verifierPanier(
            List<LigneDeCommandeDto> paramLesLignesDeCommande) {
        Map<LigneDeCommandeDto, Double> lesLigneDeCommandeDto = new HashMap<>();
        return lesLigneDeCommandeDto;
    }


}
