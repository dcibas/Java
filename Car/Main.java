package Car;

public class Main {

	public static void main(String[] args) {
		
		
		Car renault = new Car("Renault", "Twingo", 40.0, 6.0);
		Car fiat = new Car("Fiat", "500", 35.0, 8.4);
		Car mini = new Car("Mini", "Cooper 1.6", 44.0, 7.8);	
		
		
		try {
			renault.driveTrip(6.0, 40.0);
		} catch (InsufficientFuelException e) {
			e.printStackTrace();
		}
		
		try {
			fiat.driveTrip(8.4, 35.0);
		} catch (InsufficientFuelException e) {
			e.printStackTrace();
		}

		try {
			mini.driveTrip(7.8, 44.0);
		} catch (InsufficientFuelException e) {
			e.printStackTrace();
		}
		
	}

}
