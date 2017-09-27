package eg.alexandria.library.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the loan database table.
 * 
 */
@Entity
@NamedQuery(name="Loan.findAll", query="SELECT l FROM Loan l")
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOut;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dueBack;

	private String fee;

	private int mediaID;

	private int personID;

	@Temporal(TemporalType.TIMESTAMP)
	private Date returned;

	public Loan() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOut() {
		return this.dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public Date getDueBack() {
		return this.dueBack;
	}

	public void setDueBack(Date dueBack) {
		this.dueBack = dueBack;
	}

	public String getFee() {
		return this.fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public int getMediaID() {
		return this.mediaID;
	}

	public void setMediaID(int mediaID) {
		this.mediaID = mediaID;
	}

	public int getPersonID() {
		return this.personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public Date getReturned() {
		return this.returned;
	}

	public void setReturned(Date returned) {
		this.returned = returned;
	}

}