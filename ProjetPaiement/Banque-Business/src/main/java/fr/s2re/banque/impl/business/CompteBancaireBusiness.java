package fr.s2re.banque.impl.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.banque.api.business.ICompteBancaireBusiness;
import fr.s2re.banque.api.data.ICompteBancaireDao;
import fr.s2re.banque.api.data.IOperationBancaireDao;
import fr.s2re.banque.assembleur.DtoToEntity;
import fr.s2re.banque.assembleur.EntityToDto;
import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;
import fr.s2re.banque.dto.CreditDto;
import fr.s2re.banque.dto.DebitDto;
import fr.s2re.banque.dto.OperationBancaireDto;
import fr.s2re.banque.entity.Comptebancaire;
import fr.s2re.banque.entity.Debit;

@Remote(ICompteBancaireBusiness.class)
@Stateless
public class CompteBancaireBusiness implements ICompteBancaireBusiness{
	@EJB
	ICompteBancaireDao compteBancaireDao;
	IOperationBancaireDao operationBancaireDao;


	@Override
	public boolean verifierSolde(int idCompte, double montantCommande) {
		CompteBancaireDto compte = EntityToDto.fromCompteBancaireEntityToCompteBancaireDto(compteBancaireDao.getCompteById(idCompte));	
		List<OperationBancaireDto> operationsBancaireDto = EntityToDto.fromListeOperationsEntityToListeOperationsDto(operationBancaireDao.getOperationByCompte(idCompte));
		for(OperationBancaireDto operation : operationsBancaireDto){
			Double montantOperation = operation.getMontant();
			if(operation.getClass() == DebitDto.class){
				montantOperation =  (operation.getMontant())+ montantCommande;
			}
			if(operation.getClass() == CreditDto.class){
				montantOperation =  (operation.getMontant())- montantCommande;
			}
			if(compte.getSolde() <=montantOperation){
				return false;
			}
			if(compte.getSolde() >montantOperation){
				return true;
			}
		}

		return false;
	}

	@Override
	public List<CompteBancaireDto> getCompteByClient(Integer idClient) {
		final List<Comptebancaire> listeComptes = compteBancaireDao.getCompteByClient(idClient);
		final List<CompteBancaireDto> listeComptesDto = new ArrayList<>();
		for(Comptebancaire compteBancaire : listeComptes){
			final CompteBancaireDto compteDto = EntityToDto.fromCompteBancaireEntityToCompteBancaireDto(compteBancaire);
			listeComptesDto.add(compteDto);
		}
		return listeComptesDto;


	}

}
