package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.TypeReductionDto;
import fr.s2re.ibusiness.IBusinessTypeReduction;

@Remote(IBusinessTypeReduction.class)
@Stateless
public class BusinessTypeReduction implements IBusinessTypeReduction {
    @Override
    public List<TypeReductionDto> getAll() {
        return null;
    }

    @Override
    public TypeReductionDto getByLibelle(String paramLibelle) {
        return null;
    }
}