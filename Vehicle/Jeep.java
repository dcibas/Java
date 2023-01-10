public class Jeep implements IsLandVehicle {
	
    static void soundHorn() {}
    
    private String name;
    private int wheelAmount, maxPassengers, maxSpeed;

    @Override
    public int getNumWheels() {
        return wheelAmount;
    }

    @Override
    public void setNumWheels(int setNumWheels) {
        this.wheelAmount = setNumWheels;
    }

    @Override
    public void drive() {
        System.out.println(name + " is driving...");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String setName) {
        this.name = setName;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int setMaxPassengers) {
        this.maxPassengers = setMaxPassengers;
    }

    @Override
    public int getMaxSpeed() {

        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int setMaxSpeed) {
        this.maxSpeed = setMaxSpeed;
    }
    
    @Override
    public String toString() {
        return "Jeep";
    }
}
