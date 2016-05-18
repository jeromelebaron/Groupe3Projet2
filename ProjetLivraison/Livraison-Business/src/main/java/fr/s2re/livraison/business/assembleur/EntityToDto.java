/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.business.assembleur;

import fr.s2re.livraison.dto.AdresseDto;
import fr.s2re.livraison.dto.DepartementDto;
import fr.s2re.livraison.dto.ServiceLivraisonDto;
import fr.s2re.livraison.dto.TypeLivraisonDto;
import fr.s2re.livraison.dto.VilleDto;
import fr.s2re.livraison.entity.Adresse;
import fr.s2re.livraison.entity.Departement;
import fr.s2re.livraison.entity.ServiceLivraison;
import fr.s2re.livraison.entity.TypeLivraison;
import fr.s2re.livraison.entity.Ville;

/**
 * Pour convertur les Entity en DTO.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class EntityToDto {

    private EntityToDto() {
        // EMPTY
    }

    public static ServiceLivraisonDto fromServiceLivraisonEntityToServiceLivraisonDto(
            final ServiceLivraison paramServiceLivraison) {
        final ServiceLivraisonDto serviceLivraisonDto = new ServiceLivraisonDto();
        serviceLivraisonDto.setId(paramServiceLivraison.getId());
        serviceLivraisonDto.setNom(paramServiceLivraison.getNom());
        serviceLivraisonDto.setAdresseLocalisation(EntityToDto
                .fromAdresseEntityToAdresseDto(paramServiceLivraison.getAdresseLocalisation()));
        serviceLivraisonDto
                .setTypeLivraison(EntityToDto
                        .fromTypeLivraisonEntityToTypeLivraisonDto(paramServiceLivraison
                                .getTypeLivraison()));
        return serviceLivraisonDto;
    }

    public static AdresseDto fromAdresseEntityToAdresseDto(final Adresse paramAdresseLocalisation) {
        final AdresseDto adresseDto = new AdresseDto();
        adresseDto.setId(paramAdresseLocalisation.getId());
        adresseDto.setNomRue(paramAdresseLocalisation.getNomRue());
        adresseDto.setNumero(paramAdresseLocalisation.getNumero());
        adresseDto.setVille(EntityToDto.fromVilleEntityToVilleDto(paramAdresseLocalisation
                .getVille()));
        return adresseDto;
    }

    public static VilleDto fromVilleEntityToVilleDto(final Ville paramVille) {
        final VilleDto villeDto = new VilleDto();
        villeDto.setId(paramVille.getId());
        villeDto.setNom(paramVille.getNom());
        villeDto.setCodePostal(paramVille.getCodePostal());
        villeDto.setDepartement(EntityToDto.fromDepartementEntityToDepartementDto(paramVille
                .getDepartement()));
        return villeDto;
    }

    public static DepartementDto fromDepartementEntityToDepartementDto(
            final Departement paramDepartement) {
        final DepartementDto departementDto = new DepartementDto();
        departementDto.setId(paramDepartement.getId());
        departementDto.setNom(paramDepartement.getNom());
        departementDto.setNom(paramDepartement.getNumero());
        return departementDto;
    }

    public static TypeLivraisonDto fromTypeLivraisonEntityToTypeLivraisonDto(
            final TypeLivraison paramTypeLivraison) {
        final TypeLivraisonDto typeLivraisonDto = new TypeLivraisonDto();
        typeLivraisonDto.setId(paramTypeLivraison.getId());
        typeLivraisonDto.setLibelle(paramTypeLivraison.getLibelle());
        return typeLivraisonDto;
    }
}
