package fr.s2re.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.ibusiness.IBusinessUtilisateur;
import fr.s2re.idao.IDaoUtilisateur;

@Remote(IBusinessUtilisateur.class)
@Stateless
public class BusinessUtilisateur implements IBusinessUtilisateur {
    @EJB
    private IDaoUtilisateur daoUtilisateur;

    @Override
    public UtilisateurDto addUser(UtilisateurDto paramUtilisateur) {
        return null;
    }

    @Override
    public UtilisateurDto updateUser(UtilisateurDto paramUtilisateur) {
        return null;
    }

    @Override
    public List<UtilisateurDto> getAll() {
        return null;
    }

    @Override
    public UtilisateurDto getById(Integer paramId) {
        return null;
    }

    @Override
    public UtilisateurDto getByNom(String paramNom) {
        return null;
    }

    @Override
    public UtilisateurDto getByIdentifiant(String paramMail, String paramMdp) {
        UtilisateurDto utilisateurDto = AssembleurDto.userDtoFromUser(daoUtilisateur.getByIdentifiant(paramMail, paramMdp));
        return utilisateurDto;
    }

    @Override
    public List<NoteClientDto> getNote(ClientDto paramClient) {
        return null;
    }

    @Override
    public ClientDto getVendeurByIdPdt(Integer paramIdProduit) {
        return AssembleurDto.clientDtoFromClient(daoUtilisateur.getVendeurByIdPdt(paramIdProduit));
    }

    @Override
    public List<NoteDto> getNotesByNoteur(ClientDto paramClientDto, ClientDto paramVendeurDto) {
        return AssembleurDto.listNoteDtoFromListNote(daoUtilisateur.getNotesByNoteur(AssembleurDto.clientFromClientDto(paramClientDto),
                AssembleurDto.clientFromClientDto(paramVendeurDto)));
    }
}