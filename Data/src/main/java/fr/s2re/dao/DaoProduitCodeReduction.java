package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Produit;
import fr.s2re.entity.ProduitCodeReduction;
import fr.s2re.idao.IDaoProduitCodeReduction;
@Remote(IDaoProduitCodeReduction.class)
@Stateless
public class DaoProduitCodeReduction implements IDaoProduitCodeReduction{
	@Override
	public ProduitCodeReduction addPdtCodeReduc(
			ProduitCodeReduction paramPdtCodeReduc) {
		return null;
	}
	@Override
	public List<ProduitCodeReduction> getAll() {
		return null;
	}
	@Override
	public List<ProduitCodeReduction> getByProduit(Produit paramProduit) {
		return null;
	}
}