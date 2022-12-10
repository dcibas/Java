package Car;

public class Car {

	private String brand;
	private String model;
	private Double fuelLeft;
	private Double averageConsumption;
	private static Double distance = 300.00;
	
	public Car(String brand, String model, Double fuelLeft, Double averageConsumption) {
		
		super();
		this.brand = brand;
		this.model = model;
		this.fuelLeft = fuelLeft;
		this.averageConsumption = averageConsumption;
				
	}
	
	public Double driveTrip(Double averageConsumption, Double fuelLeft) throws InsufficientFuelException {
		
		Double ConsumptionPer1Liter = averageConsumption/100;
		
		Double RoadTripFuelBurn = ConsumptionPer1Liter * distance;
		
		Double NewFuelLeft = fuelLeft - RoadTripFuelBurn;
		
		if(NewFuelLeft < 0) {
						
			throw new InsufficientFuelException(NewFuelLeft, "Insufficient fuel alert, you need this much fuel to complete your journey: " + Math.abs(NewFuelLeft) + " l");
			
		} else {
			
			System.out.println("No worries you have enough fuel left, carry on: " + NewFuelLeft + " l");
			
		}
		
		return fuelLeft - RoadTripFuelBurn;
		
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getFuelLeft() {
		return fuelLeft;
	}

	public void setFuelLeft(Double fuelLeft) {
		this.fuelLeft = fuelLeft;
	}

	public Double getAverageConsumption() {
		return averageConsumption;
	}

	public void setAverageConsumption(Double averageConsumption) {
		this.averageConsumption = averageConsumption;
	}
	
	
}
