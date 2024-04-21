import java.util.Scanner;

public class Main2936 {
	public static void main(String[] args) {
		// HABILITANDO A ENTRADA E DECLARANDO VARIÁVEIS:
		Scanner entrada = new Scanner(System.in);
		final int[] porcao = { 300, 1500, 600, 1000, 150 }; // qtds fixas das porcoes guardados dentro de um Array.
		int qtd, total = 225; // qtd: quantas porcoes quando um vai querer ; total: já começa com o valor fixo
								// de Dona Chica.

		// PROCESSAMENTO:
		for (int i = 0; i < porcao.length; i++) { // o laço cria os indices da PA 'array porcao'.
			qtd = entrada.nextInt(); // solicita a qtd de porcao
			total += qtd * porcao[i]; // somando sempre de acordo com a ordem de preenchimento.
		}

		// SAÍDA:
		System.out.println(total);

	}

}
