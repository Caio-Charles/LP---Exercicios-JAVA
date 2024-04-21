import java.util.Scanner;

public class Main2791 {
	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS:
		Scanner entrada = new Scanner(System.in);
		int[] copo = new int[4];
		int posicao = 0; // Posicao : regista a ultima posicao em que se encontra o feijao.

		// ENTRADA COM PROCESSAMENTO:
		for (int i = 0; i < copo.length; i++) { // Solicita o preenchimento dos 4 copos.
			do {
				copo[i] = entrada.nextInt();
				if (copo[i] == 1) { // A pessoa pode querer trocar o feijao de lugar no momento da organizacao.
					posicao = i; // Entao precisamos sempre registrar a ultima posicao em que ele se encontra
				}
			} while (copo[i] < 0 || copo[i] > 1); // Verifica a entrada.
		}
		entrada.close();

		// PROCESSAMENTO INTERMEDIÁRIO:
		posicao++; // Como o array numera a partir do 0, a posicao real (semântica) é o resultado do incremento.

		// SAÍDA:
		System.out.println(posicao); // É impossível ser impresso 0, pois o algoritmo sempre passa pelo laco anterior.
	}
}
