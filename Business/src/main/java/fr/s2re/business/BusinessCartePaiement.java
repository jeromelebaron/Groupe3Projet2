package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.CartePaiementDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.ibusiness.IBusinessCartePaiement;

@Remote(IBusinessCartePaiement.class)
@Stateless
public class BusinessCartePaiement implements IBusinessCartePaiement {
    @Override
    public CartePaiementDto addCarte(CartePaiementDto paramCartePaiement) {
        return null;
    }

    @Override
    public CartePaiementDto deleteCarte(CartePaiementDto paramCartePaiement) {
        return null;
    }

    @Override
    public CartePaiementDto getById(Integer paramId) {
        return null;
    }

    @Override
    public List<CartePaiementDto> getByClient(ClientDto paramClient) {
        return null;
    }
}