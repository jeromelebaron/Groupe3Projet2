package fr.s2re.business;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.AlerteCommentaireDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.ibusiness.IBusinessNote;
import fr.s2re.idao.IDaoNote;

@Remote(IBusinessNote.class)
@Stateless
public class BusinessNote implements IBusinessNote {
    @EJB
    private IDaoNote daoNote;

    @Override
    public NoteDto addNote(NoteDto paramNote) {
        paramNote.setDate(new Date());
        paramNote.setPublie(true);
        return AssembleurDto.noteDtoFromNote(daoNote.addNote(AssembleurDto.noteFromNoteDto(paramNote)));
    }

    @Override
    public NoteDto updateNote(NoteDto paramNote) {
        return null;
    }

    @Override
    public List<NoteDto> getByClient(ClientDto paramClient) {
        return null;
    }

    @Override
    public List<NoteDto> getByAlerte(AlerteCommentaireDto paramAlerte) {
        return null;
    }

    @Override
    public List<NoteProduitDto> getByProduit(ProduitDto paramProduit) {
        return null;
    }

    @Override
    public List<NoteClientDto> getByVendeur(ClientDto paramVendeur) {
        return null;
    }

    @Override
    public List<AlerteCommentaireDto> getAlerte(NoteDto paramNote) {
        return null;
    }
}