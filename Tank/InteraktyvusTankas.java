import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class InteraktyvusTankas {
	
	Tankas2 tankas = new Tankas2();
	
	public static void main(String[] args) {
		
		System.out.println("Nustatymai: ");
		System.out.println("w - vaziuoti pirmyn");
		System.out.println("a - vaziuoti kairen");
		System.out.println("s - vaziuoti atgal");
		System.out.println("d - vaziuoti desinen");
		System.out.println("e - Sauti");
		System.out.println("i - Informacija apie tanko padeti");
		System.out.println("x - Nutraukti kelione");		
		
		InteraktyvusTankas tankas = new InteraktyvusTankas();
		
		tankas.komanda();
		
	}
		public void komanda() {
			
			LocalDateTime t = LocalDateTime.now();
			String timeNow = t.format(DateTimeFormatter.BASIC_ISO_DATE);
			DateTimeFormatter timeDisplay = DateTimeFormatter.ofPattern("HH:mm");
			timeNow = t.format(timeDisplay);

		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Iveskite komanda: ");
			String a = scanner.nextLine();
			
			if (a.equals("w")) {
				System.out.println(timeNow);
				tankas.pirmyn();
				komanda();
				
			} else if (a.equals("d")) {
				System.out.println(timeNow);
				tankas.desinen();
				komanda();
				
			} else if (a.equals("s")) {
				System.out.println(timeNow);
				tankas.atgal();
				komanda();
				
			} else if (a.equals("a")) {
				System.out.println(timeNow);
				tankas.kairen();
				komanda();
				
			} else if (a.equals("i")) {
				System.out.println(timeNow);
				tankas.info();
				komanda();
				
			} else if (a.equals("e")) {
				System.out.println(timeNow);
				tankas.suvis();
				komanda();
				
			} else if (a.equals("x")) {
				System.out.println(timeNow);
				System.out.println("Keliones tikslas pasiektas!");
				
			} else {
				System.out.println(timeNow);
				System.out.println("Netinkama komanda!");
				
				komanda();
			}
		}

}
