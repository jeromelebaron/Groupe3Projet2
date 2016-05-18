package fr.s2re.banque.dto;

import java.util.List;

public class ClientDto {

	private int idClient;
	private String adresseClient;
	private String nomClient;
	private String prenomClient;
	private BanqueDto banque;
	private List<CompteBancaireDto> comptebancaires;
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public BanqueDto getBanque() {
		return banque;
	}
	public void setBanque(BanqueDto banque) {
		this.banque = banque;
	}
	public List<CompteBancaireDto> getComptebancaires() {
		return comptebancaires;
	}
	public void setComptebancaires(List<CompteBancaireDto> comptebancaires) {
		this.comptebancaires = comptebancaires;
	}
	public ClientDto(int idClient, String adresseClient, String nomClient,
			String prenomClient, BanqueDto banque,
			List<CompteBancaireDto> comptebancaires) {
		super();
		this.idClient = idClient;
		this.adresseClient = adresseClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.banque = banque;
		this.comptebancaires = comptebancaires;
	}
	public ClientDto(String adresseClient, String nomClient,
			String prenomClient, BanqueDto banque,
			List<CompteBancaireDto> comptebancaires) {
		super();
		this.adresseClient = adresseClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.banque = banque;
		this.comptebancaires = comptebancaires;
	}
	public ClientDto() {
		super();
	}
	
	
}
