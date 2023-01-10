import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Biudzetas {
	
	private ArrayList<Irasas> irasai;
	
	public Biudzetas() {
		this.irasai = new ArrayList<>();
	}
	
	public ArrayList<Irasas> getIrasai() {
		return irasai;
	}

	public void setPajamos(ArrayList<Irasas> irasai) {
		this.irasai = irasai;
	}
	
	public void pridetiPajamuIrasa(Long id, Date data, Double suma, Kategorijos kategorija, Boolean arIBanka) {
		
		PajamuIrasas pajamuIrasas = new PajamuIrasas(id, data, suma, kategorija, arIBanka);
		irasai.add(pajamuIrasas);
		
	}
	
	public void pridetiIslaiduIrasa(Long id, Date data, Double suma, Kategorijos kategorija, AtsiskaitymoBudai atsiskaitymoBudas) {
		
		IslaiduIrasas islaiduIrasas = new IslaiduIrasas(id, data, suma, kategorija, atsiskaitymoBudas);
		irasai.add(islaiduIrasas);
	
	}
	
	public PajamuIrasas gautiPajamuIrasa(Integer counter) {
		return (PajamuIrasas) irasai.get(counter);
	}
	
	public IslaiduIrasas gautiIslaiduIrasa(Integer counter) {
		return (IslaiduIrasas) irasai.get(counter);
	}
	
	public Double balansas() {
		
		Double balansas = 0.0;
		
		for(int i = 0; i < irasai.size(); i++) {
			
			if(irasai.get(i) instanceof IslaiduIrasas) {
				balansas -= irasai.get(i).getSuma();
			}
			else {
				balansas += irasai.get(i).getSuma();
			}
			
		}
		
		return balansas;
		
	}
	
	
	public void spausdintiIrasus() {

		System.out.println("Islaidos: \n");

		for(int i = 0; i < irasai.size(); i++) {

			if(irasai.get(i) instanceof IslaiduIrasas) {
				System.out.println("Islaidos: ");
				((IslaiduIrasas) irasai.get(i)).spausdinti();

			}

			else {
				System.out.println("Pajamos: ");
				((PajamuIrasas) irasai.get(i)).spausdinti();
			}
			
		}
	}
	
	
	public void ismestiIrasa(Long id) {
		
		Irasas istrinamasIrasas = null;
		for(Irasas irasas : irasai) {
			if(irasas.getId().equals(id)) {
				istrinamasIrasas = irasas;
			}
		}

		if(istrinamasIrasas != null) {
			irasai.remove(istrinamasIrasas);
		}
		
	}
		
}