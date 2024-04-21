import java.util.Scanner;

public class Main1074 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtdTeste = input.nextInt();
		int[] armazenador = new int[qtdTeste];

		for (int i = 0; i < armazenador.length; i++) {
			armazenador[i] = input.nextInt();
			for (int j = 0; j < 1; j++) {
				if (armazenador[i] % 2 == 0 && armazenador[i] != 0) { // par.
					System.out.print("EVEN ");
				} else if (armazenador[i] % 2 != 0 && armazenador[i] != 0) {
					System.out.print("ODD ");
				}
				if (armazenador[i] > 0) {
					System.out.println("POSITIVE");
				} else if (armazenador[i] < 0) {
					System.out.println("NEGATIVE");
				}
				if (armazenador[i] == 0) {
					System.out.println("NULL");
				}
			}
		}
		input.close();

	}

}
