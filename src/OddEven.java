import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	  
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        
        x = sc.nextInt();
        
        if( x % 2 == 0)
        {
        	System.out.println("This is an even number");
        }else
        	System.out.println("This is an old number");
	}

}
