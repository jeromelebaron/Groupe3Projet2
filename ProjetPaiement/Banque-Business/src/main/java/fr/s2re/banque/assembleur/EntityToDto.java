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
			dbm.map(banque, banqueDto);
			return banqueDto;	
		}
		
		public static CarteBancaireDto fromCarteBancaireEntityToCarteBancaireDto(Cartebancaire carteBancaire){
			CarteBancaireDto carteBancaireDto = new CarteBancaireDto();
			dbm.map(carteBancaire, carteBancaireDto);
			return carteBancaireDto;	
		}
		
		public static ClientDto fromClientEntityToClientDto(Client client){
			ClientDto clientDto = new ClientDto();
			dbm.map(client, clientDto);
			clientDto.setBanque(EntityToDto.fromBanqueEntityToBanqueDto(client.getBanque()));
			return clientDto;	
		}
		
		public static CompteBancaireDto fromCompteBancaireEntityToCompteBancaireDto(Comptebancaire compteBancaire){
			CompteBancaireDto compteBancaireDto = new CompteBancaireDto();
			dbm.map(compteBancaire, compteBancaireDto);
			compteBancaireDto.setClient(EntityToDto.fromClientEntityToClientDto(compteBancaire.getClient()));
			return compteBancaireDto;
		}
		
		public static OperationBancaireDto fromOperationBancaireEntityToOperationBancaireDto(Operationbancaire operationBancair){
			OperationBancaireDto operationBancairDto = new OperationBancaireDto();
			dbm.map(operationBancair, operationBancairDto);
			operationBancairDto.setComptebancaire(EntityToDto.fromCompteBancaireEntityToCompteBancaireDto(operationBancair.getComptebancaire()));
			return operationBancairDto;
		}
}
