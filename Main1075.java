import java.util.Scanner;

public class Main1075 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;

		if ((n = input.nextInt()) < 10000) {
			for (int i = 2; i < 10000; i++) {
				if (i % n == 2) {
					System.out.println(i);
				}
			}
		} else {
			input.close();
		}

	}

}
