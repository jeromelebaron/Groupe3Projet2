package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.AlerteDto;
import fr.s2re.dto.AlerteMessageDto;
import fr.s2re.dto.MessageDto;
import fr.s2re.dto.MessageForumDto;
import fr.s2re.dto.MessageInboxDto;
import fr.s2re.dto.MessagerieDto;
import fr.s2re.dto.SujetDto;
import fr.s2re.ibusiness.IBusinessMessage;
@Remote(IBusinessMessage.class)
@Stateless
public class BusinessMessage implements IBusinessMessage{
	@Override
	public MessageDto addMessage(MessageDto paramMessage) {
		return null;
	}
	@Override
	public MessageDto updateMessage(MessageDto paramMessage) {
		return null;
	}
	@Override
	public MessageDto getById(Integer paramId) {
		return null;
	}
	@Override
	public void delete(MessageDto paramMessage) {
	}
	@Override
	public List<MessageDto> getByAlerte(AlerteDto paramAlerte) {
		return null;
	}
	@Override
	public List<MessageForumDto> getBySujet(SujetDto paramSujet) {
		return null;
	}
	@Override
	public List<MessageInboxDto> getByMessagerie(MessagerieDto paramMessagerie) {
		return null;
	}
	@Override
	public List<AlerteMessageDto> getAlerte(MessageDto paramMessage) {
		return null;
	}
}