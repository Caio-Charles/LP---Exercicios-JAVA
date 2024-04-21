import java.util.Scanner;
import java.util.Arrays;

public class Main1080 {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner input = new Scanner(System.in);
		int number, maior = 0, posicao = 0;
		// REPETIDOR COM CONTROLE DE FLUXO.
		for (int i = 0; i < 100; i++) {
			number = input.nextInt();
			if (number > maior) {
				maior = number;
				posicao = i + 1;
			}
		}
		// SAÍDA:
		System.out.println(maior);
		System.out.println(posicao);
	}
}
