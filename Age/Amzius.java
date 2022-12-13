import java.util.Scanner;

public class Amzius {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
    	
        System.out.println("Iveskite savo amziu");
        
        int amzius = scanner.nextInt();
        
        System.out.println("Amzius: " + amzius);
		
        if (amzius >= 30 && amzius <= 39) { 	
        	System.out.println("Jus esate ketvirtame desimtmetyje"); 	
        }
        
        else {     	
        	System.out.println("Jus neesate ketvirtame desimtmetyje");
        }
       
	}

}
	


