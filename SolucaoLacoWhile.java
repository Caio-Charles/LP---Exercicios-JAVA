import java.util.Scanner;

public class SolucaoLacoWhile {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt(), i = 1;

		// PROCESSAMENTO COM VERIFICAÇÃO DA ENTRADA:
		while (valor < 1 || valor > 1000) {
			valor = entrada.nextInt();
		}
		entrada.close();

		// PROCESSAMENTO COM SAÍDA:
		do {
			System.out.println(i);
			i += 2;
		} while (i <= valor);
	}
}
