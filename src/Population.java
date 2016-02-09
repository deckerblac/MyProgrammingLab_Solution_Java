import java.util.*;

public class Population {

	public static void main(String[] args) {
		int i;
		double number_of_organisms;
		double daily_increase;
		int number_of_days;

		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the starting number organisms:");
		number_of_organisms = stdin.nextDouble();
		if (number_of_organisms < 2) {
			System.out.print("Invalid. Must be at least 2. Re-enter:");
			number_of_organisms = stdin.nextDouble();
		}
		System.out.print(" Enter the daily increase:");
		daily_increase = stdin.nextDouble();
		if (daily_increase < 0) {
			System.out.print("Invalid. Enter a non-negative number:");
			daily_increase = stdin.nextDouble();
		}
		System.out.print(" Enter the number of days the organisms will multiply:");
		number_of_days = stdin.nextInt();
		if (number_of_days < 1) {
			System.out.print("Invalid. Enter 1 or more: ");
			number_of_days = stdin.nextInt();
		}
		
		System.out.println(" Day		Organisms");
        System.out.println("-----------------------------");
        double multiplication = 1;
        double x = number_of_organisms;
        double y = daily_increase;
        multiplication = multiplication * (y + 1 );
        System.out.println(1+"		"+x);
        for(i = 2; i <= number_of_days; i++){
        	number_of_organisms += number_of_organisms*(daily_increase);
            System.out.println(i+"		"+number_of_organisms);
		}
        
       /* double multiplication = 1;
        for(i = 1; i <= number_of_days; i= i+1){
            System.out.print(i+"     "+number_of_organisms*multiplication);
            multiplication = multiplication * (daily_increase + 1 + .01);
            System.out.println();
        }
*/
     /*   int total = 1;
        System.out.println();
        for( i=0; i< number_of_days; i++) {
        System.out.println(i + "\t\t" + total);
        total+=number_of_days*daily_increase;
        }*/
	}
}

