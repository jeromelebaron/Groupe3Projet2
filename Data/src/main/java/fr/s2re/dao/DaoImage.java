package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Image;
import fr.s2re.entity.Produit;
import fr.s2re.idao.IDaoImage;
@Remote(IDaoImage.class)
@Stateless
public class DaoImage implements IDaoImage{
	@Override
	public List<Image> getAll() {
		return null;
	}
	@Override
	public List<Image> getAll(Produit paramProduit) {
		return null;
	}
}
