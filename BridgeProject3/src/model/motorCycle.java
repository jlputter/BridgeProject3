package model;

public class motorCycle extends Type{

	public motorCycle(VehicleStyle vehiclestyle) {
		super(vehiclestyle);
		// TODO Auto-generated constructor stub
	}
	
	public void Build() {
    	System.out.println("You chose a");
    	vehiclestyle.pricePoint();
    	System.out.println("Motorcycle");
    	
    }
}

