package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.ObjetAlerte;
import fr.s2re.idao.IDaoObjetAlerte;

@Remote(IDaoObjetAlerte.class)
@Stateless
public class DaoObjetAlerte implements IDaoObjetAlerte {
    @Override
    public List<ObjetAlerte> getAll() {
        return null;
    }

    @Override
    public ObjetAlerte getByLibelle(String paramLibelle) {
        return null;
    }
}