package Lygis1;
import java.util.Scanner;

public class Skaiciuotuvas2 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Skaiciuotuvas");

		        System.out.println("\nPasirinkite pageidaujamas opcijas:");
		        System.out.println("\n1. Sudeti");
		        System.out.println("2. Atimti");
		        System.out.println("3. Dalinti");
		        System.out.println("4. Dauginti");

		        System.out.print("\nJusu pasirinkimas: ");
		        int pasirinkimas = scanner.nextInt();
		        System.out.println();


		        if (pasirinkimas == 1){
		        	sudeti();
		        }
		        else if (pasirinkimas == 2){
		            atimti();
		        }
		        else if (pasirinkimas == 3){
		            dalinti();
		        }
		        else if (pasirinkimas == 4){
		            dauginti();
		        }

		        System.out.println();
		        scanner.close();
		    }

		    public static void sudeti(){

		        int sVienas, sDu;
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Sudeti");

		        System.out.print("\nPirmas skaicius: ");
		        sVienas = scanner.nextInt();

		        System.out.print("\nAntras skaicius: ");
		        sDu = scanner.nextInt();

		        scanner.close();
		        System.out.println("\nRezultatas: " + sVienas + " + " + sDu + " = " + (sVienas + sDu));
		    }

		    public static void atimti(){
		    	
		    	int sVienas, sDu;
		    	Scanner scanner = new Scanner(System.in);

		        System.out.println("Atimti");

		        System.out.print("\nPirmas skaicius: ");
		        sVienas = scanner.nextInt();

		        System.out.print("\nAntras skaicius: ");
		        sDu = scanner.nextInt();

		        scanner.close();
		        System.out.println("\nRezultas: " + sVienas + " - " + sDu + " = " + (sVienas - sDu));
		    }

		    public static void dalinti(){
		    	
		    	int sVienas, sDu;
		    	Scanner scanner = new Scanner(System.in);

		        System.out.println("Dalinti");

		        System.out.print("\nPirmas skaicius: ");
		        sVienas = scanner.nextInt();

		        System.out.print("\nAntras skaicius: ");
		        sDu = scanner.nextInt();

		        scanner.close();
		        System.out.println("\nRezultas: " + sVienas + " / " + sDu + " = " + (sVienas / sDu));
		    }

		    public static void dauginti(){
		    	
		        int sVienas, sDu;
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Dauginti");

		        System.out.print("\nPirmas skaicius: ");
		        sVienas = scanner.nextInt();

		        System.out.print("\nAntras skaicius: ");
		        sDu = scanner.nextInt();

		        scanner.close();
		        System.out.println("\nRezultas: " + sVienas + " x " + sDu + " = " + (sVienas * sDu));
		
	}

}
