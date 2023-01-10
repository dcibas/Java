import java.util.Date;

public class Irasas {

	private Long id;
	private Date data;
	private Double suma;
	private Kategorijos kategorija;
	
	
	public Irasas (Long id, Date data, Double suma, Kategorijos kategorija) {
		super();
		this.id = id;
		this.data = data;
		this.suma = suma;
		this.kategorija = kategorija;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public Double getSuma() {
		return suma;
	}



	public void setSuma(Double suma) {
		this.suma = suma;
	}



	public Kategorijos getKategorija() {
		return kategorija;
	}



	public void setKategorija(Kategorijos kategorija) {
		this.kategorija = kategorija;
	}
	
	
}