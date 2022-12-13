import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class PagrindineHash {

	public static void main(String[] args) {
	
		HashSet<Integer> skaiciaiHashSet = new HashSet<>();
		ArrayList<Integer> skaiciaiArrayList = new ArrayList<>();
			
		skaiciaiHashSet.add(10);
		skaiciaiHashSet.add(8);
		skaiciaiHashSet.add(15);
		skaiciaiHashSet.add(7);
		skaiciaiHashSet.add(10);
		skaiciaiHashSet.add(29);
		skaiciaiHashSet.add(3);
		
		skaiciaiArrayList.add(10);
		skaiciaiArrayList.add(8);
		skaiciaiArrayList.add(7);
		skaiciaiArrayList.add(10);
		
		System.out.println("HashSeto dydis: " + skaiciaiHashSet.size());
		System.out.println("ArrayListo dydis: " + skaiciaiArrayList.size());
		
		//System.out.println(didziausiasSkaicius(skaiciaiHashSet));
		
		System.out.println(String.format("Maziausias skaicius hashsete: %d", maziausiasSkaicius(skaiciaiHashSet)));
		
		
		HashSet<String> hashSetString = new HashSet<>();
		hashSetString.add("Element1");
		hashSetString.add("Element2");
		hashSetString.add("Element3");
		
		spausdintiHashSet(hashSetString);
		
		hashSetString.add("Element1");
		spausdintiHashSet(hashSetString);
		
		System.out.println("Tikrinu ir istrinu Element2");
		
		if(hashSetString.contains("Element2")) {
			hashSetString.remove("Element2");
		}
		
		spausdintiHashSet(hashSetString);
		
		System.out.println("Istrinami visi elementai");
		hashSetString.clear();
		
		spausdintiHashSet(hashSetString);
		
		
		/* ----------------------------------------------------- */
		
		HashMap<String, Integer> hashMapas = new HashMap<>();
		hashMapas.put("Vienas", 1);
		hashMapas.put("Du", 2);
		hashMapas.put("Trys", 3);
		hashMapas.put("Null", null);
		
		Integer skaicius1 = hashMapas.get("Vienas");

		
		HashMap<Integer, String> hashMapasIntegerString = new HashMap<>();
		hashMapasIntegerString.put(1,"Vienas");
		hashMapasIntegerString.put(2,"Du");
		hashMapasIntegerString.put(3,"Trys");
		hashMapasIntegerString.put(4,"Null");
		
		String skaicius3String = hashMapasIntegerString.get(3);
		
		
		//ArrayList<Integer> visosReiksmes = (ArrayList<Integer>) hashMapas.values();
		
		Set<String> visiRaktai = hashMapas.keySet();
		
		for(String raktas : visiRaktai) {
			System.out.println("Raktas: " + raktas + " Reiksme: " + hashMapas.get(raktas));
			
		}
		
		
		/* Uzduotis Nr 1 */
		
		System.out.println("************* UZDUOTIS1 ****************");
		HashMap<Integer, String> hashMapUzduotis1 = new HashMap<>();
		hashMapUzduotis1.put(11, "Vienuolika");
		hashMapUzduotis1.put(12, "Dvylika");
		hashMapUzduotis1.put(100, "Simtas");
		

		if(hashMapUzduotis1.containsKey(11)) {
			System.out.println("Yra raktas 11");
		}
		
		if(hashMapUzduotis1.containsValue("Simtas")) {
			System.out.println("Yra reiksme simtas");
		}
		
		String reiksme = hashMapUzduotis1.get(12);
		System.out.println(reiksme);
		
		/* Uzduotis Nr 2 */
		
		System.out.println("************* UZDUOTIS2 ****************");
		
		spausdintMap(hashMapUzduotis1);
		
		hashMapUzduotis1.remove(11);
		
		spausdintMap(hashMapUzduotis1);
		
		hashMapUzduotis1.clear();
		
		spausdintMap(hashMapUzduotis1);
		
		
		/* Uzduotis Nr 3 */
			
		System.out.println("************* UZDUOTIS3 ****************");
		
		HashMap<Integer, String> hashMapUzduotis3 = new HashMap<>();
		hashMapUzduotis3.put(11, "vienuolika");
		hashMapUzduotis3.put(12, "dvylika");
		hashMapUzduotis3.put(100, "simtas");
		
		HashMap<String, Integer> hashMapUzduotis3Reverse = new HashMap<>();
		for(Integer raktas : hashMapUzduotis3.keySet()) {
			hashMapUzduotis3Reverse.put(hashMapUzduotis3.get(raktas), raktas);
		}
		
		spausdintMapRaktasString(hashMapUzduotis3Reverse);
		
		
		System.out.println("************* UZDUOTIS4 ****************");
		
		Scanner scanner = new Scanner(System.in);
		Integer pasirinkimas = 0;
		
		HashMap<String, Studentas> studentai = new HashMap<>();
		
		while(pasirinkimas != 3) {
			
			System.out.println("1 - Iveskite studenta");
			System.out.println("2 - gauti studenta pagal numeri");
			System.out.println("3 - baigti programa");
			
			pasirinkimas = scanner.nextInt();
			scanner.nextLine();
			
			if(pasirinkimas.equals(1)) {
				pridetiStudentaIHashMap(studentai, scanner);
			}
			
			else if (pasirinkimas.equals(2)) {
				spausdintiStudenta(studentai, scanner);
			}
			
		}
		
		System.out.println("Programa baigia darba");
		
		
		
	}
	
	public static Integer didziausiasSkaicius(HashSet<Integer> skaiciai) {

		
		Integer didziausiasSkaicius = -9999;
		Integer temp;
		Iterator<Integer> iteratorius = skaiciai.iterator();
		
		return didziausiasSkaicius;
		
	}
	
	public static Integer maziausiasSkaicius(HashSet<Integer> skaiciai) {
		
		Integer maziausiasSkaicius = 9999;
		
		for(Integer skaicius : skaiciai) {
			if(skaicius < maziausiasSkaicius) {
				maziausiasSkaicius = skaicius;
			}
		}
		
		return maziausiasSkaicius;
		
	}
	
	public static void spausdintiHashSet(HashSet<String> elementai) {
		Iterator<String> iteratorius = elementai.iterator();
		
		System.out.println("HashSeto dydis: " + elementai.size());
		while(iteratorius.hasNext()) {
			System.out.println(iteratorius.next());
		}
		
	}
	
	public static void spausdintMap(HashMap<Integer, String> mapas) {
		
		Set<Integer> visiRaktaiUzduotis1 = mapas.keySet();
		
		for(Integer raktas : visiRaktaiUzduotis1) {
			System.out.println("Raktas: " + raktas + " Reiksme: " + mapas.get(raktas));
			
		}
		
	}
	
	
	public static void spausdintMapRaktasString(HashMap<String, Integer> mapas) {
		
		Set<String> raktai = mapas.keySet();
		
		for(String raktas : raktai) {
			System.out.println("Raktas: " + raktas + " Reiksme: " + mapas.get(raktas));
			
		}
		
	}
	
	public static void pridetiStudentaIHashMap(HashMap<String, Studentas> hashMapStudentas, Scanner scanner) {
		
		String vardas, pavarde, universitetas, numeris;
		
		System.out.println("Iveskite varda");
		vardas = scanner.nextLine();
		
		System.out.println("Iveskite pavarde");
		pavarde = scanner.nextLine();
		
		System.out.println("Iveskite universiteta");
		universitetas = scanner.nextLine();
		
		System.out.println("Iveskite studento numeri");
		numeris = scanner.nextLine();
		
		Studentas studentas = new Studentas(vardas, pavarde, universitetas);
		hashMapStudentas.put(numeris, studentas);
		
		
	}
	
	public static void spausdintiStudenta(HashMap<String, Studentas> hashMapStudentas, Scanner scanner) {
		
		String numeris;
		
		System.out.println("Iveskite studento numeri");
		numeris = scanner.nextLine();
		
		if(hashMapStudentas.containsKey(numeris)) {
			System.out.println("Numeris: " + numeris);
			System.out.println("Vardas: " + hashMapStudentas.get(numeris).getVardas());
			System.out.println("Pavarde: " + hashMapStudentas.get(numeris).getPavarde());
			System.out.println("Universitetas: " + hashMapStudentas.get(numeris).getUniversitetas());
		}
		
		else {
			System.out.println("Studento pagal numeri: " + numeris + " nera");
		}
			
	}
		
}
