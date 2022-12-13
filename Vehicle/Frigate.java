public class Frigate implements IsSeaVessel{
	
    static void fireGun() {}
    
    private String name;
    private int maxPassengers, maxSpeed;

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
        return "Frigate";
    }
}
