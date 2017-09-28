package eg.alexandria.library.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the media database table.
 * 
 */
@Entity
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int LOAN_PERIOD		= 30;
	public static final int EXTEND_LOAN		= 10;
	public static final int OVERDUE_FEE		= 1;

	@Id
	private int id;

	private int authorID;

	private String isbn;

	private String name;

	private int personID;

	private byte status;

	public Media() {
	}
	
	public Media(int authorID, String isbn, String name) {
		this.authorID		= authorID;
		this.isbn			= isbn;
		this.name			= name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthorID() {
		return this.authorID;
	}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonID() {
		return this.personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}