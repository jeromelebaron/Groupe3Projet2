package fr.s2re.uc;


import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ModerateurDto;
import fr.s2re.iuc.IUcAdministrateur;

@Remote(IUcAdministrateur.class)
@Stateless
public class UcAdministrateur implements IUcAdministrateur {
	@Override
	public ModerateurDto addModerateur(ModerateurDto paramModerateurDto) {
		return null;
	}
	@Override
	public void deleteModerateur(ModerateurDto paramModerateurDto) {
	}
}
