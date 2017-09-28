package restserviceInterface;

import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;

public interface RestLibraryLoanService {

	//Not implemented yet!
//	public void createReminder(Person lateLoaner, Media object);
//	public void deleteReminder(Person lateLoaner, Media object);

	
	
	

	

	public void reserveMedia(int wouldbeLoanerId, int objectId);
	public void returnLoan(int objectId);
	public void renewLoan(int objectId);
	public void createLoan(int LoanerId, int objectId);
	
	
}
