import java.util.Scanner;

public class LandTract {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter length of first land tract:");
		int length1 = stdin.nextInt();
		System.out.print("Enter width of first land tract:");
		int width1 = stdin.nextInt();
		System.out.print("Enter length of second land tract:");
		int length2 = stdin.nextInt();
		System.out.print("Enter width of second land tract:");
		int width2 = stdin.nextInt();

		Tract first = new Tract(length1, width1);
		first.getArea();
		System.out.print(first.toString());
		System.out.println();
		Tract second = new Tract(length2, width2);
		second.getArea();
		System.out.println(second.toString());

		if (length1 == length2 && width1 == width2) {
			System.out.println("The two tracts have the same size.");
		} else if (length1 == width2 && length2 == width1) {
			System.out.println("The two tracts have the same size.");
		}else{
			System.out.println("The two tracts do not have the same size.");
		}

		/*if (length1 == width2 && length2 == width1) {
			System.out.println("The two tracts have the same size.");
		} else {
			System.out.println("The two tracts do not have the same size.");
		}*/

	}

}

class Tract {

	private int length;
	private int width;
	private int area;

	public Tract(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getArea() {
		area = length * width;
		return area;
	}

	// length and width
	public boolean equals(Tract obj2) {
		boolean status;
		if (length == obj2.width)
			status = true;
		else
			status = false;

		return status;
	}

	// LandTract·with·length·25,·width·60,·and·area·1500
	public String toString() {
		String str = "LandTract with length " + length + ", " + "width " + width + "," + " and area " + area;
		return str;
	}

}
