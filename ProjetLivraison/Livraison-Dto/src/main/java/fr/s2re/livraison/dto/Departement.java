package fr.s2re.livraison.dto;

import java.util.List;

/**
 * 
 */
public class Departement {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private List<Ville> villes;

    /**
     * Default constructor
     */
    public Departement() {
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
     * Accesseur en lecture du champ <code>nom</code>.
     * @return le champ <code>nom</code>.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Accesseur en écriture du champ <code>nom</code>.
     * @param paramNom la valeur à écrire dans <code>nom</code>.
     */
    public void setNom(String paramNom) {
        nom = paramNom;
    }

    /**
     * Accesseur en lecture du champ <code>villes</code>.
     * @return le champ <code>villes</code>.
     */
    public List<Ville> getVilles() {
        return villes;
    }

    /**
     * Accesseur en écriture du champ <code>villes</code>.
     * @param paramVilles la valeur à écrire dans <code>villes</code>.
     */
    public void setVilles(List<Ville> paramVilles) {
        villes = paramVilles;
    }

}