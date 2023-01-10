package maventest;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Vykdytojai {

	@Id
	private Long nr;
	private String pavarde;
	private String kvalifikacija;
	private String issilavinimas;
	
	public Vykdytojai() {
		
	}
	
	
	public Vykdytojai(Long nr, String pavarde, String kvalifikacija, String issilavinimas) {
		super();
		this.nr = nr;
		this.pavarde = pavarde;
		this.kvalifikacija = kvalifikacija;
		this.issilavinimas = issilavinimas;
	}


	public Long getNr() {
		return nr;
	}

	public void setNr(Long nr) {
		this.nr = nr;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}

	public String getKvalifikacija() {
		return kvalifikacija;
	}

	public void setKvalifikacija(String kvalifikacija) {
		this.kvalifikacija = kvalifikacija;
	}

	public String getIssilavinimas() {
		return issilavinimas;
	}

	public void setIssilavinimas(String issilavinimas) {
		this.issilavinimas = issilavinimas;
	}
		
}
