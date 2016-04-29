package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ClientDto extends UtilisateurDto implements Serializable{
	private static final long serialVersionUID = 1L;
    private Boolean actif;
    private List<CartePaiementDto> PaiementCartes;
    private List<AdresseDto> FacturationAdresses;
    private List<AdresseDto> LivraisonAdresses;
    private List<NoteClientDto> notes;
    private List<ProduitDto> produits;
    private List<EnvieDto> envies;
    private List<MessagerieDto> messageries;
    private List<CommandeDto> commandes;
    private List<RibDto> ribs;
	public ClientDto() {
		super();
	}
	public ClientDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
			Date paramDateInscription, CiviliteDto paramCivilite, 
			Boolean paramActif) {
		super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
		actif = paramActif;
	}
	public ClientDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramTelephone,
			Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes,
			CiviliteDto paramCivilite, 
			Boolean paramActif,
			List<CartePaiementDto> paramPaiementCartes,
			List<AdresseDto> paramFacturationAdresses,
			List<AdresseDto> paramLivraisonAdresses,
			List<NoteClientDto> paramNotes,
			List<ProduitDto> paramProduits,
			List<EnvieDto> paramEnvies,
			List<MessagerieDto> paramMessageries,
			List<CommandeDto> paramCommandes,
			List<RibDto> paramRibs) {
		super(paramId, paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
				paramCivilite);
		actif = paramActif;
		PaiementCartes = paramPaiementCartes;
		FacturationAdresses = paramFacturationAdresses;
		LivraisonAdresses = paramLivraisonAdresses;
		notes = paramNotes;
		produits = paramProduits;
		envies = paramEnvies;
		messageries = paramMessageries;
		commandes = paramCommandes;
		ribs = paramRibs;
	}
	public ClientDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword,
			String paramTelephone, Date paramDateInscription, CiviliteDto paramCivilite,
			Boolean paramActif) {
		super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
		actif = paramActif;
	}
	public ClientDto(Integer paramId, String paramNom, String paramPrenom, String paramMail, String paramPassword,
			String paramTelephone, Date paramDateInscription, List<MessageForumDto> paramForumMessages,
			List<AlerteDto> paramAlertes, CiviliteDto paramCivilite, 
			Boolean paramActif,
			List<CartePaiementDto> paramPaiementCartes,
			List<AdresseDto> paramFacturationAdresses,
			List<AdresseDto> paramLivraisonAdresses,
			List<NoteClientDto> paramNotes,
			List<ProduitDto> paramProduits,
			List<EnvieDto> paramEnvies,
			List<MessagerieDto> paramMessageries,
			List<CommandeDto> paramCommandes,
			List<RibDto> paramRibs) {
		super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription,
				paramForumMessages, paramAlertes, paramCivilite);
		actif = paramActif;
		PaiementCartes = paramPaiementCartes;
		FacturationAdresses = paramFacturationAdresses;
		LivraisonAdresses = paramLivraisonAdresses;
		notes = paramNotes;
		produits = paramProduits;
		envies = paramEnvies;
		messageries = paramMessageries;
		commandes = paramCommandes;
		ribs = paramRibs;
	}
	public ClientDto(String paramNom, String paramPrenom, String paramMail, String paramTelephone,
			Date paramDateInscription, CiviliteDto paramCivilite,
			Boolean paramActif) {
		super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramCivilite);
		actif = paramActif;
	}
	public ClientDto(String paramNom, String paramPrenom, String paramMail, String paramTelephone,
			Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes,
			CiviliteDto paramCivilite,
			Boolean paramActif,
			List<CartePaiementDto> paramPaiementCartes,
			List<AdresseDto> paramFacturationAdresses,
			List<AdresseDto> paramLivraisonAdresses,
			List<NoteClientDto> paramNotes,
			List<ProduitDto> paramProduits,
			List<EnvieDto> paramEnvies,
			List<MessagerieDto> paramMessageries,
			List<CommandeDto> paramCommandes,
			List<RibDto> paramRibs) {
		super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription, paramForumMessages, paramAlertes,
				paramCivilite);
		actif = paramActif;
		PaiementCartes = paramPaiementCartes;
		FacturationAdresses = paramFacturationAdresses;
		LivraisonAdresses = paramLivraisonAdresses;
		notes = paramNotes;
		produits = paramProduits;
		envies = paramEnvies;
		messageries = paramMessageries;
		commandes = paramCommandes;
		ribs = paramRibs;
	}
	public ClientDto(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
			Date paramDateInscription, CiviliteDto paramCivilite,
			Boolean paramActif) {
		super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramCivilite);
		actif = paramActif;
	}
	public ClientDto(String paramNom, String paramPrenom, String paramMail, String paramPassword, String paramTelephone,
			Date paramDateInscription, List<MessageForumDto> paramForumMessages, List<AlerteDto> paramAlertes,
			CiviliteDto paramCivilite,
			Boolean paramActif,
			List<CartePaiementDto> paramPaiementCartes,
			List<AdresseDto> paramFacturationAdresses,
			List<AdresseDto> paramLivraisonAdresses,
			List<NoteClientDto> paramNotes,
			List<ProduitDto> paramProduits,
			List<EnvieDto> paramEnvies,
			List<MessagerieDto> paramMessageries,
			List<CommandeDto> paramCommandes,
			List<RibDto> paramRibs) {
		super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone, paramDateInscription, paramForumMessages,
				paramAlertes, paramCivilite);
		actif = paramActif;
		PaiementCartes = paramPaiementCartes;
		FacturationAdresses = paramFacturationAdresses;
		LivraisonAdresses = paramLivraisonAdresses;
		notes = paramNotes;
		produits = paramProduits;
		envies = paramEnvies;
		messageries = paramMessageries;
		commandes = paramCommandes;
		ribs = paramRibs;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean paramActif) {
		actif = paramActif;
	}
	public List<CartePaiementDto> getPaiementCartes() {
		return PaiementCartes;
	}
	public void setPaiementCartes(List<CartePaiementDto> paramPaiementCartes) {
		PaiementCartes = paramPaiementCartes;
	}
	public List<AdresseDto> getFacturationAdresses() {
		return FacturationAdresses;
	}
	public void setFacturationAdresses(List<AdresseDto> paramFacturationAdresses) {
		FacturationAdresses = paramFacturationAdresses;
	}
	public List<AdresseDto> getLivraisonAdresses() {
		return LivraisonAdresses;
	}
	public void setLivraisonAdresses(List<AdresseDto> paramLivraisonAdresses) {
		LivraisonAdresses = paramLivraisonAdresses;
	}
	public List<NoteClientDto> getNotes() {
		return notes;
	}
	public void setNotes(List<NoteClientDto> paramNotes) {
		notes = paramNotes;
	}
	public List<ProduitDto> getProduits() {
		return produits;
	}
	public void setProduits(List<ProduitDto> paramProduits) {
		produits = paramProduits;
	}
	public List<EnvieDto> getEnvies() {
		return envies;
	}
	public void setEnvies(List<EnvieDto> paramEnvies) {
		envies = paramEnvies;
	}
	public List<MessagerieDto> getMessageries() {
		return messageries;
	}
	public void setMessageries(List<MessagerieDto> paramMessageries) {
		messageries = paramMessageries;
	}
	public List<CommandeDto> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<CommandeDto> paramCommandes) {
		commandes = paramCommandes;
	}
	public List<RibDto> getRibs() {
		return ribs;
	}
	public void setRibs(List<RibDto> paramRibs) {
		ribs = paramRibs;
	}
}