import java.util.Scanner;

class WordGame {
    public static void main(String args[] ) throws Exception {
    Scanner  input= new Scanner(System.in);	
    System.out.print("Enter your name: ");
	String NAME = input.nextLine();	
	System.out.print("Enter your age: ");
	String AGE = input.nextLine();
    System.out.print("Enter the name of a city: ");
    String CITY = input.nextLine();		
    System.out.print("Enter the name of a college: ");
   	String COLLEGE = input.nextLine();	
	System.out.print("Enter profession: ");
	String PROFESSION = input.next();	
	System.out.print("Enter a type of animal: ");
	String ANIMAL = input.next();		
	System.out.print("Enter a pet name: ");	
	String PETNAME = input.next();

    System.out.println("There once was a person named " + 
    NAME + " who lived in " + CITY +". At the age of " + AGE + ", " + 
    NAME + " went to college at " + COLLEGE +". " + 
    NAME + " graduated and went to \nwork as a " + PROFESSION +". Then, " + 
    NAME + " adopted a(n) " + ANIMAL + " named " + 
    PETNAME + " They both lived happily ever after!");	
     
		
    }
}