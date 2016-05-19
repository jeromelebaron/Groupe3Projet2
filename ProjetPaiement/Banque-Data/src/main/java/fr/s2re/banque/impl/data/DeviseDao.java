package fr.s2re.banque.impl.data;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.banque.api.data.IDeviseDao;
import fr.s2re.banque.entity.Devise;

@Remote(IDeviseDao.class)
@Stateless
public class DeviseDao implements IDeviseDao {

private static DeviseDao uniqueInstance = null;
	
	public static DeviseDao getInstance(){
		if(uniqueInstance==null) {
			uniqueInstance=new DeviseDao();
		}
		return uniqueInstance;
	}
	
	@PersistenceContext(unitName="Banque-Data")
	EntityManager em;
	
	@Override
	public Devise getDeviseByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Devise> getAllDevises() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDevise(Devise d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDevise(String code) {
		// TODO Auto-generated method stub
		
	}

}
