package RestServiceImplementations;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import eg.alexandria.library.data.AuthorRepository;
import eg.alexandria.library.data.MediaRepository;
import eg.alexandria.library.model.Author;
import eg.alexandria.library.model.Media;
import restserviceInterface.RestLibrarySearchService;

@Path("/search")
@Stateless
public class RestLibrarySearchServiceImplementation implements RestLibrarySearchService {
	
//Inject something
	@Inject
	private MediaRepository mediaObject;
	@Inject
	private AuthorRepository authorObject;
	

	@GET
	@Override
	@Path("/findbyauthor/{string}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Media> findByAuthor(@PathParam("string") String searchName) {
		
		List<Author> authorList = authorObject.findAuthorsByName(searchName);
		List<Media> mediaList = new ArrayList<>();
		
		for(Author author:authorList) {
			
		mediaList.addAll(mediaObject.findMediaByAuthor(author.getId()));
		
		}			

		return mediaList;
	}

	@GET
	@Override
	@Path("/findbytitle/{string}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Media>  findByTitle(@PathParam("string") String searchTitle) {
		
		
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
	public List<Media> findByFriText(@PathParam("string") String fritext) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
