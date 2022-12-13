
public class Tankas {
	
	//Kintamieji
	int x = 0;
	int y = 0;
	int suviuSkaicius;
	String saugotiKrypti;
	int saugotiSuviuSkaiciu = 0;
	int saugotiSuviuSkaiciuKiekvienaiKrypciai = 0;
	int suviaiISiaure;
	int suviaiIRytus;
	int suviaiIVakarus;
	int suviaiIPietus;
	
	//Kryptys
	public void pirmyn() {
	y++;
	saugotiKrypti = "Siaure";
	System.out.println("Tankas pajuda i " + saugotiKrypti);
	}
	public void desinen() {
	x++;
	saugotiKrypti = "Rytai";
	System.out.println("Tankas pajuda i " + saugotiKrypti);
	}
	public void kairen() {
	x--;
	saugotiKrypti = "Vakarai";
	System.out.println("Tankas pajuda i " + saugotiKrypti);
	}
	public void atgal() {
	y--;
	saugotiKrypti = "Pietus";
	System.out.println("Tankas pajuda i " + saugotiKrypti);
	}
	
	//Suviai
	public void suvis() {
	saugotiSuviuSkaiciu++;
	if(saugotiKrypti.equals("Siaure")) {
	suviaiISiaure++;
	}
	if(saugotiKrypti.equals("Rytai")) {
	suviaiIRytus++;
	}
	if(saugotiKrypti.equals("Vakarai")) {
	suviaiIVakarus++;
	}
	if(saugotiKrypti.equals("Pietus")) {
	suviaiIPietus++;
	}
		
	System.out.println("Tankas sauna i " + saugotiKrypti);
	}
	
	//INFO
	public void info() {
	System.out.println("INFO: Tanko kryptis" + saugotiKrypti);
	System.out.println("INFO: Tanko koordinates: " + "(" + x + ";" + y + ")");
	System.out.println("INFO: Tanko suviai:" + " I siaure: " + suviaiISiaure + " I pietus: " + suviaiIPietus +  " I vakarus: " + suviaiIVakarus +  " I rytus: " +  suviaiIRytus +  " Is viso suviu: " + saugotiSuviuSkaiciu);
	
	}
	
	//Meinas
	public static void main(String[] args) {
		
	Tankas tankas = new Tankas();
	tankas.pirmyn();
	tankas.desinen();
	tankas.pirmyn();
	tankas.suvis();
	tankas.suvis();
	tankas.kairen();
	tankas.suvis();
	tankas.pirmyn();
	tankas.info();
	tankas.kairen();
	tankas.kairen();
	tankas.suvis();
	tankas.info();

	}	
}
