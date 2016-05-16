package fr.s2re.uc;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.MessageInboxDto;
import fr.s2re.dto.MessagerieDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcMessagerie;

@Remote(IUcMessagerie.class)
@Stateless
public class UcMessagerie implements IUcMessagerie {
    @Override
    public MessagerieDto envoyerMessage(ClientDto paramClientDto, ProduitDto paramProduitDto) {
        return null;
    }

    @Override
    public MessagerieDto deleteMessage(MessageInboxDto paramMessageInboxDto) {
        return null;
    }

    @Override
    public List<MessagerieDto> consuleterListeMessagerie(ClientDto paramClientDto) {
        return null;
    }

    @Override
    public List<MessageInboxDto> consulterMessagerie(MessagerieDto paramMessagerieDto) {
        return null;
    }
}
