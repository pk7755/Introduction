package overrinding;

public class Engine {
	int stroks;
	String brand;
	String type;
	
	public void start() {
		System.out.println("Engine started....");
	}
	
	Engine(){
		
	}
	Engine(int stroks, String brand, String type){
		this.stroks=stroks;
		this.brand=brand;
		this.type=type;
	}

	public void display() {
		System.out.println("Engine NO of stroks : "+this.stroks);
		System.out.println("Engine brank : "+this.brand);
		System.out.println("Engine type  : "+this.type);
	}
}
