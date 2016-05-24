package fr.s2re.rest.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/services/rest")
public class MyRestApplicationConfig  extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(fr.s2re.rest.impl.webservice.ServiceDeviseWebServiceImp.class);
		return classes;
	}
}
