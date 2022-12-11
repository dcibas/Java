package Services;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.hibernate.Query;
import org.hibernate.Session;
import Entities.Author;
import Entities.Book;
import Entities.BookWorm;
import Entities.Rent;

public class BookService {

public List<Book> getBookList(Session session){
		
		List<Book> book = session.createQuery("from Book").list();
		return book;
		
	}

	public Book createBook(Session session, Book createbook) {
		
		AuthorService authorService = new AuthorService();
	   
	    List<Author> authors = authorService.getAuthorsList(session);
	    
	    createbook.setAuthors(new ArrayList<Author>(Arrays.asList(authors.get(0))));
	    
	   // author.setBooks(new ArrayList<Book>(Arrays.asList(books.get(0))));
	    
	    session.beginTransaction();
		session.save(createbook);
		session.flush();
		session.getTransaction().commit();
		
		return createbook;
	    
	}

	public Book getBookID(Session session, Long bookID) {
		
		Query query = session.createQuery("from Book where id = :book_id");
		query.setLong("book_id", bookID);
		Book book = (Book)query.uniqueResult();
		
		return book;
	}
	
	public boolean validateRented(Session session, Long bookId) {
		
		RentService rentService = new RentService();
		BookService bookwormService = new BookService();
		
		List<Book> books = getBookList(session);
		List<BookWorm> bookworms = bookwormService.getBookWormsList(session);
		List<Rent> rents = rentService.getRentsList(session);
		
		rents = rents.stream().filter(bookid -> bookid.getEndDate().after(new Date()))
				.collect(Collectors.toList());
		
		for (Rent rent : rents) {
			if((rent.getBook().getId().equals(bookId))) {
				return true;
			}
		}
		
		return false;
				
		
	}

	private List<BookWorm> getBookWormsList(Session session) {
		List<BookWorm> bookWorm = session.createQuery("from BookWorm").list();
		return bookWorm;	
	}
	
}
