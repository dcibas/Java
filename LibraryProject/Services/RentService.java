package Services;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.apache.commons.lang3.time.DateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import Entities.Book;
import Entities.BookWorm;
import Entities.Rent;

public class RentService {

	public List<Rent> getRentsList(Session session){

		List<Rent> rentList = session.createQuery("from Rent").list();
		return rentList;
		
		}
	
	public List<Rent> getRentListForBookworm(Session session, Long id){
		
		Query query = session.createQuery("from Rent where bookworm_id = :id");
		query.setLong("id", id);
		
		return (List<Rent>) query.list();
		
	}
	
	
	public void printRentList(Session session) {
		
		List<Rent> rentals = session.createQuery("from Rent").list();
		String rented;
		String bookwormName;
		String bookName;
		
		for(Rent rent : rentals) {
			
			String rentStart = rent.getStartDate().toString().substring(0, 10);
			String rentEnd = rent.getEndDate().toString().substring(0, 10);
			
			bookwormName = rent.getBookWorm().getName();
			bookName = rent.getBook().getName();
			System.out.println("ID" + rent.getId() + "Book: " + bookName + "Rented by: " + bookwormName + rent.getStartDate() + " - " + rent.getEndDate());
		}
	}
	
	public void createRentAgreement(Session session) {
		
		session.beginTransaction();
		BookService bookService = new BookService();
		BookWormService bookwormService = new BookWormService();
		Date now = new Date();
		Date endDate = DateUtils.addMonths(now, 1);
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Book> books = bookService.getBookList(session);
		for(Book book : books) {
			System.out.println(book.getId() + " " + book.getName() + " " + book.getGenre() + " " + book.getReleaseDate() + " " + book.getIsbn());
		}
		System.out.println("Which book does this user want to rent? (Book ID)");
		Long bookID = sc.nextLong();
		List<BookWorm> bookWorms = bookwormService.getBookWormsList(session);

		for(BookWorm bookworm : bookWorms) {
			System.out.println(bookworm.getId() + " " + bookworm.getPersonalCode() + " " + bookworm.getName() + " " + bookworm.getSurname() + " " + bookworm.getAge());
		}
		System.out.println("For which reader do you want to make an agreement? (Reader ID)");
		Long bookwormID = sc.nextLong();
		
		List<Rent> maderents = session.createQuery("from Rent").list();
		
		List<Rent> rentsforonebook = maderents.stream().filter(rent -> rent.getBook().getId().equals(bookID)).collect(Collectors.toList());
		
		boolean bookisnotavailable = rentsforonebook.stream().anyMatch(rent -> rent.getEndDate().after(new Date()));
		
		if(bookisnotavailable) {
			System.out.println("This book is not available");
			
		} else {
			
			Rent rent = new Rent();
			
			List<Rent> borrowed = getRentListForBookworm(session, bookID);
			if(bookService.validateRented(session, bookID)) {
				System.out.println("Already borrowed, please select another book");
				createRentAgreement(session);
			} else {
			
			rent.setBook(bookService.getBookID(session, bookID));
			rent.setBookWorm(bookwormService.getBookWormID(session, bookwormID));
			rent.setStartDate(now);
			rent.setEndDate(endDate);
			
			
			session.save(rent);
			session.getTransaction().commit();	
		}
		
	  }
		
	}
	
	public void bringingBackBooks(Session session) {
		
		List<Rent>rents = getRentsList(session);
		
		rents = rents.stream().filter(rent -> rent.getEndDate().after(new Date()))
				.collect(Collectors.toList());
		for(Rent rent : rents) {
			System.out.println(rent.getBook().getName() + " " + rent.getId());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book you want to bring back");
		
		Long rentId = sc.nextLong();
		Rent rentlist = rents.stream().filter(rentid -> rentid.getId().equals(rentId))
				.collect(Collectors.toList()).get(0);
		
		rentlist.setEndDate(new Date());
		
		session.beginTransaction();
		session.saveOrUpdate(rentlist);
		session.getTransaction().commit();
		
				
	}
	
}
