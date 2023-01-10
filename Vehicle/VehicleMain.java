public class VehicleMain {
	
    public static void main(String[] args) {
    	
        Jeep jeep1 = new Jeep();
        Jeep jeep2 = new Jeep();
        Frigate frigate1 = new Frigate();
        Frigate frigate2 = new Frigate();
        Hovercraft hovercraft1 = new Hovercraft();
        Hovercraft hovercraft2 = new Hovercraft();

        jeep1.setName("Jeep1");
        jeep2.setName("Jeep2");
        frigate1.setName("Frigate1");
        frigate2.setName("Frigate2");
        hovercraft1.setName("Hovercraft1");
        hovercraft2.setName("Hovercraft2");

        jeep1.setNumWheels(4);
        jeep2.setNumWheels(6);
        hovercraft1.setNumWheels(0);
        hovercraft2.setNumWheels(0);

        jeep1.setMaxPassengers(5);
        jeep2.setMaxPassengers(7);
        frigate1.setMaxPassengers(58);
        frigate2.setMaxPassengers(73);
        hovercraft1.setMaxPassengers(2);
        hovercraft2.setMaxPassengers(3);

        IsVehicle[] vehicles = {jeep1, jeep2, frigate1, frigate2, hovercraft1, hovercraft2};

        for(int i=0;i<vehicles.length;i++) {
            if(vehicles[i] instanceof IsLandVehicle && vehicles[i] instanceof IsSeaVessel) {
                System.out.println(vehicles[i].getName()+" is a land vehicle AND a sea vessel.");
            }
            else if(vehicles[i] instanceof IsLandVehicle) {
               System.out.println(vehicles[i].getName()+" is a land vehicle.");
            }
            else {
                System.out.println(vehicles[i].getName()+" is a sea vessel.");
            }
        }
    }
}
