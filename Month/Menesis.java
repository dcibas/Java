import java.util.Scanner;

public class Menesis {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
    	
        System.out.println("Iveskite menesi");
        
        int menesis = scanner.nextInt();
        
        String menesisTekstu = "";
        
		if (menesis < 1 || menesis > 12) {
			System.out.println("Netinkamas skaicius");
		}

		else if (menesis %2 == 0) {
				
		switch(menesis) {
		
		case 2: menesisTekstu = "VASARIS";
		break;
		case 4: menesisTekstu = "BALANDIS";
		break;
		case 6: menesisTekstu = "BIRZELIS";
		break;
		case 8: menesisTekstu = "RUGPJUTIS";
		break;
		case 10: menesisTekstu = "SPALIS";
		break;
		case 12: menesisTekstu = "GRUODIS";
		break;
		default: menesisTekstu = "Neteisingas menuo";
		
	       }
		
	    } else {
		
		switch (menesis) {
		
		case 1: menesisTekstu = "Sausis";
		break;
		case 3: menesisTekstu = "Kovas";
		break;
		case 5: menesisTekstu = "Geguze";
		break;
		case 7: menesisTekstu = "Liepa";
		break;
		case 9: menesisTekstu = "Rugsejis";
		break;
		case 11: menesisTekstu = "Lapkritis";
		break;
		default: menesisTekstu = "Neteisingas menuo";
		
	       }
		
	    }
	System.out.println(menesisTekstu);
     }
}
