package fr.s2re.livraison.dto;

import java.util.List;

/**
 * 
 */
public class TypeLivraison {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String libelle;

    /**
     * 
     */
    private List<ServiceLivraison> serviceLivraisons;

    /**
     * Default constructor
     */
    public TypeLivraison() {
        // EMPTY
    }

    /**
     * Accesseur en lecture du champ <code>id</code>.
     * @return le champ <code>id</code>.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Accesseur en écriture du champ <code>id</code>.
     * @param paramId la valeur à écrire dans <code>id</code>.
     */
    public void setId(Integer paramId) {
        id = paramId;
    }

    /**
     * Accesseur en lecture du champ <code>libelle</code>.
     * @return le champ <code>libelle</code>.
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Accesseur en écriture du champ <code>libelle</code>.
     * @param paramLibelle la valeur à écrire dans <code>libelle</code>.
     */
    public void setLibelle(String paramLibelle) {
        libelle = paramLibelle;
    }

    /**
     * Accesseur en lecture du champ <code>serviceLivraisons</code>.
     * @return le champ <code>serviceLivraisons</code>.
     */
    public List<ServiceLivraison> getServiceLivraisons() {
        return serviceLivraisons;
    }

    /**
     * Accesseur en écriture du champ <code>serviceLivraisons</code>.
     * @param paramServiceLivraisons la valeur à écrire dans <code>serviceLivraisons</code>.
     */
    public void setServiceLivraisons(List<ServiceLivraison> paramServiceLivraisons) {
        serviceLivraisons = paramServiceLivraisons;
    }

}
