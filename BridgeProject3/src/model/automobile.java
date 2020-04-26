package model;

public class automobile extends Type {

	public automobile(VehicleStyle vehiclestyle) {
		super(vehiclestyle);
		// TODO Auto-generated constructor stub
	}
	
	public void Build() {
    	System.out.println("You chose a");
    	vehiclestyle.pricePoint();
    	System.out.println("Car");
    	
    }
}
