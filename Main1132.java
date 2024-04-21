//PRECISO CORRIGIR, ESTÁ DANDO ERRO.

import java.util.*;

public class Main1132 {
	public static void main(String[] args) {
		// ENTRADAS:
		Scanner input = new Scanner(System.in);
		int x = input.nextInt(), y = input.nextInt(), soma = 0;
		input.close();

		// PROCESSAMENTO:
		if (x % 13 == 0 && y % 13 == 0) { // Quando AMBOS são múltiplos de 13.
			if (x < y) {
				for (int i = x; i <= y; i++) {
					if (i % 13 == 0) { // Garanto que vou somar apenas os números que são múltiplos de 13.
						soma += i;
					}
				}
			}
			if (y < x) {
				for (int i = y; i <= x; i++) {
					if (i % 13 == 0) {
						soma += i;
					}
				}
			}
			if (x == y) {
				soma = x + y;
			}
		}

		if (x % 13 == 0 && y % 13 != 0) { // Quando só o X é múltiplo de 13.
			if (x < y) {
				for (int i = x; i <= y; i++) {
					if (i % 13 == 0) {
						soma += i;
					}
				}
			}

			if (y < x) {
				for (int i = y; i <= x; i++) {
					if (i % 13 == 0) {
						soma += i;
					}
				}
			}
		}

		if (y % 13 == 0 && x % 13 != 0) { // Quando só o Y é múltiplo de 13.
			if (x < y) {
				for (int i = x; i <= y; i++) {
					if (i % 13 == 0) {
						soma += i;
					}
				}
			}

			if (y < x) {
				for (int i = y; i <= x; i++) {
					if (i % 13 == 0) {
						soma += i;
					}
				}
			}
		}
		
		if(x%13 != 0 && y%13!=0) {//Os extremos não sao multiplos de treze
			if (x < y) {
				for (int i = x; i <= y; i++) {
					if (i % 13 == 0) { // Garanto que vou somar apenas os números que são múltiplos de 13.
						soma += i;
					}
				}
			}
			if (y < x) {
				for (int i = y; i <= x; i++) {
					if (i % 13 == 0) {
						soma += i;
					}
				}
			}
		}

		// SAÍDA:
		System.out.println(soma);
	}
}