package overrinding;

public class CarDriver {
	public static void main(String[] args) {
		
		Car c1= new Car("Maruti",23232.232,new Engine(4,"Tata","Petrol"));
		c1.displayCar();
		System.out.println("========================================");
		
		Engine e2= new Engine(4,"mhawk","petrol");
		Car c2 = new Car("Honda", 23423423423.34, e2);
		c2.displayCar();
		
	}
	

}
