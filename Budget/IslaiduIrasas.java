import java.text.SimpleDateFormat;
import java.util.Date;

public class IslaiduIrasas extends Irasas{
	

	private AtsiskaitymoBudai atsiskaitymoBudas;
	

	public IslaiduIrasas(Long id, Date data, Double suma, Kategorijos kategorija, AtsiskaitymoBudai atsiskaitymoBudas) {
		super(id, data, suma, kategorija);
		this.atsiskaitymoBudas = atsiskaitymoBudas;
	}


	public AtsiskaitymoBudai getAtsiskaitymoBudas() {
		return atsiskaitymoBudas;
	}

	public void setAtsiskaitymoBudas(AtsiskaitymoBudai atsiskaitymoBudas) {
		this.atsiskaitymoBudas = atsiskaitymoBudas;
	}

	public void spausdinti() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(String.format("ID: %d, Data: %s, suma: %f, kategorija %s, atsiskaitymo budas: %s",getId(), formatter.format(getData()), getSuma(), getKategorija().name(), this.atsiskaitymoBudas.name()));
				
	}

}
