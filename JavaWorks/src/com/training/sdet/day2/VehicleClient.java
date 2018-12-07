package com.training.sdet.day2;

public class VehicleClient {

	  public static void display (Vehicle vehicle){
	  System.out.println("-----------");
	  vehicle.move();
	  vehicle.Break();
	  if(vehicle instanceof Car){
		((Car)vehicle).doors();
		((Car)vehicle).fuelCapacity();
	  }
	  else if (vehicle instanceof Truck){
		  ((Truck)vehicle).load();
	  }
	  	  }
	 
	  
	   public static void main(String[] args){
	   //single object call
		   Vehicle [] vehicles = new Vehicle[2];
	   
		   vehicles[0] = new Car(4, 40, 100);
		   vehicles[1] = new Truck(500, 80);
		  
	   	   
	   	   //for(int i = 0; i< vehicles.length; i++)
	   	   //{
	   	   //display(vehicles[i]);
	   	   //} 
	  	for (Vehicle temp : vehicles){
		  		display(temp);
	  	}
	   }
	   
	   
	public static void singleObjectCall() {
		Vehicle vehicle = new Car(4, 40, 120);
		display(vehicle);
		//vehicle.move();
		//vehicle.Break();
		//((Car)vehicle).doors(2);
		//((Car)vehicle).fuelCapacity(40);
		
		System.out.println("-------");
		vehicle = new Truck( 400, 75);
		//vehicle.move();
		//vehicle.Break();
		//((Truck)vehicle).load(3000);
		
		display(vehicle);
	}

}
