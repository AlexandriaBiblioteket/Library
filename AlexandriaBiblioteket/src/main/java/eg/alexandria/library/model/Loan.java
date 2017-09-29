package eg.alexandria.library.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Calendar;
import java.util.Date;


/**
 * The persistent class for the loan database table.
 * 
 */
@Entity
@Table(name="loan")
@NamedQuery(name="Loan.findAll", query="SELECT l FROM Loan l")
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOut;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dueBack;

	@Column(length=45)
	private String fee;

	@Temporal(TemporalType.TIMESTAMP)
	private Date returned;

	//bi-directional many-to-one association to Media
	@ManyToOne(fetch=FetchType.EAGER,  cascade=CascadeType.ALL)
	@JoinColumn(name="mediaID")
	private Media media;

	//bi-directional many-to-one association to Person
	@ManyToOne(fetch=FetchType.EAGER,  cascade=CascadeType.ALL)
	@JoinColumn(name="personID")
	private Person person;

	public Loan() {
	}
	


	public Loan(Media media2, Person person2) {
		this.media = media2;
		this.person = person2;

		this.dateOut = new Date();
			
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.dateOut);
		cal.add(Calendar.DATE, Media.LOAN_PERIOD);
			
		this.dueBack = cal.getTime();
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

	public Date getReturned() {
		return this.returned;
	}

	public void setReturned(Date returned) {
		this.returned = returned;
	}

	public Media getMedia() {
		return this.media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}