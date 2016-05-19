
package fr.s2re.livraison.servicelivraison;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.s2re.livraison.servicelivraison package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AdresseDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "adresseDto");
    private final static QName _JourSemaineDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "jourSemaineDto");
    private final static QName _JourOuvertureDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "jourOuvertureDto");
    private final static QName _CommandeDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "commandeDto");
    private final static QName _TypeLivraisonDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "typeLivraisonDto");
    private final static QName _VilleDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "villeDto");
    private final static QName _HorairesDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "horairesDto");
    private final static QName _DepartementDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "departementDto");
    private final static QName _ServiceLivraisonDto_QNAME = new QName("http://servicelivraison.livraison.s2re.fr", "serviceLivraisonDto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.s2re.livraison.servicelivraison
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdresseDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "adresseDto")
    public JAXBElement<AdresseDto> createAdresseDto(AdresseDto value) {
        return new JAXBElement<AdresseDto>(_AdresseDto_QNAME, AdresseDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourSemaineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "jourSemaineDto")
    public JAXBElement<JourSemaineDto> createJourSemaineDto(JourSemaineDto value) {
        return new JAXBElement<JourSemaineDto>(_JourSemaineDto_QNAME, JourSemaineDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourOuvertureDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "jourOuvertureDto")
    public JAXBElement<JourOuvertureDto> createJourOuvertureDto(JourOuvertureDto value) {
        return new JAXBElement<JourOuvertureDto>(_JourOuvertureDto_QNAME, JourOuvertureDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommandeDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "commandeDto")
    public JAXBElement<CommandeDto> createCommandeDto(CommandeDto value) {
        return new JAXBElement<CommandeDto>(_CommandeDto_QNAME, CommandeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeLivraisonDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "typeLivraisonDto")
    public JAXBElement<TypeLivraisonDto> createTypeLivraisonDto(TypeLivraisonDto value) {
        return new JAXBElement<TypeLivraisonDto>(_TypeLivraisonDto_QNAME, TypeLivraisonDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VilleDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "villeDto")
    public JAXBElement<VilleDto> createVilleDto(VilleDto value) {
        return new JAXBElement<VilleDto>(_VilleDto_QNAME, VilleDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HorairesDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "horairesDto")
    public JAXBElement<HorairesDto> createHorairesDto(HorairesDto value) {
        return new JAXBElement<HorairesDto>(_HorairesDto_QNAME, HorairesDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartementDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "departementDto")
    public JAXBElement<DepartementDto> createDepartementDto(DepartementDto value) {
        return new JAXBElement<DepartementDto>(_DepartementDto_QNAME, DepartementDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLivraisonDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicelivraison.livraison.s2re.fr", name = "serviceLivraisonDto")
    public JAXBElement<ServiceLivraisonDto> createServiceLivraisonDto(ServiceLivraisonDto value) {
        return new JAXBElement<ServiceLivraisonDto>(_ServiceLivraisonDto_QNAME, ServiceLivraisonDto.class, null, value);
    }

}
