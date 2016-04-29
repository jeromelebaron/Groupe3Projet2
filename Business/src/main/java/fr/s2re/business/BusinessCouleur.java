package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.CouleurDto;
import fr.s2re.ibusiness.IBusinessCouleur;
@Remote(IBusinessCouleur.class)
@Stateless
public class BusinessCouleur implements IBusinessCouleur{
	@Override
	public List<CouleurDto> getAll() {
		return null;
	}
	@Override
	public CouleurDto getByLibelle(String paramLibelle) {
		return null;
	}
}