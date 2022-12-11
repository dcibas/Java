package Services;

import java.util.List;
import org.hibernate.Session;
import Entities.Author;


public class AuthorService {

	public List<Author> getAuthorsList(Session session){
		
		List<Author> author = session.createQuery("from Author").list();
		return author;
		
	}
	
	public void createAuthor(Session session, Author createauthor) {
		
		session.beginTransaction();
		session.save(createauthor);
		session.flush();
		session.getTransaction().commit();		
		
	}
	
}
