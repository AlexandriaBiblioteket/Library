package eg.alexandria.library.data;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import eg.alexandria.library.model.Loan;
import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;

public class LoanRepository {
	
	@Inject
	EntityManager em;
	
	public Loan findLoanById(int id) {
		return em.find(Loan.class, id);
	}
	
	public List<Loan> findLoansByBorrower(int id){
		Query q			= em.createQuery("select loan from Loan loan where loan.personID = :id", Loan.class);
		q.setParameter("id", id);
		return q.getResultList();
	}
	
	public void addLoan(Media media, Person person) {
		Loan l			= new Loan(media, person);
		em.persist(l);
	}
	
	public void extendLoan(int id) {
		Loan l			= em.find(Loan.class, id);
		
		Calendar cal	= Calendar.getInstance();
		cal.setTime(l.getDueBack());
		cal.add(Calendar.DATE, Media.EXTEND_LOAN);
		
		l.setDueBack(cal.getTime());
	}
	
	public void returnLoan(int id) {
		Loan l			= em.find(Loan.class, id);
		l.setReturned(new Date());
		
		if (l.getDueBack().before(l.getReturned())) {
			long overdue	= TimeUnit.MILLISECONDS.toDays(l.getReturned().getTime() - l.getDueBack().getTime());
			l.setFee(Long.toString((overdue * Media.OVERDUE_FEE)));
		}
	}

}
