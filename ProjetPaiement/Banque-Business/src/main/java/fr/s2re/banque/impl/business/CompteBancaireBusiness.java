package fr.s2re.banque.impl.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.banque.api.business.ICompteBancaireBusiness;
import fr.s2re.banque.api.data.ICompteBancaireDao;
import fr.s2re.banque.assembleur.DtoToEntity;
import fr.s2re.banque.assembleur.EntityToDto;
import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;
import fr.s2re.banque.entity.Comptebancaire;

@Remote(ICompteBancaireBusiness.class)
@Stateless
public class CompteBancaireBusiness implements ICompteBancaireBusiness{
	@EJB
	ICompteBancaireDao compteBancaireDao;


	@Override
	public void crediter(String code, Double montant) {
		compteBancaireDao.crediter(code, montant);

	}

	@Override
	public void debiter(String code, Double montant) {
		compteBancaireDao.debiter(code, montant);

	}

	@Override
	public double getSolde(String code) {
		return compteBancaireDao.getSolde(code);

	}

	@Override
	public boolean verifierSolde(int idCompte, double montantCommande) {
		return compteBancaireDao.verifierSolde(idCompte, montantCommande);

	}

	@Override
	public List<CompteBancaireDto> getCompteByClient(ClientDto client) {
		final List<Comptebancaire> listeComptes = compteBancaireDao.getCompteByClient(DtoToEntity.fromClientDtoToClientEntity(client));
		final List<CompteBancaireDto> listeComptesDto = new ArrayList<>();
		for(Comptebancaire compteBancaire : listeComptes){
			final CompteBancaireDto compteDto = EntityToDto.fromCompteBancaireEntityToCompteBancaireDto(compteBancaire);
			listeComptesDto.add(compteDto);
		}
		return listeComptesDto;


	}

}
