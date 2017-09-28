package RestServiceImplementations;

import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import eg.alexandria.library.model.Loan;
import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;
import restserviceInterface.RestAdministrationService;


@Path("/admin")
@Stateless
public class RestAdministrationServiceImplementation implements RestAdministrationService {
	
	
	
	//Inject something

	@POST
	@Override
	@Path("/newmedia")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addNewMedia(Media newMedia) {
		// TODO Auto-generated method stub

	}

	@GET
	@Override
	@Path("/listperson/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Person listAllAboutPerson(@PathParam("id") int loanerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	@Override
	@Path("/listpersonsloan/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Loan> listAllPersonsLoan(@PathParam("id") int loanerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@POST
	@Override
	@Path("/newperson")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createNewPerson(Person newLoaner) {
		// TODO Auto-generated method stub

	}

}
