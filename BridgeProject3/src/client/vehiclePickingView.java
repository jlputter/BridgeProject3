package client;

import model.*;

public class vehiclePickingView {

		 public static void main(String[] args) {
		  
		  Type bike=new motorCycle(new luxury());
		  bike.Build();
		  
		  Type car = new automobile(new budget());
		  car.Build();
		  
		 }
	}

