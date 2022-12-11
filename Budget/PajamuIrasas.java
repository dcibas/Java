import java.text.SimpleDateFormat;
import java.util.Date;

public class PajamuIrasas extends Irasas {

	private Boolean arIBanka;
	
	
	public PajamuIrasas(Long id, Date data, Double suma, Kategorijos kategorija, Boolean arIBanka) {
		super(id, data, suma, kategorija);
		this.arIBanka = arIBanka;
	}
	
	
	public Boolean getArIBanka() {
		return arIBanka;
	}
	public void setArIBanka(Boolean arIBanka) {
		this.arIBanka = arIBanka;
	}
	
	public void spausdinti() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(String.format("ID: %d, Data: %s, suma: %f, kategorija %s, ar jau banke: %s", getId(), formatter.format(getData()), getSuma(), getKategorija().name(), arIBanka.toString()));
	}
	
}