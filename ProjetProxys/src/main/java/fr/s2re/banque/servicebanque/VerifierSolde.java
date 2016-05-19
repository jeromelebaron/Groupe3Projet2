
package fr.s2re.banque.servicebanque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verifierSolde complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifierSolde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramIdCompte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paramMontantCommande" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifierSolde", propOrder = {
    "paramIdCompte",
    "paramMontantCommande"
})
public class VerifierSolde {

    protected int paramIdCompte;
    protected double paramMontantCommande;

    /**
     * Gets the value of the paramIdCompte property.
     * 
     */
    public int getParamIdCompte() {
        return paramIdCompte;
    }

    /**
     * Sets the value of the paramIdCompte property.
     * 
     */
    public void setParamIdCompte(int value) {
        this.paramIdCompte = value;
    }

    /**
     * Gets the value of the paramMontantCommande property.
     * 
     */
    public double getParamMontantCommande() {
        return paramMontantCommande;
    }

    /**
     * Sets the value of the paramMontantCommande property.
     * 
     */
    public void setParamMontantCommande(double value) {
        this.paramMontantCommande = value;
    }

}
