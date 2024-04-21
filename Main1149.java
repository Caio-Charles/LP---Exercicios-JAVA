import java.util.*;

public class Main1149 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(), n = input.nextInt(), soma = 0;

		while (n <= 0) {
			n = input.nextInt();
		}

		for (int i = 0; i <= n - 1; i++) {
			soma += a + i; // 3 ; 3 + 1; 3 + 4 = 7
		}

		System.out.println(soma);

	}

}
