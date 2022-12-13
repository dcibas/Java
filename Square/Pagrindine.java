package klases;

public class Pagrindine {

	public static void main(String[] args) {
		
		Figura apskritimas = new Figura();
		
		apskritimas.setPavadinimas("Apskritimas");
		apskritimas.setKampuSkaicius(0);
		apskritimas.setPerimetras(10);
		apskritimas.setPlotas(15);
		
		System.out.println("Pavadinimas: " + apskritimas.getPavadinimas());
		System.out.println("Kampu skaicius: " + apskritimas.getKampuSkaicius());
		System.out.println("Perimetras : " + apskritimas.getPerimetras());
		System.out.println("Plotas : " + apskritimas.getPlotas());
		
		Figura kvadratas = new Figura();
		
		kvadratas.setPavadinimas("Kvadratas");
		kvadratas.setKampuSkaicius(4);
		kvadratas.setPerimetras(10);
		kvadratas.setPlotas(20);
		
		kvadratas.spausdinti();	
		
		Figura kvadratas2 = new Figura(kvadratas.getPavadinimas(), kvadratas.getKampuSkaicius(), kvadratas.getPerimetras(), kvadratas.getPlotas());
		
		kvadratas2.spausdinti();
	
	}
		
	public static void spausdinti(String zodis) {
		System.out.println("Spausdinu + " + zodis);
	}

}
