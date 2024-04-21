import java.util.Scanner;

public class Main1144 {
	public static void main(String[] args) {
		// ENTRADAS:
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // Linhas de saída = n * 2.
		input.close();

		// PROCESSAMENTO COM SAÍDA:
		if (n > 1 && n < 1000) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i + " " + (i * i) + " " + (i * i * i));
				System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
			}
		}

	}

}
