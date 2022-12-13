package klases;

public class Kvadratas {

	public Kvadratas() {}
	
	public Kvadratas (String pavadinimasParam, int krastinesIlgisParam, int krastinesPlotasParam)
	{
		pavadinimas = pavadinimasParam;
		krastinesIlgis = krastinesIlgisParam;
		krastinesPlotas = krastinesPlotasParam;
	}
	
	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public int getKrastinesIlgis() {
		return krastinesIlgis;
	}

	public void setKrastinesIlgis(int krastinesIlgis) {
		this.krastinesIlgis = krastinesIlgis;
	}

	public int getKrastinesPlotas() {
		return krastinesPlotas;
	}

	public void setKrastinesPlotas(int krastinesPlotas) {
		this.krastinesPlotas = krastinesPlotas;
	}

	public Kvadratas (String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}
	
	private String pavadinimas;
	private int krastinesIlgis;
	private int krastinesPlotas;

}
