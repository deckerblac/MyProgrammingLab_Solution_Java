import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		int num1; 
		int num2; 
		int num3; 
        double results;

		Scanner sc = new Scanner(System.in); // A simple text scanner which can parse primitive types and strings using regular expressions.
		//Addition or sum code
		System.out.println("Please type a number to rep. num1 :- ");
		num1 = sc.nextInt();
		System.out.println("Please type a number to rep. num2 :- ");
		num2 = sc.nextInt();
		System.out.println("Please type a number to rep. num3 :- ");
		num3 = sc.nextInt();
		//Add num1 +num2 +num3
		results = num1 +num2 + num3 ;
		System.out.println(results);
		
		//Product code
		System.out.println("Please type a number to rep. num1 :- ");
		num1 = sc.nextInt();
		System.out.println("Please type a number to rep. num2 :- ");
		num2 = sc.nextInt();
		System.out.println("Please type a number to rep. num3 :- ");
		num3 = sc.nextInt();
		//Add num1*num2*num3
		results = num1*num2*num3 ;
		System.out.println(results);
	}

}
