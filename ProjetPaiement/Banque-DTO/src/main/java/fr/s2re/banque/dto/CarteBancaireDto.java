package fr.s2re.banque.dto;

import java.util.Date;

public class CarteBancaireDto {

	private int idCarte;

	private int cryptogramme;
	private Date dateExpiration;
	private String numeroCarte;
	private CompteBancaireDto comptebancaire;
	public int getIdCarte() {
		return idCarte;
	}
	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}
	public int getCryptogramme() {
		return cryptogramme;
	}
	public void setCryptogramme(int cryptogramme) {
		this.cryptogramme = cryptogramme;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public String getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public CompteBancaireDto getComptebancaire() {
		return comptebancaire;
	}
	public void setComptebancaire(CompteBancaireDto comptebancaire) {
		this.comptebancaire = comptebancaire;
	}
	public CarteBancaireDto(int idCarte, int cryptogramme, Date dateExpiration,
			String numeroCarte, CompteBancaireDto comptebancaire) {
		super();
		this.idCarte = idCarte;
		this.cryptogramme = cryptogramme;
		this.dateExpiration = dateExpiration;
		this.numeroCarte = numeroCarte;
		this.comptebancaire = comptebancaire;
	}
	public CarteBancaireDto(int cryptogramme, Date dateExpiration,
			String numeroCarte, CompteBancaireDto comptebancaire) {
		super();
		this.cryptogramme = cryptogramme;
		this.dateExpiration = dateExpiration;
		this.numeroCarte = numeroCarte;
		this.comptebancaire = comptebancaire;
	}
	public CarteBancaireDto() {
		super();
	}

	
	
}
