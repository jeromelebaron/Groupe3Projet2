package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.EtatProduitDto;
import fr.s2re.ibusiness.IBusinessEtatProduit;
@Remote(IBusinessEtatProduit.class)
@Stateless
public class BusinessEtatProduit implements IBusinessEtatProduit{
	@Override
	public List<EtatProduitDto> getAll() {
		return null;
	}
	@Override
	public EtatProduitDto getById(Integer paramId) {
		return null;
	}
	@Override
	public EtatProduitDto getByLibelle(String paramLibelle) {
		return null;
	}
}