import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1064 {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner entrada = new Scanner(System.in);
		double[] valores = new double[6];

		// CONTADOR e SOMADOR:
		int contador = 0;
		double soma = 0;

		// ENTRADAS:
		for (int i = 0; i < valores.length; i++) {
			valores[i] = entrada.nextDouble();
			if (valores[i] > 0) {
				contador++;
				soma += valores[i];
			}
		}
		entrada.close();

		// MEDIA:
		double media = soma / contador;
		
		//FORMATAR A SAÍDA:
		DecimalFormat f = new DecimalFormat("0.0");

		System.out.println(contador + " valores positivos");
		System.out.println(f.format(media));

	}// main

}
