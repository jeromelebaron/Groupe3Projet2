package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.EtatProduit;
import fr.s2re.idao.IDaoEtatProduit;

@Remote(IDaoEtatProduit.class)
@Stateless
public class DaoEtatProduit implements IDaoEtatProduit {
    @Override
    public List<EtatProduit> getAll() {
        return null;
    }

    @Override
    public EtatProduit getById(Integer paramId) {
        return null;
    }

    @Override
    public EtatProduit getByLibelle(String paramLibelle) {
        return null;
    }
}