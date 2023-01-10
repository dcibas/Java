package Services;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import Entities.Book;
import Entities.BookWorm;

public class BookWormService {
	
	public List<BookWorm> getBookWormsList(Session session) {

	        List<BookWorm> bookWorm = session.createQuery("from BookWorm").list();
	        return bookWorm;
	
	}
	
	public void createBookWorm(Session session, BookWorm creatbookworm) {
		
		session.beginTransaction();
		session.save(creatbookworm);
		session.flush();
		session.getTransaction().commit();	
		
		
	}

	public BookWorm getBookWormID(Session session, Long bookWormID) {
		
		Query query = session.createQuery("from BookWorm where id = :bookworm_id");
		query.setLong("bookworm_id", bookWormID);
		BookWorm bookworm = (BookWorm)query.uniqueResult();	
		
		return bookworm;

	}
	
}
