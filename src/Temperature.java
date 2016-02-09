import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit temperature:");
		double myTemp = stdin.nextDouble();
		Temp urTemp = new Temp(myTemp);
		urTemp.setFahrenheit(myTemp);

		System.out.print("The temperature in Fahrenheit is " + urTemp.getFahrenheit());
		System.out.println();
		System.out.printf("The temperature in Celsius is "+ urTemp.getCelsius());
		System.out.println();
		System.out.printf("The temperature in Kelvin is "+ urTemp.getKelvin());

	}

}

class Temp {
	private double ftemp;

	public Temp(double x) {
		this.ftemp = x;
	}

	public void setFahrenheit(double x) {
		this.ftemp = x;
	}

	public double getFahrenheit() {
		return ftemp;
	}

	public double getCelsius() {
		double Celsius = (5.0/9.0) * (getFahrenheit() - 32);
		return Celsius;
	}

	public double getKelvin() {
		double Kelvin = ((5.0/9.0) * (getFahrenheit() - 32)) + 273;
		return Kelvin;
	}

}
