/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.business.assembleur;

import org.dozer.DozerBeanMapper;

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

    private static DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    private EntityToDto() {
        // EMPTY
    }

    public static ServiceLivraisonDto fromServiceLivraisonEntityToServiceLivraisonDto(
            final ServiceLivraison paramServiceLivraison) {
        final ServiceLivraisonDto serviceLivraisonDto = new ServiceLivraisonDto();
        dozerBeanMapper.map(paramServiceLivraison, serviceLivraisonDto);
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
        dozerBeanMapper.map(paramAdresseLocalisation, adresseDto);
        adresseDto.setVille(EntityToDto.fromVilleEntityToVilleDto(paramAdresseLocalisation
                .getVille()));
        return adresseDto;
    }

    public static VilleDto fromVilleEntityToVilleDto(final Ville paramVille) {
        final VilleDto villeDto = new VilleDto();
        dozerBeanMapper.map(paramVille, villeDto);
        villeDto.setDepartement(EntityToDto.fromDepartementEntityToDepartementDto(paramVille
                .getDepartement()));
        return villeDto;
    }

    public static DepartementDto fromDepartementEntityToDepartementDto(
            final Departement paramDepartement) {
        final DepartementDto departementDto = new DepartementDto();
        dozerBeanMapper.map(paramDepartement, departementDto);
        return departementDto;
    }

    public static TypeLivraisonDto fromTypeLivraisonEntityToTypeLivraisonDto(
            final TypeLivraison paramTypeLivraison) {
        final TypeLivraisonDto typeLivraisonDto = new TypeLivraisonDto();
        dozerBeanMapper.map(paramTypeLivraison, typeLivraisonDto);
        return null;
    }
}
