import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		String name;
		String address;
		String telephoneNumber;
		String CustomerNumber;
		boolean myBoolean = false;
		double amount = 0;
		int discount = 0;
		String input;

		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter name of customer:");
		name = stdin.nextLine();
		System.out.print("Enter address of customer:");
		address = stdin.nextLine();
		System.out.print("Enter phone number of customer:");
		telephoneNumber = stdin.nextLine();
		System.out.print("Enter customer number:");
		CustomerNumber = stdin.nextLine();
		System.out.print("Enter yes/no -- does the customer want to recieve mail?:");
		input = stdin.nextLine();
		System.out.println("Enter amount customer has spent:");
		amount = stdin.nextInt();

		preferredCustomer account = new preferredCustomer(name, address, telephoneNumber, CustomerNumber, myBoolean,
				amount, discount);
		account.setName(name);
		account.setAddress(address);
		account.settelephoneNumber(telephoneNumber);
		account.setCustomerNumber(CustomerNumber);
		account.setMyBoolean(input);
		account.setAmount(amount);
		account.setDiscount(discount);

		System.out.println("Customer: \n" + "Name: " + account.getName() + "\n" + "Address: " + account.getAddress()
				+ "\n" + "Phone Number: " + account.gettelephoneNumber() + "\n" + "Customer Number: "
				+ account.getCustomerNumber() + "\n" + "Recieve Mail?: " + account.getMyBoolean() + "\n"
				+ account.toString());
	}
}

class Person {

	public Person(String name, String address, String telephoneNumber) {
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void settelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String gettelephoneNumber() {
		return telephoneNumber;
	}

	private String name;
	private String address;
	private String telephoneNumber;
}

class Customer extends Person {

	public Customer(String name, String address, String telephoneNumber, String CustomerNumber, boolean myBoolean) {
		super(name, address, telephoneNumber);

		this.CustomerNumber = CustomerNumber;
		this.myBoolean = myBoolean;
	}

	public void setCustomerNumber(String CustomerNumber) {
		this.CustomerNumber = CustomerNumber;
	}

	public void setMyBoolean(String answer) {
		if (answer.equalsIgnoreCase("Yes")) {
			myBoolean = true;
		} else if (answer.equalsIgnoreCase("No")) {
			myBoolean = false;
		}
	}

	public String getCustomerNumber() {
		return CustomerNumber;
	}

	public boolean getMyBoolean() {
		return myBoolean;
	}

	private String CustomerNumber;
	private boolean myBoolean;
}

class preferredCustomer extends Customer {

	private double amount;
	private int discount;

	public preferredCustomer(String name, String address, String telephoneNumber, String CustomerNumber,
			boolean myBoolean, double amount, int discount) {
		super(name, address, telephoneNumber, CustomerNumber, myBoolean);

		this.amount = amount;
		this.discount = discount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setDiscount(int discount) {
		if (this.amount >= 500 && this.amount < 1000) {
			discount = 5;
			this.discount = discount;
		} else if (this.amount >= 1000 && this.amount < 1500) {
			discount = 6;
			this.discount = discount;
		} else if (this.amount >= 1500 && this.amount < 2000) {
			discount = 7;
			this.discount = discount;
		} else if (this.amount == 2000) {
			discount = 10;
			this.discount = discount;
		}
	}

	public double getAmount() {
		return amount;
	}

	public int getDiscount() {
		return discount;
	}

	public String toString() {
		return "Amount Purchased: " + "$" + getAmount() + "0" + "\n" + "Percent off: " + getDiscount() + "%";
	}
}