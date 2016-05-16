package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.AlerteDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.ibusiness.IBusinessAlerte;

@Remote(IBusinessAlerte.class)
@Stateless
public class BusinessAlerte implements IBusinessAlerte {
    @Override
    public AlerteDto addAlerte(AlerteDto paramAlerte) {
        return null;
    }

    @Override
    public AlerteDto updateAlerte(AlerteDto paramAlerte) {
        return null;
    }

    @Override
    public List<AlerteDto> getAll() {
        return null;
    }

    @Override
    public AlerteDto getById(Integer paramId) {
        return null;
    }

    @Override
    public List<AlerteDto> getByObjet(Object paramObject) {
        return null;
    }

    @Override
    public List<AlerteDto> getByEmetteur(UtilisateurDto paramUtilisateur) {
        return null;
    }

    @Override
    public List<AlerteDto> getByObject(Object paramObj) {
        return null;
    }
}