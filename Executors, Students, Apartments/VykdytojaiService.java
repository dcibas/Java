package maventest;

import java.util.List;
import org.hibernate.Session;

public class VykdytojaiService {
	
	public List<Vykdytojai> readVykdytojaiList(Session session) {
		
		List<Vykdytojai> vykdytojai = session.createQuery("from Vykdytojai").list();
		return vykdytojai;
		
	}

}
