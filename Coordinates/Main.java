import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Koordinate> sarasas = new ArrayList<>();
		
		sarasas.add(new Koordinate(1,5));
		sarasas.add(new Koordinate(5,9));
		sarasas.add(new Koordinate(4,0));
		sarasas.add(new Koordinate(0,0));
		sarasas.add(new Koordinate(9,1));
		
		Koordinate.spausdintiSarasa(sarasas);
		Koordinate.rastiKoordinate(sarasas, 0, 0);
		
		ArrayList<Koordinate> sarasasUpdated = new ArrayList<>();
		
		sarasasUpdated.add(new Koordinate(1,5));
		sarasasUpdated.add(new Koordinate(5,9));
		sarasasUpdated.add(new Koordinate(4,0));
		sarasasUpdated.add(new Koordinate(0,0));
		sarasasUpdated.add(new Koordinate(9,1));
		
		sarasasUpdated.set(3, new Koordinate(1,1));
		Koordinate.spausdintiSarasa(sarasasUpdated);
		
		
	}

}
