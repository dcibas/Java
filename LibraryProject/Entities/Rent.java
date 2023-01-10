package Entities;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "rent")
@SequenceGenerator(name = "rent_id_seq",
sequenceName = "rent_id_seq",
allocationSize = 1)
public class Rent {
	
	@Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_id_seq")
	
	private Long id;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	private String notes;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id")
	private Book book;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookworm_id")
	private BookWorm bookWorm;


	public Rent() {
		
	}

	public Rent(Long id, Date startDate, Date endDate, String notes, Book book, BookWorm bookWorm) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.notes = notes;
		this.book = book;
		this.bookWorm = bookWorm;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public String getNotes() {
		return notes;
	}



	public void setNotes(String notes) {
		this.notes = notes;
	}



	public Book getBook() {
		return book;
	}



	public void setBook(Book book) {
		this.book = book;
	}



	public BookWorm getBookWorm() {
		return bookWorm;
	}



	public void setBookWorm(BookWorm bookWorm) {
		this.bookWorm = bookWorm;
	}
	
	
}
