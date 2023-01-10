import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import Entities.Author;
import Entities.Book;
import Entities.BookWorm;
import Entities.Rent;
import Services.AuthorService;
import Services.BookService;
import Services.BookWormService;
import Services.RentService;


public class Main {

	public static void main(String[] args) {
		
		AuthorService authorService = new AuthorService();
		BookService bookService = new BookService();
		BookWormService bookWormService = new BookWormService();
		RentService rentService = new RentService();
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
	      // rentService.bringingBackBooks(session);
		
		rentService.createRentAgreement(session);
		
	      // List<Author> authors = authorService.getAuthorsList(session);
		
	      // for(Author author : authors) {
	      //    System.out.println(author.getId() + " " + author.getName() + " " + author.getSurname() + " " + author.getDateOfBirth());
	      // }
		
	      // System.out.println(authors.size());
		
	      // for(Author author : authors) {
	      //     System.out.println("Author " + author.getName() + " " + author.getSurname() + " has written books ");
	      // for(Book book : author.getBooks()) {
	      //         System.out.println(book.getName());
	      //  }
	      // }
		
	      // LocalDate localDate = LocalDate.of(2016, 8, 19);                       
	      // Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	    
	      // Book book1 = new Book(null, "Book3", "Horror", date, "879512aaasxc");
	      // bookService.createBook(session, book1);
		
	      // for(Book book : books) {
	      // System.out.println("Book " + book.getName() + " " + book.getGenre() + " " + book.getIsbn() + " belongs to this author ");
	      // for(Author author : books.getAuthor()) {
	      //         System.out.println(author.getName());
	      //  }
	      // }   
	    
		
		
	      // System.out.println("");
		
	      // List<Book> books = bookService.getBookList(session);
		
	      // for(Book book : books) {
	      //    System.out.println(book.getId() + " " + book.getName() + " " + book.getGenre() + " " + book.getReleaseDate() + " " + book.getIsbn());
	      // }
		
	      // System.out.println(books.size());
		
	      // List<BookWorm> bookWorms = bookWormService.getBookWormsList(session);
		
	      // for(BookWorm bookworm : bookWorms) {
	      //     System.out.println(bookworm.getId() + " " + bookworm.getPersonalCode() + " " + bookworm.getName() + " " + bookworm.getSurname() + " " + bookworm.getAge());
	      // }
		
	      // System.out.println(bookWorms.size());
		
	      // List<Rent> rents = rentService.getRentsList(session);

	      // for(Rent rent : rents) {
	      //	System.out.println(rent.getId() + " " + rent.getStartDate() + " " + rent.getEndDate() + " " + rent.getNotes() + " " + rent.getBook() + " " + rent.getBookWorm());
	      // }
		
	      // System.out.println(rents.size());
		
	      // for(Rent rent : rents) {
	      //        System.out.println(rent.getId() + " " + rent.getStartDate() + " " + rent.getEndDate() + " " + rent.getNotes() + " " + rent.getBook().getName() + " " + rent.getBookWorm().getName());
	      // }
		
		session.close();
		
	}

}
