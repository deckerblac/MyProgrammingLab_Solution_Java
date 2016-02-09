import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JumperAdd {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * int n =0;
		 * 
		 * 
		 * for (int i = 5; i > 0; i--) {
		 * 
		 * System.out.printf("%d\n",i); } System.out.printf("BLAST OFF");
		 * return;
		 */

		/*
		 * int value = 0; while (value < 10) { System.out.println("Hello");
		 * value++; }
		 */
		/*
		 * for (int rows = 0; rows <= 10; rows++) { for (int numberofstars = 0;
		 * numberofstars <rows; numberofstars++) { System.out.print(" "); }
		 * System.out.println("*"); }
		 */

		/*
		 * PrintWriter outputFile = new PrintWriter("Personnel.txt");
		 * outputFile.print(3); outputFile.print(";"); outputFile.print(4);
		 * outputFile.print(";"); outputFile.println(5); outputFile.print(10);
		 * outputFile.print(";"); outputFile.print(11); outputFile.print(";");
		 * outputFile.println(12); outputFile.close();
		 */
        
		
		
		File file = new File("prime.txt");

		if (!file.exists()) {
			System.out.println("No Such File in Directory, Please try again");
			System.exit(0);
		}

		Scanner inputFile = new Scanner(file);

		while (inputFile.hasNext()) {

			double number = inputFile.nextDouble();

			double sum = +number;

			System.out.println(sum);
		}

		inputFile.close();
		System.out.println("End of File");

		/*
		 * char[] letters = {'a', 'b', 'c', 'd', 'e'}; for(int i=0; i < 5; i++)
		 * { for(int ii=0; ii < 5 ; ii++) { System.out.print(letters[i]);
		 * System.out.println(letters[ii]); } }
		 */

		/*
		 * for(int i = 0; i < 10; i++){
		 * 
		 * for(int j = 0; j < i; j++){
		 * 
		 * System.out.print("*");
		 * 
		 * }
		 * 
		 * System.out.println(" "); }
		 */

		/*
		 * int number; Random Randomnumber = new Random();
		 * 
		 * number = Randomnumber.nextInt(6)+1; System.out.println(number+ " ");
		 */

		/*
		 * Random rand = new Random();
		 * 
		 * Scanner stdin = new Scanner(System.in);
		 * 
		 * int dice1; int dice2;
		 * 
		 * System.out.println("Pick a number between 1 - 6"); int again =
		 * stdin.nextInt(); System.out.println("Pick a number between 1 - 6");
		 * int again2 = stdin.nextInt();
		 */
		String run = "Y";
		/*
		 * while (run.equalsIgnoreCase("y")) { dice1 = rand.nextInt(6) + 1;
		 * dice2 = rand.nextInt(6) +1;
		 * System.out.println("-----------------------------");
		 * System.out.println(dice1 + "\t\t" + dice2); System.out.println(
		 * "Do you want to run again? Enter Y"); run = stdin.nextLine();
		 * 
		 * }
		 */
	/*	int again= 0 ;
		
		Scanner stdin =new Scanner(System.in);
		try {
			do {

				System.out.println("Height:-");
				again = stdin.nextInt();

			} while ((again < 0) || (again > 23));
		} catch (InputMismatchException e) {
			  System.err.println("Entered value is not an integer");
		}
		for ( int i = 1; i < again; i++)
        {
            for (int j = again; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/
		
		/*Scanner stdin = new Scanner(System.in);
		int count = 0;
		double change;
		
		do {
			System.out.println("O hai! How much change is owed?:- ");
			change = stdin.nextDouble();
		} while (change < 0);

		while (change > 0.25) {
			change = (change - 0.25);
			System.out.printf("%.100f\n",change);
			count++;
			System.out.println(count);
			if (change == 0.25) {
				change = change % 0.25;
				System.out.printf("%.100f\n",change);
				count++;
				System.out.println(count);
			} else if (change < 0.25) {
				System.out.println("Less");
				while (change > 0.10) {
					change = (change - 0.10);
					System.out.printf("%.100f\n",change);
					count++;
					System.out.println(count);
				} while (change > 0.05) {
					change = (change - 0.05);
					System.out.printf("%.100f\n",change);
					count++;
					System.out.println(count);
				}while (change > 0.01) {
					change = (change - 0.01);
					System.out.printf("%.100f\n",change);
					count++;
					System.out.println(count);
				}
			}  
		}*/
		/*int x=0;
		if (x == 1){
			System.out.println("disagree");
		} else if (x == 2){
	  		System.out.println("no opinion");
		}else if (x == 3){
	  		System.out.println("agree");
		}else {	
	  		System.out.println("does nothing");
		}*/
		
		 int sum = 0;
		 int count = 2;
		 for(int i = 2;count < 1000; i++){
	      if (i % 2 != 0){
	      sum = sum + count;
	      }
	      count ++;
	    }
	    System.out.println(sum);
		
		int[] numbers = IntStream.rangeClosed(1, 1000).toArray();
		
		for (int i : numbers) {
			System.out.print(i);
		}
		
		
	
	}
}


class Prime{
  private int sum;
  //private int num = 1;
 
	
	public void setPrime(int sum){
		this.sum = sum;
	}
	
	public boolean getPrime(){
		if (sum%2 != 0){
		return true;
		}else{
		return false;
		}
	}
	
   
   
    
}

