import java.util.Scanner;

public class TheSpeedOfSound {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		String material;
		double distance;
		double x;
		System.out.println("Enter one of the following: air, water, or steel: ");
		material = stdin.next();
		if (!(material.equalsIgnoreCase("air"))&&!(material.equalsIgnoreCase("water"))&&!(material.equalsIgnoreCase("steel"))) {
			System.out.println("Sorry, you must enter air, water, or steel.");
		}else {
		System.out.println("Enter the distance the sound wave will travel: ");
		distance = stdin.nextInt();
		
		if (material.equals("air")){
			
			x = (distance / 1100);
			
			System.out.println("It will take " +  x + " seconds.");
			
		}else if (material.equals("water")){
			
			x = (distance / 4900);
			
			System.out.println("It will take " +  x + " seconds.");
			
		}else if (material.equals("steel")){
			
			x = (distance / 16400);
			
			System.out.println("It will take " +  x + " seconds.");
		}
		}

	}

}
