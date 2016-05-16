package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.MarqueDto;
import fr.s2re.ibusiness.IBusinessMarque;

@Remote(IBusinessMarque.class)
@Stateless
public class BusinessMarque implements IBusinessMarque {
    @Override
    public List<MarqueDto> getAll() {
        return null;
    }

    @Override
    public MarqueDto getByLibelle(String paramLibelle) {
        return null;
    }

    @Override
    public MarqueDto add(MarqueDto paramMarque) {
        return null;
    }
}