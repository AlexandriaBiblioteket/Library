package restserviceInterface;

import java.util.List;

import eg.alexandria.library.model.Loan;
import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;

public interface RestAdministrationService {
	
	public void addNewMedia(Media newMedia);
	
	public Person listAllAboutPerson(int loanerId);
	public List<Loan> listAllPersonsLoan(int loanerId);
	
	public void createNewPerson(Person newLoaner);

}
