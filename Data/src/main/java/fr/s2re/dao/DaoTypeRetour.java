package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.TypeRetour;
import fr.s2re.idao.IDaoTypeRetour;

@Remote(IDaoTypeRetour.class)
@Stateless
public class DaoTypeRetour implements IDaoTypeRetour {
    @Override
    public List<TypeRetour> getAll() {
        return null;
    }

    @Override
    public TypeRetour getByLibelle(String paramLibelle) {
        return null;
    }
}