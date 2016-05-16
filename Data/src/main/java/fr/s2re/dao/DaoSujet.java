package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Rubrique;
import fr.s2re.entity.Sujet;
import fr.s2re.entity.TypeSujet;
import fr.s2re.idao.IDaoSujet;

@Remote(IDaoSujet.class)
@Stateless
public class DaoSujet implements IDaoSujet {
    @Override
    public Sujet addSujet(Sujet paramSujet) {
        return null;
    }

    @Override
    public Sujet updateSujet(Sujet paramSujet) {
        return null;
    }

    @Override
    public Sujet closeSujet(Sujet paramSujet) {
        return null;
    }

    @Override
    public Sujet getById(Integer paramId) {
        return null;
    }

    @Override
    public List<Sujet> getAll() {
        return null;
    }

    @Override
    public List<Sujet> getByType(TypeSujet paramTypeSujet) {
        return null;
    }

    @Override
    public List<Sujet> getByRubrique(Rubrique paramRubrique) {
        return null;
    }

    @Override
    public List<Sujet> getByPublication(Boolean paramBoolean) {
        return null;
    }
}