package eg.alexandria.library.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import eg.alexandria.library.model.Author;

@ApplicationScoped
public class AuthorRepository {
	
	@Inject
	EntityManager em;
	
	public Author findAuthorById(Long id) {
		return em.find(Author.class, id);
	}
	
	public List<Author> findAuthorsByName(String name){
		Query q				= em.createQuery("select author from Author author where name = :name", Author.class);
		q.setParameter("name", name);
		return q.getResultList();
	}
	
	public void addAuthor(Author author) {
		em.persist(author);
	}
	
}
