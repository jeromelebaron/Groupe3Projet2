package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Alerte;
import fr.s2re.entity.Utilisateur;
import fr.s2re.idao.IDaoAlerte;

@Remote(IDaoAlerte.class)
@Stateless
public class DaoAlerte implements IDaoAlerte {
    @Override
    public Alerte addAlerte(Alerte paramAlerte) {
        return null;
    }

    @Override
    public Alerte updateAlerte(Alerte paramAlerte) {
        return null;
    }

    @Override
    public List<Alerte> getAll() {
        return null;
    }

    @Override
    public Alerte getById(Integer paramId) {
        return null;
    }

    @Override
    public List<Alerte> getByObjet(Object paramObject) {
        return null;
    }

    @Override
    public List<Alerte> getByEmetteur(Utilisateur paramUtilisateur) {
        return null;
    }

    @Override
    public List<Alerte> getByObject(Object paramObj) {
        return null;
    }
}