package overrinding;

public class Car {
	String brand;
	double price;
	Engine e1;
	
	Car(){
		
	}
	Car(String brand,double price,Engine e1){
		this.brand=brand;
		this.price=price;
		this.e1=e1;
	}
	
	public void displayCar() {
		System.out.println("Car name : "+this.brand);
		System.out.println("Car price : "+this.price);	
		System.out.println("Car engine name : "+this.e1.brand);	
		System.out.println("Car engine type : "+this.e1.type);	
		System.out.println("Car engine strok : "+this.e1.stroks);	
	}

}
