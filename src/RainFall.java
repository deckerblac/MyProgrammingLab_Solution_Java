import java.util.Scanner;

public class RainFall {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double[] rainfall = new double[12];
		for (int i = 0; i < 12; i++) {
			do {
				System.out.print("Enter rainfall for month " + (i + 1) + ":");
				rainfall[i] = stdin.nextDouble();
			} while (rainfall[i] < 0);
			
		}
		calcRain myCalc = new calcRain(rainfall);
		System.out.println(myCalc.totalRain());
		System.out.println(myCalc.avgRain());
		System.out.println(myCalc.mostRain());
		System.out.println(myCalc.leastRain());
	}
}

class calcRain {

	private double[] rainScore;
	private String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	public calcRain(double[] rainArray) {
		this.rainScore = rainArray;

	}

	public double totalRain() {
		double total = 0;
		for (int i = 0; i < rainScore.length; i++) {
			total += rainScore[i];
		}
		return total;
	}

	public double avgRain() {
		double avg;
		double total = 0;

		for (double d : rainScore) {
			total += d;
		}
		avg = total / (rainScore.length);
		return avg;
	}

	public String mostRain() {
		double most = rainScore[0];
		String change = month[0];
		for (int i = 0; i < rainScore.length; i++) {
			if (most < rainScore[i]) {
				most = rainScore[i];
				change = Double.toString(most);
				change = month[i];
			}

		}
		return change;
	}

	public String leastRain() {
		double least = rainScore[0];
		String change = month[0];
		for (int i = 0; i < rainScore.length; i++) {
			if (least > rainScore[i]) {
				least = rainScore[i];
				change = Double.toString(least);
				change = month[i];
			}
		}
		return change;
	}

}