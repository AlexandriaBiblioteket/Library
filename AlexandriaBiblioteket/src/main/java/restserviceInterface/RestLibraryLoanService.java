package restserviceInterface;

import javax.ws.rs.core.Response;

import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;

public interface RestLibraryLoanService {

	//Not implemented yet!
//	public void createReminder(Person lateLoaner, Media object);
//	public void deleteReminder(Person lateLoaner, Media object);

	
	
	

	

	public Response reserveMedia(int wouldbeLoanerId, int objectId);
	public Response returnLoan(int objectId);
	public Response renewLoan(int objectId);
	public Response createLoan(int LoanerId, int objectId);
	
	
}
