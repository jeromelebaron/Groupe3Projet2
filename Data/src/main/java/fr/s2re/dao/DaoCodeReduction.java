package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.CodeReduction;
import fr.s2re.entity.TypeReduction;
import fr.s2re.idao.IDaoCodeReduction;

@Remote(IDaoCodeReduction.class)
@Stateless
public class DaoCodeReduction implements IDaoCodeReduction {
    @Override
    public List<CodeReduction> getAll() {
        return null;
    }

    @Override
    public List<CodeReduction> getByType(TypeReduction paramTypeReduc) {
        return null;
    }

    @Override
    public CodeReduction add(CodeReduction paramCodeReduction) {
        return null;
    }
}