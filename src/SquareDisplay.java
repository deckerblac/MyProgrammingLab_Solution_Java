import java.util.Scanner;

public class SquareDisplay {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter an integer in the range of 1-15: ");
		int user = stdin.nextInt();
		for (int i = 0; i < user; i++) {
			for (int j = 0; j < user; j++) {
				char X = 'X';
				System.out.printf("%c", X);
			}
			System.out.println();
		}
	}
}

