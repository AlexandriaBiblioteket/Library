package eg.alexandria.library.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import eg.alexandria.library.model.Person;

@ApplicationScoped
public class PersonRepository {
	
	@Inject
	EntityManager em;
	
	public Person getPersonById(int id) {
		return em.find(Person.class, id);
	}
	
	public List<Person> findPersonsByName(String name){
		Query q				= em.createQuery("select person from Person person where person.name like :name", Person.class);
		q.setParameter("name", "%" + name.toLowerCase() + "%");
		return q.getResultList();
	}
	
	public void addPerson(String name) {
		Person person		= new Person(name);
		em.persist(person);
	}
	
	public void deletePerson(int id) {
		Person p			= em.find(Person.class, id);
		em.remove(p);
	}
	
	public void updatePerson(int id, String newName) {
		Person p			= em.find(Person.class, id);
		p.setName(newName);
	}
}
