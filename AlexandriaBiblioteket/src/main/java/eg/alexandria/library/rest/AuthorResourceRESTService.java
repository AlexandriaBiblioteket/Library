package eg.alexandria.library.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eg.alexandria.library.model.Author;

@Path("/author")
public class AuthorResourceRESTService {
	
	@OPTIONS
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response optionsForAuthorResource() {
		return Response.status(200)
				.header("Allow", "POST,GET,PUT")
				.header("Content-Type", MediaType.APPLICATION_JSON)
				.header("Content-Length", "0")
				.build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Author> findAllAuthors(){
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Author findAuthorById(@PathParam("id") int id) {
		return null;
	}
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/")

}
