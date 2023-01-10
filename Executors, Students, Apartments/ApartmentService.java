package maventest;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;

public class ApartmentService {
	
	public Apartment createApartment(Session session) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter apartment code");
		String apartmentCode = scanner.nextLine();
		
		System.out.println("Enter number of rooms");
		Integer rooms = scanner.nextInt();
		
		Apartment apartment = new Apartment(null, apartmentCode, rooms);
		
		session.beginTransaction();
		session.save(apartment);
		session.getTransaction().commit();
		
		return apartment;
		
	}

	public List<Apartment> getApartmentList(Session session) {

		List<Apartment> apartment= session.createQuery("from Apartment").list();
		
		return apartment;	
		
		}

	}


