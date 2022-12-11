package Entities;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "book")
public class Book {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name = "name")
	private String name;
	@Column(name = "genre")
	private String genre;
	@Column (name = "release_date")
	private Date releaseDate;
	@Column (name = "isbn", unique = true)
	private String isbn;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
	private List<Rent> rentals;
	
//	@ManyToMany(mappedBy = "books")
//	List<Author> authors;
	
	@ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(
	 name = "author_books", 
	 joinColumns = @JoinColumn(name = "book_id"), 
	 inverseJoinColumns = @JoinColumn(name = "author_id")) 
	List<Author> authors;
	
	public Book() {
		
		
	}
	
	
	public Book(Long id, String name, String genre, Date releaseDate, String isbn) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.isbn = isbn;
		
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public List<Author> getAuthors() {
	    return authors;
	    }

	public void setAuthors(List<Author> authors) {
	    this.authors = authors;
	}
	
	
}
