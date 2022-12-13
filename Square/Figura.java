package klases;

public class Figura {
	
	public Figura(String pavadinimasParam, int kampuSkaiciusParam, double perimetrasParam, double plotasParam) 
	
	{
		pavadinimas = pavadinimasParam;
		kampuSkaicius = kampuSkaiciusParam;
		perimetras = perimetrasParam;
		plotas = plotasParam;
	
	}
	
	public Figura(String pavadinimasParam) {
		pavadinimas = pavadinimasParam;
	}
	
	public Figura() {
		
	}
	
	public int getKampuSkaicius() {
		return kampuSkaicius;
	}

	public void setKampuSkaicius(int kampuSkaicius) {
		this.kampuSkaicius = kampuSkaicius;
	}

	public double getPerimetras() {
		return perimetras;
	}

	public void setPerimetras(double perimetras) {
		this.perimetras = perimetras;
	}

	public double getPlotas() {
		return plotas;
	}

	public void setPlotas(double plotas) {
		this.plotas = plotas;
	}
	
	String pavadinimas;
	int kampuSkaicius;
	private double perimetras;
	private double plotas;

	public String getPavadinimas() {
		
		return pavadinimas;	
		
	}
	
	public void setPavadinimas(String pavadinimas) {
		
		this.pavadinimas = pavadinimas;
		
	}
	
	public void spausdinti() {
		
		System.out.println("Pavadinimas: " + pavadinimas);
		System.out.println("Kampu skaicius: " + kampuSkaicius);
		System.out.println("Perimetras: " + perimetras);
		System.out.println("Plotas: " + plotas);
		
	}

}
