package eg.alexandria.library.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import eg.alexandria.library.data.LoanRepository;
import eg.alexandria.library.rest.interfaces.RestLibraryLoanService;


@Path("/loan")
@Stateless
public class RestLibraryLoanServiceImplementation implements RestLibraryLoanService {

	@Inject
	private LoanRepository loanObject;
	
	
	
	@POST
	@Override
	@Path("/new/")
	public Response createLoan(@FormParam("personid")int LoanerId, @FormParam("mediaid") int objectId) {
						
		loanObject.addLoan(objectId, LoanerId);

		return Response.status(201).build();
	}

	@PUT
	@Override
	@Path("/renew/{id}")
	public Response renewLoan(@PathParam("id") int objectId) {
		
		loanObject.extendLoan(objectId);
		
		return Response.status(200).build();

	}

	@GET
	@Override
	@Path("/return/{id}")
	public Response returnLoan(@PathParam("id") int objectId) {
		
		loanObject.returnLoan(objectId);
		
		
		return Response.status(200).build();

	}

//	Not implemented yet
	
	@POST
	@Override
	@Path("/reserv/")
	public Response reserveMedia(@FormParam("loanerid") int wouldbeLoanerId, @FormParam("mediaid") int objectId) {
		
		// TODO Auto-generated method stub
		return Response.status(418).build();
	}



}
