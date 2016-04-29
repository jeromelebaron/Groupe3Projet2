package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Alerte;
import fr.s2re.entity.AlerteMessage;
import fr.s2re.entity.Message;
import fr.s2re.entity.MessageForum;
import fr.s2re.entity.MessageInbox;
import fr.s2re.entity.Messagerie;
import fr.s2re.entity.Sujet;
import fr.s2re.idao.IDaoMessage;
@Remote(IDaoMessage.class)
@Stateless
public class DaoMessage implements IDaoMessage{
	@Override
	public Message addMessage(Message paramMessage) {
		return null;
	}
	@Override
	public Message updateMessage(Message paramMessage) {
		return null;
	}
	@Override
	public Message getById(Integer paramId) {
		return null;
	}
	@Override
	public void delete(Message paramMessage) {
	}
	@Override
	public List<Message> getByAlerte(Alerte paramAlerte) {
		return null;
	}
	@Override
	public List<MessageForum> getBySujet(Sujet paramSujet) {
		return null;
	}
	@Override
	public List<MessageInbox> getByMessagerie(Messagerie paramMessagerie) {
		return null;
	}
	@Override
	public List<AlerteMessage> getAlerte(Message paramMessage) {
		return null;
	}
}