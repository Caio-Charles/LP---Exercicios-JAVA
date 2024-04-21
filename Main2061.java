import java.util.Scanner;

public class Main2061 {
	public static void main(String[] args) {
		// ENTRADA E VARIÁVEIS:
		Scanner entrada = new Scanner(System.in);
		int aberta = entrada.nextInt(), acao = entrada.nextInt(); // aberta: abas aberta no inicio ; acao = qtd de acoes
																	// do tipo fechou ou clicou.

		int fechou = 0, clicou = 0; // fechou: armazena a qtd de vezes q acao foi feita ; clicou: mesma coisa.
		String temp; // temp: armazena temporariamente o texto que descreve a acao realizada.

		// PROCESSAMENTO:
		for (int i = 0; i < acao; i++) {
			temp = entrada.nextLine();
			if (temp.equalsIgnoreCase("fechou")) { // se for digitado "fechou"...
				fechou++; // a var 'fechou' sofre incremento, senão...
			} else {
				clicou++;
			}
		}
		aberta = (aberta - 1 * fechou) + 2 * fechou; // dá o número de abas abertas com base na var 'fechou'.
		aberta -= 1 * clicou; // dá o número de abas fechadas com base na var 'clicou'.
		entrada.close();

		// SAÍDA:
		System.out.println(aberta);
	}
}