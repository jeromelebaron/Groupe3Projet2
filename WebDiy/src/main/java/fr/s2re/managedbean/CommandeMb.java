package fr.s2re.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.s2re.dto.AdresseDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.MethodeLivraisonDto;
import fr.s2re.dto.TypeCBDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.iuc.IUcClient;
import fr.s2re.iuc.IUcUtilisateur;

@ManagedBean
@SessionScoped
public class CommandeMb {
    private int methodeLivraisonChoisi;

    private int typeCbChoisi;

    private UtilisateurDto user;

    private CommandeDto commande = new CommandeDto();

    private Double fraisLivraison;

    private Double panierFraisLivraison = 0.0;

    private List<MethodeLivraisonDto> methodesLivraison;

    private List<TypeCBDto> typesCb;

    private List<LigneDeCommandeDto> listLigneDeCommande = new ArrayList<>();

    @EJB
    private IUcClient ucClient;

    @EJB
    private IUcUtilisateur ucUtilisateur;

    @ManagedProperty(value = "#{panierMb}")
    private PanierMb panierMb;

    @ManagedProperty(value = "#{connectionMb}")
    private ConnectionMb connectionMb;

    @ManagedProperty(value = "#{clientMb}")
    private ClientMb clientMb;

    @PostConstruct
    public void init() {
        listLigneDeCommande = panierMb.getListLigneDeCommande();
        commande.setLignesDeCommande(listLigneDeCommande);
    }

    public String commander() {
        if (connectionMb != null && connectionMb.getUser() != null) {
            user = connectionMb.getUser();
        }
        if (user != null && user.getClass() == ClientDto.class) {
            methodesLivraison = ucClient.retournerMethodeDeLivraison();
            if (clientMb.getAdresses().isEmpty()) {
                clientMb.setAdresses(ucClient.retournerMesAdresses((ClientDto) user));
                if (!clientMb.getAdresses().isEmpty()) {
                    for (AdresseDto a : clientMb.getAdresses()) {
                        if ("livraison".equals(a.getType())) {
                            clientMb.getAdressesLivraison().add(a);
                        } else if ("facturation".equals(a.getType())) {
                            clientMb.getAdressesFacturation().add(a);
                        }
                    }
                }
            }
            if (!clientMb.getAdressesLivraison().isEmpty())
                clientMb.setAdresseDisplay(clientMb.getAdressesLivraison().get(0));
            typesCb = ucClient.retournerTypeCb();
            return "paiement.xhtml?faces-redirect=true";
        }
        if (user == null) {
            return "login.xhtml?faces-redirect=true";
        }
        return "";
    }

    public String allerPayer() {
        // CommandeDto cmdTmp = new CommandeDto();
        // for(TypeCBDto t : typesCb){
        // if(t.getId() == typeCbChoisi){
        // cmdTmp.setTypeCB(t);
        // }
        // }
        // TODO déplacer ce traitement dans le paiement
        commande.setTypeCB(typesCb.get(0));
        for (MethodeLivraisonDto m : methodesLivraison) {
            if (m.getId() == methodeLivraisonChoisi) {
                commande.setMethodeLivraison(m);
                fraisLivraison = m.getPrix();
            }
        }
        commande.setAdresseFacturation(ucUtilisateur.retournerAdresseParId(clientMb
                .getAdresseFacturationChoisie()));
        commande.setAdresseLivraison(ucUtilisateur.retournerAdresseParId(clientMb
                .getAdresseLivraisonChoisie()));
        return "confirmationPaiement.xhtml?faces-redirect=true";
    }

    public int getMethodeLivraisonChoisi() {
        return methodeLivraisonChoisi;
    }

    public void setMethodeLivraisonChoisi(int paramMethodeLivraisonChoisi) {
        methodeLivraisonChoisi = paramMethodeLivraisonChoisi;
    }

    public int getTypeCbChoisi() {
        return typeCbChoisi;
    }

    public void setTypeCbChoisi(int paramTypeCbChoisi) {
        typeCbChoisi = paramTypeCbChoisi;
    }

    public UtilisateurDto getUser() {
        return user;
    }

    public void setUser(UtilisateurDto paramUser) {
        user = paramUser;
    }

    public CommandeDto getCommande() {
        return commande;
    }

    public void setCommande(CommandeDto paramCommande) {
        commande = paramCommande;
    }

    public List<MethodeLivraisonDto> getMethodesLivraison() {
        return methodesLivraison;
    }

    public void setMethodesLivraison(List<MethodeLivraisonDto> paramMethodesLivraison) {
        methodesLivraison = paramMethodesLivraison;
    }

    public List<TypeCBDto> getTypesCb() {
        return typesCb;
    }

    public void setTypesCb(List<TypeCBDto> paramTypesCb) {
        typesCb = paramTypesCb;
    }

    public List<LigneDeCommandeDto> getListLigneDeCommande() {
        return listLigneDeCommande;
    }

    public void setListLigneDeCommande(List<LigneDeCommandeDto> paramListLigneDeCommande) {
        listLigneDeCommande = paramListLigneDeCommande;
    }

    public IUcClient getUcClient() {
        return ucClient;
    }

    public void setUcClient(IUcClient paramUcClient) {
        ucClient = paramUcClient;
    }

    public IUcUtilisateur getUcUtilisateur() {
        return ucUtilisateur;
    }

    public void setUcUtilisateur(IUcUtilisateur paramUcUtilisateur) {
        ucUtilisateur = paramUcUtilisateur;
    }

    public PanierMb getPanierMb() {
        return panierMb;
    }

    public void setPanierMb(PanierMb paramPanierMb) {
        panierMb = paramPanierMb;
    }

    public ConnectionMb getConnectionMb() {
        return connectionMb;
    }

    public void setConnectionMb(ConnectionMb paramConnectionMb) {
        connectionMb = paramConnectionMb;
    }

    public ClientMb getClientMb() {
        return clientMb;
    }

    public void setClientMb(ClientMb paramClientMb) {
        clientMb = paramClientMb;
    }

    public Double getFraisLivraison() {
        return fraisLivraison;
    }

    public void setFraisLivraison(Double paramFraisLivraison) {
        fraisLivraison = paramFraisLivraison;
    }

    public Double getPanierFraisLivraison() {
        panierFraisLivraison = fraisLivraison + panierMb.getTotalPanier();
        return panierFraisLivraison;
    }

    public void setPanierFraisLivraison(Double paramPanierFraisLivraison) {
        panierFraisLivraison = paramPanierFraisLivraison;
    }
}
