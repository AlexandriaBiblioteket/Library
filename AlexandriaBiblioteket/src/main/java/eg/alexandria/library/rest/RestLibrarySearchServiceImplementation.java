package eg.alexandria.library.rest;

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
import eg.alexandria.library.rest.interfaces.RestLibrarySearchService;

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
		
		List<Media> mediaList = new ArrayList<>();
		
		mediaList.addAll(mediaObject.findMediaByTitle(searchTitle));
				
		return mediaList;
	}

	@GET
	@Override
	@Path("/findbyisbn/{string}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Media> findByISBN(@PathParam("string") String searchISBN) {
		
		List<Media> mediaList = new ArrayList<>();
		
		mediaList.addAll(mediaObject.findMediaByISBN(searchISBN));
				
		return mediaList;

	}
}
