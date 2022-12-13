import java.util.ArrayList;
import java.util.Scanner;

public class PirmasDinaminis {
	
	static ArrayList<String> sarasas = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	System.out.println("Iveskite zodzius");
	
	for(int i = 0; i < 30; i++) {
		String zodis1 = sc.nextLine();
		boolean contains = sarasas.contains(zodis1);

	
	if(zodis1.equals(".")) {
		System.out.println("Irasu kiekis: " + sarasas.size());
		break;
	}
	sarasas.add(zodis1);
	if(sarasas.size() == 5) {
		sarasas.clear();
		System.out.println("Sarasas isvalytas! Teskite.");
		i=-1;
	}
	
	else if(contains) {
		System.out.println("Klaida: Sarase jau yra tokia reiksme");
		sarasas.remove(i);
		i -= 1;
	}
	else {
		System.out.println("Prideta i sarasas.");
	}
	
   }
    
 }
	
}
	
	

	

	
