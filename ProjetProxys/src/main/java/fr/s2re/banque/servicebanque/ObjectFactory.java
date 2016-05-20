
package fr.s2re.banque.servicebanque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.s2re.banque.servicebanque package. 
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

    private final static QName _VerifierSoldeResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "verifierSoldeResponse");
    private final static QName _CarteBancaireDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "carteBancaireDto");
    private final static QName _GetCLientByNomResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCLientByNomResponse");
    private final static QName _GetCLientByNom_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCLientByNom");
    private final static QName _CompteBancaireDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "compteBancaireDto");
    private final static QName _Crediter_QNAME = new QName("http://servicebanque.banque.s2re.fr", "crediter");
    private final static QName _VerifierSolde_QNAME = new QName("http://servicebanque.banque.s2re.fr", "verifierSolde");
    private final static QName _OperationBancaireDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "operationBancaireDto");
    private final static QName _CrediterResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "crediterResponse");
    private final static QName _GetCompteByClientResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCompteByClientResponse");
    private final static QName _GetSoldeResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getSoldeResponse");
    private final static QName _DebiterResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "debiterResponse");
    private final static QName _Debiter_QNAME = new QName("http://servicebanque.banque.s2re.fr", "debiter");
    private final static QName _GetCarteByCompteResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCarteByCompteResponse");
    private final static QName _ClientDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "clientDto");
    private final static QName _GetCompteByClient_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCompteByClient");
    private final static QName _GetSolde_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getSolde");
    private final static QName _GetCarteByCompte_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCarteByCompte");
    private final static QName _BanqueDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "banqueDto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.s2re.banque.servicebanque
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCarteByCompteResponse }
     * 
     */
    public GetCarteByCompteResponse createGetCarteByCompteResponse() {
        return new GetCarteByCompteResponse();
    }

    /**
     * Create an instance of {@link Debiter }
     * 
     */
    public Debiter createDebiter() {
        return new Debiter();
    }

    /**
     * Create an instance of {@link GetSoldeResponse }
     * 
     */
    public GetSoldeResponse createGetSoldeResponse() {
        return new GetSoldeResponse();
    }

    /**
     * Create an instance of {@link DebiterResponse }
     * 
     */
    public DebiterResponse createDebiterResponse() {
        return new DebiterResponse();
    }

    /**
     * Create an instance of {@link BanqueDto }
     * 
     */
    public BanqueDto createBanqueDto() {
        return new BanqueDto();
    }

    /**
     * Create an instance of {@link GetSolde }
     * 
     */
    public GetSolde createGetSolde() {
        return new GetSolde();
    }

    /**
     * Create an instance of {@link GetCarteByCompte }
     * 
     */
    public GetCarteByCompte createGetCarteByCompte() {
        return new GetCarteByCompte();
    }

    /**
     * Create an instance of {@link GetCompteByClient }
     * 
     */
    public GetCompteByClient createGetCompteByClient() {
        return new GetCompteByClient();
    }

    /**
     * Create an instance of {@link ClientDto }
     * 
     */
    public ClientDto createClientDto() {
        return new ClientDto();
    }

    /**
     * Create an instance of {@link GetCLientByNomResponse }
     * 
     */
    public GetCLientByNomResponse createGetCLientByNomResponse() {
        return new GetCLientByNomResponse();
    }

    /**
     * Create an instance of {@link CarteBancaireDto }
     * 
     */
    public CarteBancaireDto createCarteBancaireDto() {
        return new CarteBancaireDto();
    }

    /**
     * Create an instance of {@link VerifierSoldeResponse }
     * 
     */
    public VerifierSoldeResponse createVerifierSoldeResponse() {
        return new VerifierSoldeResponse();
    }

    /**
     * Create an instance of {@link GetCompteByClientResponse }
     * 
     */
    public GetCompteByClientResponse createGetCompteByClientResponse() {
        return new GetCompteByClientResponse();
    }

    /**
     * Create an instance of {@link CrediterResponse }
     * 
     */
    public CrediterResponse createCrediterResponse() {
        return new CrediterResponse();
    }

    /**
     * Create an instance of {@link OperationBancaireDto }
     * 
     */
    public OperationBancaireDto createOperationBancaireDto() {
        return new OperationBancaireDto();
    }

    /**
     * Create an instance of {@link VerifierSolde }
     * 
     */
    public VerifierSolde createVerifierSolde() {
        return new VerifierSolde();
    }

    /**
     * Create an instance of {@link Crediter }
     * 
     */
    public Crediter createCrediter() {
        return new Crediter();
    }

    /**
     * Create an instance of {@link CompteBancaireDto }
     * 
     */
    public CompteBancaireDto createCompteBancaireDto() {
        return new CompteBancaireDto();
    }

    /**
     * Create an instance of {@link GetCLientByNom }
     * 
     */
    public GetCLientByNom createGetCLientByNom() {
        return new GetCLientByNom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifierSoldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "verifierSoldeResponse")
    public JAXBElement<VerifierSoldeResponse> createVerifierSoldeResponse(VerifierSoldeResponse value) {
        return new JAXBElement<VerifierSoldeResponse>(_VerifierSoldeResponse_QNAME, VerifierSoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarteBancaireDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "carteBancaireDto")
    public JAXBElement<CarteBancaireDto> createCarteBancaireDto(CarteBancaireDto value) {
        return new JAXBElement<CarteBancaireDto>(_CarteBancaireDto_QNAME, CarteBancaireDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCLientByNomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCLientByNomResponse")
    public JAXBElement<GetCLientByNomResponse> createGetCLientByNomResponse(GetCLientByNomResponse value) {
        return new JAXBElement<GetCLientByNomResponse>(_GetCLientByNomResponse_QNAME, GetCLientByNomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCLientByNom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCLientByNom")
    public JAXBElement<GetCLientByNom> createGetCLientByNom(GetCLientByNom value) {
        return new JAXBElement<GetCLientByNom>(_GetCLientByNom_QNAME, GetCLientByNom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteBancaireDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "compteBancaireDto")
    public JAXBElement<CompteBancaireDto> createCompteBancaireDto(CompteBancaireDto value) {
        return new JAXBElement<CompteBancaireDto>(_CompteBancaireDto_QNAME, CompteBancaireDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Crediter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "crediter")
    public JAXBElement<Crediter> createCrediter(Crediter value) {
        return new JAXBElement<Crediter>(_Crediter_QNAME, Crediter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifierSolde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "verifierSolde")
    public JAXBElement<VerifierSolde> createVerifierSolde(VerifierSolde value) {
        return new JAXBElement<VerifierSolde>(_VerifierSolde_QNAME, VerifierSolde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationBancaireDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "operationBancaireDto")
    public JAXBElement<OperationBancaireDto> createOperationBancaireDto(OperationBancaireDto value) {
        return new JAXBElement<OperationBancaireDto>(_OperationBancaireDto_QNAME, OperationBancaireDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrediterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "crediterResponse")
    public JAXBElement<CrediterResponse> createCrediterResponse(CrediterResponse value) {
        return new JAXBElement<CrediterResponse>(_CrediterResponse_QNAME, CrediterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteByClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCompteByClientResponse")
    public JAXBElement<GetCompteByClientResponse> createGetCompteByClientResponse(GetCompteByClientResponse value) {
        return new JAXBElement<GetCompteByClientResponse>(_GetCompteByClientResponse_QNAME, GetCompteByClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getSoldeResponse")
    public JAXBElement<GetSoldeResponse> createGetSoldeResponse(GetSoldeResponse value) {
        return new JAXBElement<GetSoldeResponse>(_GetSoldeResponse_QNAME, GetSoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "debiterResponse")
    public JAXBElement<DebiterResponse> createDebiterResponse(DebiterResponse value) {
        return new JAXBElement<DebiterResponse>(_DebiterResponse_QNAME, DebiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Debiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "debiter")
    public JAXBElement<Debiter> createDebiter(Debiter value) {
        return new JAXBElement<Debiter>(_Debiter_QNAME, Debiter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarteByCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCarteByCompteResponse")
    public JAXBElement<GetCarteByCompteResponse> createGetCarteByCompteResponse(GetCarteByCompteResponse value) {
        return new JAXBElement<GetCarteByCompteResponse>(_GetCarteByCompteResponse_QNAME, GetCarteByCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "clientDto")
    public JAXBElement<ClientDto> createClientDto(ClientDto value) {
        return new JAXBElement<ClientDto>(_ClientDto_QNAME, ClientDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteByClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCompteByClient")
    public JAXBElement<GetCompteByClient> createGetCompteByClient(GetCompteByClient value) {
        return new JAXBElement<GetCompteByClient>(_GetCompteByClient_QNAME, GetCompteByClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getSolde")
    public JAXBElement<GetSolde> createGetSolde(GetSolde value) {
        return new JAXBElement<GetSolde>(_GetSolde_QNAME, GetSolde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarteByCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCarteByCompte")
    public JAXBElement<GetCarteByCompte> createGetCarteByCompte(GetCarteByCompte value) {
        return new JAXBElement<GetCarteByCompte>(_GetCarteByCompte_QNAME, GetCarteByCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BanqueDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "banqueDto")
    public JAXBElement<BanqueDto> createBanqueDto(BanqueDto value) {
        return new JAXBElement<BanqueDto>(_BanqueDto_QNAME, BanqueDto.class, null, value);
    }

}
