package fr.s2re.banque.assembleur;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

import fr.s2re.banque.dto.BanqueDto;
import fr.s2re.banque.dto.CarteBancaireDto;
import fr.s2re.banque.dto.ClientDto;
import fr.s2re.banque.dto.CompteBancaireDto;
import fr.s2re.banque.dto.DeviseDto;
import fr.s2re.banque.dto.OperationBancaireDto;
import fr.s2re.banque.entity.Banque;
import fr.s2re.banque.entity.Cartebancaire;
import fr.s2re.banque.entity.Client;
import fr.s2re.banque.entity.Comptebancaire;
import fr.s2re.banque.entity.Devise;
import fr.s2re.banque.entity.Operationbancaire;

public class EntityToDto {
	private static DozerBeanMapper dbm = new DozerBeanMapper();
	public EntityToDto() {

	}
	public static DeviseDto fromDeviseEntityToDeviseDto(Devise devise) {
		DeviseDto deviseDto = new DeviseDto();
		dbm.map(devise, deviseDto);
		return deviseDto;
	}

	public static BanqueDto fromBanqueEntityToBanqueDto(Banque banque){
		BanqueDto banqueDto = new BanqueDto();
		banqueDto.setAdresseBanque(banque.getAdresseBanque());
		banqueDto.setIdBanque(banque.getIdBanque());
		banqueDto.setNomBanque(banque.getNomBanque());
		banqueDto.setClients(null);
		return banqueDto;	
	}

	public static List<CompteBancaireDto> fromListeComptesEntityToListeComptesDto(List<Comptebancaire> listeComptes){
		final List<CompteBancaireDto> listeComptesDto = new ArrayList<>();
		for(Comptebancaire compteBancaire : listeComptes){
			final CompteBancaireDto compteDto = EntityToDto.fromCompteBancaireEntityToCompteBancaireDto(compteBancaire);
			listeComptesDto.add(compteDto);
		}
		return listeComptesDto;	
	}
	
	public static List<CarteBancaireDto> fromListeCartesEntityToListeCartesDto(List<Cartebancaire> listeCartes){
		final List<CarteBancaireDto> listeCartesDto = new ArrayList<>();
		for(Cartebancaire carteBancaire : listeCartes){
			final CarteBancaireDto carteDto = EntityToDto.fromCarteBancaireEntityToCarteBancaireDto(carteBancaire);
			listeCartesDto.add(carteDto);
		}
		
		return listeCartesDto;	
	}
	
	public static List<OperationBancaireDto> fromListeOperationsEntityToListeOperationsDto(List<Operationbancaire> listeOperations){
		final List<OperationBancaireDto> listeOperationsDto = new ArrayList<>();
		for(Operationbancaire OperationBancaire : listeOperations){
			final OperationBancaireDto OperationDto = EntityToDto.fromOperationBancaireEntityToOperationBancaireDto(OperationBancaire);
			listeOperationsDto.add(OperationDto);
		}
		
		return listeOperationsDto;	
	}
	
	public static List<ClientDto> fromListeClientsEntityToListeClientsDto(List<Client> listeClients){
		final List<ClientDto> listeClientDto = new ArrayList<>();
		for(Client Client : listeClients){
			final ClientDto clientDto = EntityToDto.fromClientEntityToClientDto(Client);
			listeClientDto.add(clientDto);
		}
		
		return listeClientDto;	
	}
	
	
	public static CarteBancaireDto fromCarteBancaireEntityToCarteBancaireDto(Cartebancaire carteBancaire){
		CarteBancaireDto carteBancaireDto = new CarteBancaireDto();
		carteBancaireDto.setCryptogramme(carteBancaire.getCryptogramme());
		carteBancaireDto.setDateExpiration(carteBancaire.getDateExpiration());
		carteBancaireDto.setIdCarte(carteBancaire.getIdCarte());
		carteBancaireDto.setNumeroCarte(carteBancaire.getNumeroCarte());
		carteBancaireDto.setComptebancaire(fromCompteBancaireEntityToCompteBancaireDto(carteBancaire.getComptebancaire()));
		return carteBancaireDto;	
	}

	public static ClientDto fromClientEntityToClientDto(Client client){
		ClientDto clientDto = new ClientDto();
		clientDto.setAdresseClient(client.getAdresseClient());
		clientDto.setIdClient(client.getIdClient());
		clientDto.setNomClient(client.getNomClient());
		clientDto.setPrenomClient(client.getPrenomClient());
		clientDto.setBanque(null);
		/*List<Comptebancaire> listeComptes = client.getComptebancaires();
		clientDto.setComptebancaires(fromListeComptesEntityToListeComptesDto(listeComptes));*/
		clientDto.setComptebancaires(null);	
		return clientDto;	
	}

	public static CompteBancaireDto fromCompteBancaireEntityToCompteBancaireDto(Comptebancaire compteBancaire){
		CompteBancaireDto compteBancaireDto = new CompteBancaireDto();
        compteBancaireDto.setCodeBic(compteBancaire.getCodeBic());
        compteBancaireDto.setCodeIban(compteBancaire.getCodeIban());
        compteBancaireDto.setSolde(compteBancaire.getSolde());
        compteBancaireDto.setIdCompte(compteBancaire.getIdCompte());
        compteBancaireDto.setClient(EntityToDto.fromClientEntityToClientDto(compteBancaire.getClient()));  
       /* List<Cartebancaire>listeCartes = compteBancaire.getCartebancaires();
        compteBancaireDto.setCartebancaires(fromListeCartesEntityToListeCartesDto(listeCartes));*/
       /* List<Operationbancaire> listeoperations = compteBancaire.getOperationbancaires();
        compteBancaireDto.setOperationbancaires(fromListeOperationsEntityToListeOperationsDto(listeoperations));*/
		compteBancaire.getClient().setComptebancaires(null);
		compteBancaire.getClient().getBanque().setClients(null);
		compteBancaire.setOperationbancaires(null);
		return compteBancaireDto;
	}

	public static OperationBancaireDto fromOperationBancaireEntityToOperationBancaireDto(Operationbancaire operationBancair){
		OperationBancaireDto operationBancairDto = new OperationBancaireDto();
		dbm.map(operationBancair, operationBancairDto);
		operationBancairDto.setComptebancaire(EntityToDto.fromCompteBancaireEntityToCompteBancaireDto(operationBancair.getComptebancaire()));
		return operationBancairDto;
	}
}