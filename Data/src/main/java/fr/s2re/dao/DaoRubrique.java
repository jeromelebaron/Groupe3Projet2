package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Rubrique;
import fr.s2re.idao.IDaoRubrique;
@Remote(IDaoRubrique.class)
@Stateless
public class DaoRubrique implements IDaoRubrique{
	@Override
	public Rubrique addRubrique(Rubrique paramRubrique) {
		return null;
	}
	@Override
	public Rubrique updateRubrique(Rubrique paramRubrique) {
		return null;
	}
	@Override
	public List<Rubrique> getAll() {
		return null;
	}
	@Override
	public List<Rubrique> getSousRubrique(Rubrique paramRubrique) {
		return null;
	}
	@Override
	public Rubrique getByLibelle(String paramLibelle) {
		return null;
	}
}