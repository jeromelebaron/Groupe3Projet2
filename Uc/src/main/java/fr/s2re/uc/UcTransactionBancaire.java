package fr.s2re.uc;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.CartePaiementDto;
import fr.s2re.iuc.IUcTransactionBancaire;

@Remote(IUcTransactionBancaire.class)
@Stateless
public class UcTransactionBancaire implements IUcTransactionBancaire {

    // Appel du webservice de paiement

    @Override
    public boolean validerPaiement(CartePaiementDto paramCartePaiementDto,
            double paramMontantTransaction) {
        return false;
    }

}
