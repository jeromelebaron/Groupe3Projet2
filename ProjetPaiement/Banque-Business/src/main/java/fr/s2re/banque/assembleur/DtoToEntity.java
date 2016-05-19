package fr.s2re.banque.assembleur;

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

public class DtoToEntity {
    private static DozerBeanMapper dbm = new DozerBeanMapper();
	private DtoToEntity() {

	}
	
	public static Devise fromDeviseDtoToDeviseEntity(DeviseDto deviseDto) {
		Devise devise = new Devise();
		dbm.map(deviseDto, devise);
		return devise;
	}
	
	public static Banque fromBanqueDtoToBanqueEntity(BanqueDto banqueDto){
		Banque banque = new Banque();
		dbm.map(banqueDto, banque);
		return banque;	
	}
	
	public static Cartebancaire fromCarteBancaireDtoToCarteBancaireEntity(CarteBancaireDto carteBancaireDto){
		Cartebancaire carteBancaire = new Cartebancaire();
		dbm.map(carteBancaireDto, carteBancaire);
		return carteBancaire;	
	}
	
	public static Client fromClientDtoToClientEntity(ClientDto clientDto){
		Client client = new Client();
		dbm.map(clientDto, client);
		client.setBanque(DtoToEntity.fromBanqueDtoToBanqueEntity(clientDto.getBanque()));
		return client;	
	}
	
	public static Comptebancaire fromCompteBancaireDtoToCompteBancaireEntity(CompteBancaireDto compteBancaireDto){
		Comptebancaire compteBancaire = new Comptebancaire();
		dbm.map(compteBancaireDto, compteBancaire);
		compteBancaire.setClient(DtoToEntity.fromClientDtoToClientEntity(compteBancaireDto.getClient()));
		return compteBancaire;
	}
	
	public static Operationbancaire fromOperationBancaireDtoToOperationBancaireEntity(OperationBancaireDto operationBancairDto){
		Operationbancaire operationBancaire = new Operationbancaire();
		dbm.map(operationBancairDto, operationBancaire);
		operationBancaire.setComptebancaire(DtoToEntity.fromCompteBancaireDtoToCompteBancaireEntity(operationBancairDto.getComptebancaire()));
		return operationBancaire;
	}
}
