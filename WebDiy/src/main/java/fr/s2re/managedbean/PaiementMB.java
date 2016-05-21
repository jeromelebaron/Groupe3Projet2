/**
 * Créé le 21 mai 2016 par Jérome LE BARON
 */
package fr.s2re.managedbean;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;

import fr.s2re.dto.CartePaiementDto;
import fr.s2re.iuc.IUcTransactionBancaire;

/**
 * Pour réaliser les actions de paiement.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@ManagedBean
@SessionScoped
public class PaiementMB {

    /**
     * Pour effectuer la transation bancaire
     */
    @EJB
    private IUcTransactionBancaire ucTransactionBancaire;

    /**
     * La carte bancaire pour la transaction
     */
    private CartePaiementDto cartePaiementDto;

    /**
     * Pour effectuer le paiement.
     * @return sur la page de confirmation de la commande.
     */
    public String payer() {
        return "";
    }

    /**
     * Accesseur en lecture du champ <code>cartePaiementDto</code>.
     * @return le champ <code>cartePaiementDto</code>.
     */
    public CartePaiementDto getCartePaiementDto() {
        return cartePaiementDto;
    }

    /**
     * Accesseur en écriture du champ <code>cartePaiementDto</code>.
     * @param paramCartePaiementDto la valeur à écrire dans <code>cartePaiementDto</code>.
     */
    public void setCartePaiementDto(CartePaiementDto paramCartePaiementDto) {
        cartePaiementDto = paramCartePaiementDto;
    }

    /**
     * Accesseur en lecture du champ <code>ucTransactionBancaire</code>.
     * @return le champ <code>ucTransactionBancaire</code>.
     */
    public IUcTransactionBancaire getUcTransactionBancaire() {
        return ucTransactionBancaire;
    }

    /**
     * Accesseur en écriture du champ <code>ucTransactionBancaire</code>.
     * @param paramUcTransactionBancaire la valeur à écrire dans <code>ucTransactionBancaire</code>.
     */
    public void setUcTransactionBancaire(IUcTransactionBancaire paramUcTransactionBancaire) {
        ucTransactionBancaire = paramUcTransactionBancaire;
    }

}
