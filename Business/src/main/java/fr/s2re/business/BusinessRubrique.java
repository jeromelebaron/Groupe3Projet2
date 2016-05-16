package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.RubriqueDto;
import fr.s2re.ibusiness.IBusinessRubrique;

@Remote(IBusinessRubrique.class)
@Stateless
public class BusinessRubrique implements IBusinessRubrique {
    @Override
    public RubriqueDto addRubrique(RubriqueDto paramRubrique) {
        return null;
    }

    @Override
    public RubriqueDto updateRubrique(RubriqueDto paramRubrique) {
        return null;
    }

    @Override
    public List<RubriqueDto> getAll() {
        return null;
    }

    @Override
    public List<RubriqueDto> getSousRubrique(RubriqueDto paramRubrique) {
        return null;
    }

    @Override
    public RubriqueDto getByLibelle(String paramLibelle) {
        return null;
    }
}