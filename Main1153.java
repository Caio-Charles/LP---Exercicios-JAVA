
//Beecrow: Fatorial simples:
import java.util.Scanner;

public class Main1153 {
	public static void main(String[] args) {
		// Entrada de valor:
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		entrada.close();

		// Armazenamento:
		int fatorial = 1;

		// Processamento:
		if (n > 0 && n < 13) {
			for (int i = n; i >= 1; i--) {
				fatorial *= i;
			}
			// Saída:
			System.out.println(fatorial);
		}
	}

}
