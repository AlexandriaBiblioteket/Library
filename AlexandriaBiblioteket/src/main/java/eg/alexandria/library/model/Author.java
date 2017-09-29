package eg.alexandria.library.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the author database table.
 * 
 */
@Entity
@Table(name="author")
@NamedQuery(name="Author.findAll", query="SELECT a FROM Author a")
public class Author implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=200)
	private String name;

	//bi-directional many-to-one association to Media
	@OneToMany(mappedBy="author" , cascade= CascadeType.ALL , fetch=FetchType.EAGER)
	private List<Media> medias;

	public Author() {
	}
	
	public Author(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Media> getMedias() {
		return this.medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

	public Media addMedia(Media media) {
		getMedias().add(media);
		media.setAuthor(this);

		return media;
	}

	public Media removeMedia(Media media) {
		getMedias().remove(media);
		media.setAuthor(null);

		return media;
	}

}