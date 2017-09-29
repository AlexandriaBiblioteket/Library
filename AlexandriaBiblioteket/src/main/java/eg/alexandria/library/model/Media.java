package eg.alexandria.library.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the media database table.
 * 
 */
@Entity
@Table(name="media")
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int EXTEND_LOAN = 10;
	public static final long OVERDUE_FEE = 1;

	public static final int LOAN_PERIOD = 30;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=32)
	private String isbn;

	@Column(length=10)
	private String mediatype;

	@Column(length=200)
	private String name;

	private byte status;

	//bi-directional many-to-one association to Loan
	@OneToMany(mappedBy="media")
	private List<Loan> loans;

	//bi-directional many-to-one association to Author
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="authorID")
	private Author author;

	public Media() {
	}
	
	public Media(Author author, String isbn, String name, String mediatype) {
		this.author = author;
		this.isbn = isbn;
		this.name=name;
		this.mediatype=mediatype;
		
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getMediatype() {
		return this.mediatype;
	}

	public void setMediatype(String mediatype) {
		this.mediatype = mediatype;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public List<Loan> getLoans() {
		return this.loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	public Loan addLoan(Loan loan) {
		getLoans().add(loan);
		loan.setMedia(this);

		return loan;
	}

	public Loan removeLoan(Loan loan) {
		getLoans().remove(loan);
		loan.setMedia(null);

		return loan;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}