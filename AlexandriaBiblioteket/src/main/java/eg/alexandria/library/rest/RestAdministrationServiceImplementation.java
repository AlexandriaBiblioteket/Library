package eg.alexandria.library.rest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eg.alexandria.library.data.LoanRepository;
import eg.alexandria.library.data.MediaRepository;
import eg.alexandria.library.data.PersonRepository;
import eg.alexandria.library.model.Loan;
import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;
import eg.alexandria.library.rest.interfaces.RestAdministrationService;


@Path("/admin")
@Stateless
public class RestAdministrationServiceImplementation implements RestAdministrationService {
		
	@Inject
	private MediaRepository mediaObject;
	@Inject
	private PersonRepository personObject;
	@Inject
	private LoanRepository loanObject;

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public Response optionsForAuthorResource() throws MalformedURLException, URISyntaxException {
		
		URL myURL = new URL("http://localhost:8080/alexandriabiblioteket/");
		URL page1URL = new URL(myURL, "index.html");
		
		//return Response.seeOther(page1URL.toURI()).build();
		
		return Response.status(200).build();
	}
	
	
	
	@POST
	@Override
	@Path("/newmedia")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addNewMedia(Media newMedia) {	
		
		mediaObject.addMedia(newMedia); //ought to have a return type indicating success of persistence
		
		return Response.status(201).build();
		
	}

	@GET
	@Override
	@Path("/listperson/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findPersonById(@PathParam("id") int loanerId) {
				
		return Response.ok(personObject.getPersonById(loanerId)).status(200).build();
	}

	@GET
	@Override
	@Path("/listpersonsloan/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Loan> listAllPersonsLoan(@PathParam("id") int loanerId) {

		List<Loan> loanList = new ArrayList<>();
		
		loanList.addAll(loanObject.findLoansByBorrower(loanerId));
		
		return loanList;
	}

	@POST
	@Override
	@Path("/newperson/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createNewPerson(@FormParam("name") String newLoaner) {

			personObject.addPerson(newLoaner); // should be a bit more than just name, ie turn this into an object in the future
			
			return Response.status(201).build();

	}

	@DELETE
	@Override
	@Path("/person/{id}")
	public Response deletePerson(@PathParam("id") int id) {
		
		personObject.deletePerson(id);;
		
		return Response.status(200).build();
		
	}

	@PUT
	@Override
	@Path("/updateperson/{id}/{newname}")
	public Response updatePerson(@PathParam("id") int id, @PathParam("newname") String newName) {

		personObject.updatePerson(id, newName);
		
		return Response.status(200).build();
		
	}

	@DELETE
	@Override
	@Path("/media/{id}")
	public Response deleteMedia(@PathParam("id") int id) {
		
		mediaObject.deleteMedia(id);
		
		return Response.status(200).build();
		
	}

	@PUT
	@Override
	@Path("/updatemedia/{id}/{status}")
	public Response updateMedia(@PathParam("id") int id, @PathParam("status") byte status) {
		
		mediaObject.updateMedia(id, status);

		return Response.status(200).build();
		
	}

}
