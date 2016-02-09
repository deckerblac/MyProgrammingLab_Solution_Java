import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter employee's name:");
		String myName = stdin.nextLine();
		System.out.print("Enter employee's ID number:");
		int myNumber = stdin.nextInt();
		System.out.print("Enter hourly rate:");
		double myrate = stdin.nextDouble();
		System.out.print("Enter number of hours worked:");
		int myhour = stdin.nextInt();
		
		Salary myPay = new Salary(myName,myNumber);
		myPay.setname(myName);
		myPay.setidNumber(myNumber);
		myPay.setrate(myrate);
		myPay.sethour(myhour);
		
		System.out.printf("%s" + ", employee number " + "%d" + ", made " + "$" + "%.2f" + " in gross pay.",myPay.getname(),myPay.getidNumber(),myPay.grossPay(myPay.gethour(),myPay.getrate()) );
		
	}

}

class Salary {

	private String name;
	private int idNumber;
	private double rate;
	private int hour;

	public Salary(String name, int idNumber) {

		this.name = name;
		this.idNumber = idNumber;
	}

	public double grossPay(int hour,double rate) {

	  double pay = hour * rate;

		return pay;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setidNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public void setrate(double rate) {
		this.rate = rate;
	}

	public void sethour(int hour) {
		this.hour = hour;
	}

	public String getname() {
		return name;
	}

	public int getidNumber() {
		return idNumber;
	}

	public double getrate() {
		return rate;
	}

	public int gethour() {
		return hour;
	}
}