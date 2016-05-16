package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.CodeReductionDto;
import fr.s2re.dto.TypeReductionDto;
import fr.s2re.ibusiness.IBusinessCodeReduction;

@Remote(IBusinessCodeReduction.class)
@Stateless
public class BusinessCodeReduction implements IBusinessCodeReduction {
    @Override
    public List<CodeReductionDto> getAll() {
        return null;
    }

    @Override
    public List<CodeReductionDto> getByType(TypeReductionDto paramTypeReduc) {
        return null;
    }

    @Override
    public CodeReductionDto add(CodeReductionDto paramCodeReduction) {
        return null;
    }
}