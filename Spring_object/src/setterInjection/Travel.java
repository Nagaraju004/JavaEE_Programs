package setterInjection;

public class Travel implements Journey{
	
	private Vechicle v;
	
	public void setV(Vechicle v) {
		this.v = v;
	}
	
	public void startJourney() {
		
		 System.out.println("Journey is start");
		 v.move();
	}

	 

	

}
