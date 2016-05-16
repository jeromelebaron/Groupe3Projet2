package fr.s2re.uc;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcModerateur;

@Remote(IUcModerateur.class)
@Stateless
public class UcModerateur implements IUcModerateur {
    @Override
    public ProduitDto gererPublicationProduit(ProduitDto paramProduitDto) {
        return null;
    }

    @Override
    public ProduitDto deleteProduitClientcatalog(ProduitDto paramProduitDto) {
        return null;
    }

    @Override
    public ProduitDto deleteProduitlisteAlerte(ProduitDto paramProduitDto) {
        return null;
    }

    @Override
    public ClientDto demandeBlacklisterClient(ClientDto paramClientDto) {
        return null;
    }

    @Override
    public NoteProduitDto deleteNoteProduit(ProduitDto paramProduitDto) {
        return null;
    }

    @Override
    public NoteClientDto deleteNoteClient(ClientDto paramNoteClient) {
        return null;
    }
}
