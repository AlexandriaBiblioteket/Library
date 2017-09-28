package RestServiceImplementations;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;
import restserviceInterface.RestLibraryLoanService;


@Path("/loan")
@Stateless
public class RestLibraryLoanServiceImplementation implements RestLibraryLoanService {

	@POST
	@Override
	@Path("/new/{id1}/{id2}")
	public void createLoan(@PathParam("id1")int LoanerId, @FormParam("id2") int objectId) {
		// TODO Auto-generated method stub

	}

	@GET
	@Override
	@Path("/renew/{id}")

	public void renewLoan(@PathParam("id") int objectId) {
		// TODO Auto-generated method stub

	}

	@GET
	@Override
	@Path("/return/{id}")
	public void returnLoan(@PathParam("id") int objectId) {
		// TODO Auto-generated method stub

	}

	@POST
	@Override
	@Path("/reserv/{id1}/{id2}")
	public void reserveMedia(@PathParam("id1") int wouldbeLoanerId, @PathParam("id2") int objectId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void renewLoan(Media object) {
		// TODO Auto-generated method stub
		
	}

}
