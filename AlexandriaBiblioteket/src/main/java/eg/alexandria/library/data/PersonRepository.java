package eg.alexandria.library.data;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import eg.alexandria.library.model.Author;
import eg.alexandria.library.model.Person;

public class PersonRepository {
	
	@Inject
	EntityManager em;
	
	public Person getPersonById(int id) {
		return em.find(Person.class, id);
	}
	
	public List<Person> findPersonsByName(String name){
		Query q				= em.createQuery("select person from Person person where name = :name", Author.class);
		q.setParameter("name", name);
		return q.getResultList();
	}
	
	public void addPerson(Person person) {
		em.persist(person);
	}
	

}
