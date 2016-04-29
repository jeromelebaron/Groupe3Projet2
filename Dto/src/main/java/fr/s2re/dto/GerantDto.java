package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GerantDto extends UtilisateurDto implements Serializable{
	private static final long serialVersionUID = 1L;
	public GerantDto() {
		super();
	}
	public GerantDto(Integer paramId, String paramNom, String paramPrenom,
			String paramMail, String paramTelephone, Date paramDateInscription,
			CiviliteDto paramCivilite) {
		super(paramId, paramNom, paramPrenom, paramMail, paramTelephone,
				paramDateInscription, paramCivilite);
	}
	public GerantDto(Integer paramId, String paramNom, String paramPrenom,
			String paramMail, String paramTelephone, Date paramDateInscription,
			List<MessageForumDto> paramForumMessages,
			List<AlerteDto> paramAlertes, CiviliteDto paramCivilite) {
		super(paramId, paramNom, paramPrenom, paramMail, paramTelephone,
				paramDateInscription, paramForumMessages, paramAlertes, paramCivilite);
	}
	public GerantDto(Integer paramId, String paramNom, String paramPrenom,
			String paramMail, String paramPassword, String paramTelephone,
			Date paramDateInscription, CiviliteDto paramCivilite) {
		super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone,
				paramDateInscription, paramCivilite);
	}
	public GerantDto(Integer paramId, String paramNom, String paramPrenom,
			String paramMail, String paramPassword, String paramTelephone,
			Date paramDateInscription,
			List<MessageForumDto> paramForumMessages,
			List<AlerteDto> paramAlertes, CiviliteDto paramCivilite) {
		super(paramId, paramNom, paramPrenom, paramMail, paramPassword, paramTelephone,
				paramDateInscription, paramForumMessages, paramAlertes, paramCivilite);
	}
	public GerantDto(String paramNom, String paramPrenom, String paramMail,
			String paramTelephone, Date paramDateInscription,
			CiviliteDto paramCivilite) {
		super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription,
				paramCivilite);
	}
	public GerantDto(String paramNom, String paramPrenom, String paramMail,
			String paramTelephone, Date paramDateInscription,
			List<MessageForumDto> paramForumMessages,
			List<AlerteDto> paramAlertes, CiviliteDto paramCivilite) {
		super(paramNom, paramPrenom, paramMail, paramTelephone, paramDateInscription,
				paramForumMessages, paramAlertes, paramCivilite);
	}
	public GerantDto(String paramNom, String paramPrenom, String paramMail,
			String paramPassword, String paramTelephone,
			Date paramDateInscription, CiviliteDto paramCivilite) {
		super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone,
				paramDateInscription, paramCivilite);
	}
	public GerantDto(String paramNom, String paramPrenom, String paramMail,
			String paramPassword, String paramTelephone,
			Date paramDateInscription,
			List<MessageForumDto> paramForumMessages,
			List<AlerteDto> paramAlertes, CiviliteDto paramCivilite) {
		super(paramNom, paramPrenom, paramMail, paramPassword, paramTelephone,
				paramDateInscription, paramForumMessages, paramAlertes, paramCivilite);
	}
}