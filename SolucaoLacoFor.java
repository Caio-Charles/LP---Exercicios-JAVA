import java.util.Scanner;

public class SolucaoLacoFor {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner entrada = new Scanner(System.in);
		int valor;

		if ((valor = entrada.nextInt()) >= 1 && valor <= 1000) {
			if (valor % 2 != 0) {
				for (int i = 1; i < valor + 1; i += 2) {
					System.out.println(i);
				}
			}
			if (valor % 2 == 0) {
				for (int i = 1; i < valor; i += 2) {
					System.out.println(i);
				}
			}
		}
		entrada.close();
	}

}
