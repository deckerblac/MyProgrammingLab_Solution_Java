import java.util.Scanner;

class MyStudentDetails{
    public static void main (String args[]){
         Scanner s = new Scanner(System.in);
         System.out.println("Enter Your Name: ");
         String name = s.nextLine();
         System.out.println("Enter Your Age: ");
         String age = s.nextLine();
         System.out.println("Enter Your E-mail: ");
         String email = s.nextLine();
         System.out.println("Enter Your Address: ");
         String address = s.nextLine();


         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
         System.out.println("E-mail: "+email);
         System.out.println("Address: "+address);

    }
}