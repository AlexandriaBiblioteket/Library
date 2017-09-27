package restserviceInterface;

import eg.alexandria.library.model.Author;
import eg.alexandria.library.model.Media;

public interface RestLibrarySearchService {
	
	public Media findByAuthor(String searchName);
	public Media findByTitle(String searchTitle);
	public Media findByISBN(String searchISBN);
	public Media findByFriText(String searchISBN);
	

}
