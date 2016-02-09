
public class Car {

	public static void main(String[] args) {
		
		int store=0;
		
		for (int i = 1; i < 5; i++) {
			System.out.println(getspeed());
			getaccelerator();
			store = getspeed();
			
		}
		System.out.println(store);
		for (int j = 0; j < 5; j++) {
			System.out.println(speed);
			getbrake();
		}
		
		

	}


	public Car(int yearModel,String make,int speed){
		speed = 0;
		this.yearModel = yearModel;
		this.make = make;
		this.speed = speed;

	}
	
	public int getyearModel(){
		return yearModel;
	}
	
	public static String getmake(){
		return make;
	}
	
	public static int getspeed(){
		return speed + 5 ;
	}
	
	public static int getaccelerator(){
		return speed = speed + 5;
	}
	
	public static int getbrake(){
		return speed = speed - 5;
	}
	
	private static int speed;
	private static String make;
	private static int yearModel;

}
