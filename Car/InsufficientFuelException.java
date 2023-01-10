package Car;

public class InsufficientFuelException extends Exception {

	private Double fuelShortage;

	public InsufficientFuelException(Double fuelShortage, String message) {
		super(message);
		this.fuelShortage = fuelShortage;
		
	}
	
}
