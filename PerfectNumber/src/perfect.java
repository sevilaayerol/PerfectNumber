import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
		int n, total = 0, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		n = input.nextInt();

		for (i = n - 1; i >= 1; i--) {
			if (n % i == 0) {
				total += i;
			}

		}
		if (total == n) {
			System.out.println(n + " perfect number!");
		} else {
			System.out.println(n + " not perfect number!");
		}
	}

}
