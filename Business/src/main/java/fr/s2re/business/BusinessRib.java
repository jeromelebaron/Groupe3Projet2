package fr.s2re.business;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.RibDto;
import fr.s2re.ibusiness.IBusinessRib;

@Remote(IBusinessRib.class)
@Stateless
public class BusinessRib implements IBusinessRib {
    @Override
    public RibDto addRib(RibDto paramRib) {
        return null;
    }

    @Override
    public RibDto updateRib(RibDto paramRib) {
        return null;
    }

    @Override
    public RibDto getByClient(ClientDto paramClient) {
        return null;
    }
}