import java.util.Date;

public class Runner {

	public static void main(String[] args) {

		String word = "pokwifoewoinvpaskpqokdpokaxazaaqicojsoivdjvpopsdvcxv";
		
		System.out.println(word);
		
		String wordWithoutVowels = removeVowels(word);
		
		System.out.println(wordWithoutVowels);
		
		System.out.println(numberOfEqual(3,4,3));
		System.out.println(numberOfEqual(1,1,1));
		System.out.println(numberOfEqual(3,4,1));
		
		/*  -----------------------------------------------------------------------  */
		
		Biudzetas b1 = new Biudzetas();
		b1.pridetiPajamuIrasa(1L, new Date(), 100.00, Kategorijos.A, true);
		b1.pridetiIslaiduIrasa(2L, new Date(), 50.00, Kategorijos.B, AtsiskaitymoBudai.GRYNAIS);
		b1.pridetiIslaiduIrasa(3L, new Date(), 65.00, Kategorijos.B, AtsiskaitymoBudai.KORTELE);
		System.out.println("Balansas originalus: " + b1.balansas()); // turetu grazinti -15
		
		b1.spausdintiIrasus();
		
		b1.ismestiIrasa(3L);
		
		System.out.println("Balansas po ismetimo: " + b1.balansas()); // turetu grazinti 50
			
	}
	
	
	public static String removeVowels(String word) {
		
		return word.replaceAll("a", "")
				.replaceAll("i", "")
				.replaceAll("u", "")
				.replaceAll("e", "")
				.replaceAll("o", "");
		
	}
	
	
	public static Integer numberOfEqual(Integer a, Integer b, Integer c) {
		
		if(a == b & a == c) {
			return 3;
		}
		
		else if (a == b || a == c || b == c) {
			return 2;
		}
		
		return 0;

	}

}