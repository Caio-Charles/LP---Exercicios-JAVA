import java.util.Scanner;

public class Main1143 {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();

		// PROCESSAMENTO COM SAÍDA:
		for (int i = 1; i <= number; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
		}
	}
}
