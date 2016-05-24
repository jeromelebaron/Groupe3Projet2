package fr.s2re.rest.impl.webservice;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.log4j.Logger;

import fr.s2re.banque.api.business.IDeviseBusiness;
import fr.s2re.banque.dto.DeviseDto;

@Path("/deviseService")
@Produces("application/json")
public class ServiceDeviseWebServiceImp {
	private Logger logger = Logger.getLogger(ServiceDeviseWebServiceImp.class);
	
	IDeviseBusiness deviseBusiness ;
	@GET
	@Path("/devise/{code}")
	//http://localhost:8080/Banque-DeviseWS-0.0.1-SNAPSHOT/services/rest/deviseService/devise/EUR
	public DeviseDto rechercherDeviseParCode(@PathParam("code")String code) {
		return deviseBusiness.rechercherDeviseParCode(code);
		
	}
	@PostConstruct
	public void init () {
		try{
	        InitialContext ctx=new InitialContext();
	        deviseBusiness = (IDeviseBusiness) ctx.lookup("java:global/Banque-EAR/Banque-Business-0.0.1-SNAPSHOT/DeviseBusiness!fr.s2re.banque.api.business.IDeviseBusiness");
	       }catch(NamingException ne){
	            System.out.println("\n[MyRestService]NamingException: "+ne);
	            ne.printStackTrace();
	       }
	}

	@GET 
	@Path("/convert")
	@Produces("text/plain")
	//fin d'URL en convert?amont=50&src=EUR&target=USD
	public double convertir(@QueryParam("amont") Double amount,@QueryParam("src") String src,@QueryParam("target")String target) {
		return deviseBusiness.convertir(amount, src, target);
		
	}

	@PUT
	@Path("/devise")
	@Consumes("application/json")
	public DeviseDto updateDevise(DeviseDto dev) {
		return deviseBusiness.updateDevise(dev);
		
	}

	@GET
	@Path("/devise")
	//fin URL en deviseService/devise
		//ou bien    deviseService/devise?changeMini=1&param2=val2
	public List<DeviseDto> rechercherDevises(@QueryParam("changeMini") Double changeMini) {
		return deviseBusiness.rechercherDevises(changeMini);

	}

	public IDeviseBusiness getDeviseBusiness() {
		return deviseBusiness;
	}

	public void setDeviseBusiness(IDeviseBusiness deviseBusiness) {
		this.deviseBusiness = deviseBusiness;
	}


}
