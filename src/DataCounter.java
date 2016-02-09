import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DataCounter {

	public static void main(String[] args) {
 
    int dd;

    Scanner daydate = new Scanner(System.in);
    
    System.out.println("Please enter the Full Date-eg:1981 01 01:- ");
    dd = daydate.nextInt();
	
	Object i = Stringvalueof(dd);
	
	SimpleDateFormat dt = new SimpleDateFormat("EEEE,yyyy/MM/dd");
	//DateFormat dt = DateFormat.getInstance();
	String date = dt.format(i);
	System.out.println(i);
	}

	private static Object Stringvalueof(int dd) {
		// TODO Auto-generated method stub
		return null;
	}

}


/*String NAME ;
int AGE;
String CITY;
String COLLEGE;
String PROFESSION;
String ANIMAL;
String PETNAME;


NAME = JOptionPane.showInputDialog
AGE  = Integer.parseInt("Enter your age: ");
CITY  = JOptionPane.showInputDialog("Enter the name of a city: ");
COLLEGE  = JOptionPane.showInputDialog("Enter the name of a college: ");
PROFESSION = JOptionPane.showInputDialog("Enter profession: ");
ANIMAL  = JOptionPane.showInputDialog("Enter a type of animal: ");
PETNAME  = JOptionPane.showInputDialog("Enter a pet name: ");


JOptionPane.showMessageDialog(null, "There once was a person named " + 
NAME + " who lived in " + CITY +". At the age of"+ AGE + ", " + 
NAME + " went to college at " + COLLEGE +". " + 
NAME + " graduated and went to \nwork as a " + PROFESSION +". Then, " + 
NAME + " adopted a(n) " + ANIMAL + " named " + 
PETNAME + "\n They both lived happily ever after!");*/