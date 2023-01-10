package Entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {

	@Id
	private Long id;

	@Column (name = "name")
	private String name;

	@Column (name = "surname")
	private String surname;

	@Column (name = "date_of_birth")
	private Date dateOfBirth;

	@ManyToMany(mappedBy = "authors")
	List<Book> books;
	
     // @ManyToMany
     // @JoinTable(
     // name = "author_books", 
     // joinColumns = @JoinColumn(name = "author_id"), 
     // inverseJoinColumns = @JoinColumn(name = "book_id")) 
     // List<Book> books;

	 
	public Author() {
	
	}

	public Author(Long id, String name, String surname, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
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



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public Date getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	public List<Book> getBooks() {
        return books;
    	}


    	public void setBooks(List<Book> books) {
        this.books = books;
    }

}

