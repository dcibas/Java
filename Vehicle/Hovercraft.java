public class Hovercraft implements IsLandVehicle, IsSeaVessel{
	
    static void enterLand() {}
    static void enterSea() {}
    private String name;
    private int maxPassengers, wheelAmount, maxSpeed;

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

    }

    @Override
    public void getDisplacement() {

    }

    @Override
    public void setDisplacement(int setDisplacement) {

    }

    @Override
    public void launch() {

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
    public String toString(){
        return "Hovercraft";
    }
}
