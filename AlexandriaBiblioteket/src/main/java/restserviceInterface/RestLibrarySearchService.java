package restserviceInterface;

import java.util.List;

import eg.alexandria.library.model.Author;
import eg.alexandria.library.model.Media;

public interface RestLibrarySearchService {
	
	public List<Media> findByAuthor(String searchName);
	public List<Media> findByTitle(String searchTitle);
	public Media findByISBN(String searchISBN);
	public List<Media> findByFriText(String searchtext);
	

}
