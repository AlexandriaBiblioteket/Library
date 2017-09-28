package restserviceInterface;

import java.util.List;

import javax.ws.rs.core.Response;

import eg.alexandria.library.model.Loan;
import eg.alexandria.library.model.Media;
import eg.alexandria.library.model.Person;

public interface RestAdministrationService {
	
	public Response addNewMedia(Media newMedia);
	

	public List<Loan> listAllPersonsLoan(int loanerId);
	
	public Response createNewPerson(String newLoaner);
	
	public Response findPersonById(int searchId);
	
	public Response deletePerson(int id);
	
	public Response updatePerson(int id, String newName);


}
