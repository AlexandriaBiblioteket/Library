package RestServiceImplementations;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import eg.alexandria.library.model.Media;
import restserviceInterface.RestLibrarySearchService;

@Path("/search")
@Stateless
public class RestLibrarySearchServiceImplementation implements RestLibrarySearchService {
	
//Inject something
	

	@GET
	@Override
	@Path("/findbyauthor/{string}")
	@Produces(MediaType.APPLICATION_JSON)
	public Media findByAuthor(@PathParam("string") String searchName) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	@Override
	@Path("/findbytitle/{string}")
	@Produces(MediaType.APPLICATION_JSON)
	public Media findByTitle(@PathParam("string") String searchTitle) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	@Override
	@Path("/findbyisbn/{string}")
	@Produces(MediaType.APPLICATION_JSON)
	public Media findByISBN(@PathParam("string") String searchISBN) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	@Override
	@Path("/{string}")
	@Produces(MediaType.APPLICATION_JSON)
	public Media findByFriText(@PathParam("string") String fritext) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
