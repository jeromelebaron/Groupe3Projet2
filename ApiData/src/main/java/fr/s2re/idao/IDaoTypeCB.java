package fr.s2re.idao;

import java.util.List;

import javax.ejb.Local;

import fr.s2re.entity.TypeCB;
public interface IDaoTypeCB {
	List<TypeCB> getAll();
	TypeCB getByLibelle(String paramLibelle);
}