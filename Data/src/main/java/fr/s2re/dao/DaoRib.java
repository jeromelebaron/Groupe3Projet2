package fr.s2re.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Client;
import fr.s2re.entity.Rib;
import fr.s2re.idao.IDaoRib;
@Remote(IDaoRib.class)
@Stateless
public class DaoRib implements IDaoRib{
	@Override
	public Rib addRib(Rib paramRib) {
		return null;
	}
	@Override
	public Rib updateRib(Rib paramRib) {
		return null;
	}
	@Override
	public Rib getByClient(Client paramClient) {
		return null;
	}
}