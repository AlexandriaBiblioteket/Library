package eg.alexandria.library.rest.interfaces;

import java.util.List;

import eg.alexandria.library.model.Author;
import eg.alexandria.library.model.Media;

public interface RestLibrarySearchService {
	
	public List<Author> findByAuthor(String searchName);
	public List<Media> findByTitle(String searchTitle);
	public List<Media> findByISBN(String searchISBN);

	

}
