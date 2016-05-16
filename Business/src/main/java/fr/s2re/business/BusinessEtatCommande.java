package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.EtatCommandeDto;
import fr.s2re.ibusiness.IBusinessEtatCommande;

@Remote(IBusinessEtatCommande.class)
@Stateless
public class BusinessEtatCommande implements IBusinessEtatCommande {
    @Override
    public List<EtatCommandeDto> getAll() {
        return null;
    }

    @Override
    public EtatCommandeDto getById(Integer paramId) {
        return null;
    }

    @Override
    public List<EtatCommandeDto> getByLibelle(String paramLibelle) {
        return null;
    }
}