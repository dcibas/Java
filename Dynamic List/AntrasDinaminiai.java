import java.util.ArrayList;

public class AntrasDinaminiai {

	public static void main(String[] args) {
		
		ArrayList<String> sarasasKitas = new ArrayList<String>();
		
		sarasasKitas.add("Pirmas");
		sarasasKitas.add("Antras");
		sarasasKitas.add("Trecias");
		sarasasKitas.add("Ketvirtas");
		
		int ilgiausias = sarasasKitas.get(0).length();
		String ilgiausiasZodis = "";
		for(int i = 0; i < sarasasKitas.size(); i++) {
			if(sarasasKitas.get(i).length() > ilgiausias) {
				ilgiausiasZodis = sarasasKitas.get(i);
			} else {
				System.out.print("");
			}
			
		}
		
		System.out.println("Ilgiausias zodis: " + ilgiausiasZodis);
	
	}

}
