package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.RubriqueDto;
import fr.s2re.dto.SujetDto;
import fr.s2re.dto.TypeSujetDto;
import fr.s2re.ibusiness.IBusinessSujet;
@Remote(IBusinessSujet.class)
@Stateless
public class BusinessSujet implements IBusinessSujet{
	@Override
	public SujetDto addSujet(SujetDto paramSujet) {
		return null;
	}
	@Override
	public SujetDto updateSujet(SujetDto paramSujet) {
		return null;
	}
	@Override
	public SujetDto closeSujet(SujetDto paramSujet) {
		return null;
	}
	@Override
	public SujetDto getById(Integer paramId) {
		return null;
	}
	@Override
	public List<SujetDto> getAll() {
		return null;
	}
	@Override
	public List<SujetDto> getByType(TypeSujetDto paramTypeSujet) {
		return null;
	}
	@Override
	public List<SujetDto> getByRubrique(RubriqueDto paramRubrique) {
		return null;
	}
	@Override
	public List<SujetDto> getByPublication(Boolean paramBoolean) {
		return null;
	}
}