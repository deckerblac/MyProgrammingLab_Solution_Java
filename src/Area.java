
public class Area {

	public static void main(String[] args) {
		
		double circles = Shape.getShape(3);
		double rectangles = Shape.getShape(4, 2);
		double trapezoid = Shape.getShape(2, 5, 5);
		
		System.out.printf("%.2f\n",circles);
		System.out.println(rectangles);
		System.out.println(trapezoid);

	}

}

class Shape{
	
	private static double area;
	
	//circles -- area = π*radius^2 (format the answer to have two decimal places)
	//Math.PI
	public static double getShape(double radius ){
		area = Math.PI* Math.pow(radius, 2);
		return area;
	}
	
	//rectangles -- area = width * length
	public static double getShape(double width, double length){
		area = width * length;
		return area;
	}
	
	//trapezoid -- area = (base1 + base2) * height/2
	public static double getShape(double base1,double base2,double height){
		area = (base1+base2)*(height/2);
		return area;
	}
}
