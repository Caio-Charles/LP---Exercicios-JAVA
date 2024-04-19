import java.util.Scanner;

public class SolucaoLacoFor {
	public static void main(String[] args) {
		// ENTRADA E VARIÁVEIS:
		Scanner entrada = new Scanner(System.in);
		int valor, erro = 0; // Valor: armazena a entrada do usuario ; erro: armazena a qtd de valores fora do intervalo fechado.

		// PROCESSAMENTO COM SAÍDA:
		for (int i = 0; i <= erro; i++) { // Garante que ao menos uma 1x a entrada será solicitada.
			valor = entrada.nextInt();

			if (valor < 1 || valor > 1000) { // Garante que a entrada seja solicitada enquanto fora de intervalo.
				erro++;
				continue; // Não permite que o laço subsequente seja executado, passando para próx. iteração de 'i'.
			}

			for (int j = 1; j <= valor; j += 2) {
				System.out.println(j);
			}
		}
		entrada.close();
	}
}
