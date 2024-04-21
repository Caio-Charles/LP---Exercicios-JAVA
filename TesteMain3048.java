import java.util.Scanner;

public class TesteMain3048 {
	public static void main(String[] args) {
		// ENTRADA DA QUANTIDADE DE VALORES DA SEQUÊNCIA:
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();

		int num, bol = 0, temp = 0; // Num: valores da sequência ; bol: qtd máxima de círculos ; temp: armazena o
									// valor atual para próxima verificação.

		// PROCESSAMENTO COM C. FLUXOS ANINHADOS:
		for (int i = 0; i < n; i++) {
			num = entrada.nextInt();
			if (bol == 0 && num == 1) { // Preenche o círculo do primeiro valor da seq. (uma única vez).
				bol++;
				temp = num;
			}
			if (num != temp) { // Verifica se o atual é diferente do anterior e preenche o círculo.
				bol++;
				temp = num;
			}

		}
		entrada.close();

		// SAÍDA:
		System.out.println(bol); // o laço impede que seja impresso o 0.

	}
}
