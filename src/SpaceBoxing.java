import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String args[]){
		
		double bb;
		int a;
        
		Scanner gab = new Scanner(System.in);
         
        System.out.println(" Please enter ur current earth weight: ");
        bb = gab.nextDouble();
        System.out.println("Your Current weight is " + bb);
        System.out.println(" I have information for the following planets: ");
        System.out.println(" 1. Venus   2. Mars     3. Jupiter");
        System.out.println(" 4. Saturn      5. Uranus       6. Neptune");
        System.out.print(" Which planet are you visiting? ");
         
        a = gab.nextInt();
         
        System.out.println();
        
        switch (a) {
		case 1:
			System.out.println("The weight would be  "+(bb*0.78)+ " pounds on Venus.");
			break;
		case 2:
			System.out.println("The weight would be  "+(bb*0.39)+ " pounds on Mars.");
			break;
		case 3:
			System.out.println("The weight would be  "+(bb*2.65)+ " pounds on Jupiter.");
		case 4:
			System.out.println("The weight would be  "+(bb*1.17)+ " pounds on Saturn.");
			break;
		case 5:
			System.out.println("The weight would be  "+(bb*1.05)+ " pounds on Uranus.");
			break;
		case 6:
			System.out.println("The weight would be  "+(bb*1.23)+ " pounds on Neptune.");
			break;
		default:
			System.out.println("Please select planet from 1 - 6. Try again!!");
			break;
		}
	}
	
}
