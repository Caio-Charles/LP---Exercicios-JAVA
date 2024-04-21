import java.util.*;

public class Main3048 {
	public static void main(String[] arg) {
		// ENTRADA DA QUANTIDADE DE VALORES DA SEQUÊNCIA:
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();

		int num, bol = 0, temp = 0; // Num: valores da sequência ; bol: qtd máxima de círculos ; temp: armazena o
									// valor atual para próxima verificação.

		// PROCESSAMENTO:
		for (int i = 0; i < 1; i++) {
			num = entrada.nextInt(); // Coloca o 1.
			temp = num;
			bol++;
		}
		for (int i = 0; i < n - 1; i++) {
			num = entrada.nextInt(); // Coloca os demais números.
			if (num != temp) { // Verifica se o número atual é diferente do anterior.
				bol++;
				temp = num; // Atribui a 'temp' o valor atual para a próxima verificação.
			}
		}
		entrada.close();
		
		// SAÍDA:
		System.out.println(bol); //é impossível esse comando ser executado sem passar antes pelos laços.
	}
}
