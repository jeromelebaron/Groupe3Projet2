package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ImageDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.ibusiness.IBusinessImage;
@Remote(IBusinessImage.class)
@Stateless
public class BusinessImage implements IBusinessImage{
	@Override
	public List<ImageDto> getAll() {
		return null;
	}
	@Override
	public List<ImageDto> getAll(ProduitDto paramProduit) {
		return null;
	}
}
