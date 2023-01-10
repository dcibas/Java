package maventest;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello Maven");
		
		StudentService studentService = new StudentService();
		VykdytojaiService vykdytojaiService = new VykdytojaiService();	
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		List<Vykdytojai> vykdytojai = vykdytojaiService.readVykdytojaiList(session);
		
		ApartmentService apartmentService = new ApartmentService();
		
		apartmentService.createApartment(session);
		
		apartmentService.getApartmentList(session);
		
		
	     // studentService.createStudent(session);
		
		List<Student> allStudents = studentService.readSudentsList(session);
		for(Student student : allStudents) {
			System.out.println(student.getId() + " " + student.getName() + " " + student.getSurname() + " " + student.getCourse());
		}
		
	     // Student student = studentService.getStudentById(session, 1L);
		
	     // System.out.println(student.getId() + " " + student.getName() + " " + student.getSurname() + student.getCourse());
		
	    // List<Student> students = studentService.getStudentByCourse(session, 3);
		
	    // for(Student student : students) {
	    //	System.out.println(student.getId() + " " + student.getName() + " " + student.getSurname() + " " + student.getCourse());
	    // }
		
	    // studentService.deleteStudentById(session, 3L);
		
	    // studentService.updateStudentById(session, 4L);
		
	       session.close();
		
	}

}
