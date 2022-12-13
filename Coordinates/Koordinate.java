import java.util.ArrayList;

public class Koordinate {

	private int x;
	private int y;
	
	public Koordinate(int xParam, int yParam) {
		
		x = xParam;
		y = yParam;
		
	}
	
	public static void spausdintiSarasa(ArrayList<Koordinate> koordinate) {
		
		for(int i = 0; i < koordinate.size(); i++) {
			System.out.println("Koordinate: " + koordinate.get(i).getX() + ";" + koordinate.get(i).getY());
			
		}
	}
	
	public static void rastiKoordinate(ArrayList<Koordinate> koordinate, int x, int y) {
		
		for(int i = 0; i < koordinate.size(); i++) {
			if(koordinate.get(i).getX() == x && koordinate.get(i).getY() == y) {
				System.out.println(i);
			}
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
