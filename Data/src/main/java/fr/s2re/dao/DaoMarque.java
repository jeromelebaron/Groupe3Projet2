package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Marque;
import fr.s2re.idao.IDaoMarque;

@Remote(IDaoMarque.class)
@Stateless
public class DaoMarque implements IDaoMarque {
    @Override
    public List<Marque> getAll() {
        return null;
    }

    @Override
    public Marque getByLibelle(String paramLibelle) {
        return null;
    }

    @Override
    public Marque add(Marque paramMarque) {
        return null;
    }
}