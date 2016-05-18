package fr.s2re.livraison.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "departement")
public class Departement {

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departement")
    private Integer id;

    /**
     * 
     */
    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    /**
     * 
     */
    @OneToMany(mappedBy = "departement")
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