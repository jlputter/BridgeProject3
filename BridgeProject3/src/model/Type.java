package model;

public abstract class Type {
	
	VehicleStyle vehiclestyle;
    Type(VehicleStyle vehiclestyle)
    {
        this.vehiclestyle=vehiclestyle;
    }
    abstract public void Build();
}
 


