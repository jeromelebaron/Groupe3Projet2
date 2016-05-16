package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.EnvieDto;
import fr.s2re.ibusiness.IBusinessEnvie;

@Remote(IBusinessEnvie.class)
@Stateless
public class BusinessEnvie implements IBusinessEnvie {
    @Override
    public EnvieDto addEnvie(EnvieDto paramEnvie) {
        return null;
    }

    @Override
    public EnvieDto updateEnvie(EnvieDto paramEnvie) {
        return null;
    }

    @Override
    public EnvieDto deleteEnvie(EnvieDto paramEnvie) {
        return null;
    }

    @Override
    public List<EnvieDto> getAll() {
        return null;
    }

    @Override
    public List<EnvieDto> getByClient(ClientDto paramClient) {
        return null;
    }
}