package eg.alexandria.library.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import eg.alexandria.library.model.Author;
import eg.alexandria.library.model.Media;

@ApplicationScoped
public class MediaRepository {
	
	@Inject
	EntityManager em;
	
	public Media findMediaById(int id) {
		return em.find(Media.class, id);
	}
	
	public List<Media> findMediaByAuthor(int authorId){
		Query q				= em.createQuery("select media from Media media where media.authorID = :id", Media.class);
		q.setParameter("id", authorId);
		return q.getResultList();
	}
	
	public List<Media> findMediaByTitle(String title){
		Query q				= em.createQuery("select media from Media media where media.name like :name", Media.class);
		q.setParameter("name", "%" + title.toLowerCase() + "%");
		return q.getResultList();
	}
	
	public List<Media> findMediaByISBN(String isbn) {
		Query q				= em.createQuery("select media from Media media where media.isbn = :isbn", Media.class);
		q.setParameter("isbn", isbn);
		return q.getResultList();
	}
	
	public void deleteMedia(int id) {
		Media m				= em.find(Media.class, id);
		em.remove(m);
	}
	
	public void addMedia(Author author, String isbn, String name, String mediatype) {
		Media m				= new Media(author, isbn, name, mediatype);
		em.persist(m);
	}
	
	public void updateMedia(int id, byte status) {
		Media m				= em.find(Media.class, id);
		m.setStatus(status);
	}
	
	//Overload of addMedia above
	public void addMedia(Media media) {
		
		//Media m	= new Media(media.getAuthorID(), media.getIsbn(), media.getName());
		em.persist(media);
	}
	
}
