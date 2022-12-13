package Lygis1;
import java.util.Scanner;

public class Skaiciuotuvas1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Iveskite 1 skaiciu");
		double a = scanner.nextDouble();
		System.out.println("Iveskite 2 skaiciu");
		double b = scanner.nextDouble();
		
		sudeti(a, b);
		atimti(a, b);
		dauginti(a, b);
		dalinti(a, b);
		
	}
		

	public static double sudeti(double a, double b) {
		
		double sudeti = a + b;
		
        System.out.println("\nSudetis: " + sudeti);
		return sudeti;
		
	}
	
	public static double atimti(double a, double b) {
		
		double atimti = a - b;
		
		System.out.println("\nAtimtis: " + atimti);
		return atimti;		
	}
	
	public static double dauginti(double a, double b) {

		double dauginti = a * b;
		
		System.out.println("\nDaugyba: " + dauginti);
		return dauginti;
		
	}
	public static double dalinti(double a, double b) {

		double dalinti = a / b;
		
		System.out.println("\nDalyba: " + dalinti);
		return dalinti;
				
	}

}
