package setterInjection;

public class Car implements Vechicle{

	private String FuelType;
	
	private Integer MaxSpeed;
	
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}


	public void setMaxSpeed(Integer maxSpeed) {
		MaxSpeed = maxSpeed;
	}
	
	public void move() {
		 
		System.out.println("This is for car");
		
		System.out.println("FuelType= "+FuelType+" MaxSpeed= "+MaxSpeed);
		
	}

	

	
	
	
	

}
