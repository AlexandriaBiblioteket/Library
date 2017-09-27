package restserviceInterface;

import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;

public interface RestLibraryLoanService {

	//Not implemented yet!
//	public void createReminder(Person lateLoaner, Media object);
//	public void deleteReminder(Person lateLoaner, Media object);

	
	public void createLoan(Person Loaner, Media object); //remember to clear reservations
	public void renewLoan(Media object);
	public void returnLoan(Media object);
	
	public void reserveMedia( Person wouldbeLoaner, Media object);
	
	
}
