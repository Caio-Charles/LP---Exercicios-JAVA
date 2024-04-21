import java.util.Scanner;

public class Main2058 {
	public static void main(String[] args) {
		// ENTRADA E VARIÁVEIS:
		Scanner entrada = new Scanner(System.in);
		int l, qtdMinima;

		// PROCESSAMENTO:
		do {
			l = entrada.nextInt();
		} while (l < 3 || l > Math.pow(10, 9)); // Laço que verifica a entrada.
		entrada.close();

		qtdMinima = l - 3 + 1; // An = a1 + (n-1) * q ; a qtdMinima corresponde aos indices dos valores da PA {3,4,...}, onde q = +1.

		// SAÍDA:
		System.out.println(qtdMinima);
	}
}
