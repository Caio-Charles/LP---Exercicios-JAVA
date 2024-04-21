import java.util.Scanner;
import java.util.Arrays;

public class Main1045 {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner input = new Scanner(System.in);
		double[] medida = new double[3];
		if ((medida[0] = input.nextDouble()) > 0 && (medida[1] = input.nextDouble()) > 0
				&& (medida[2] = input.nextDouble()) > 0) {
			// Grave.
		} else {
			// Feche.
			input.close();
		}

		// ORGANIZANDO MEU ARRAY EM ORDEM CRESCENTE:
		Arrays.sort(medida);
		// System.out.println(medida[0] + " " + medida[1] + " " + medida[2]);

		// ORGANIZANDO EM ORDEM DESCRECENTE:
		double a = medida[2]; // Máx
		double b = medida[1]; // Mediana
		double c = medida[0];// Mínima
		// System.out.println(a + " " + b + " " + c);

		for (int i = 0; i < 1; i++) {
			if (a >= b + c) {
				System.out.println("NAO FORMA TRIANGULO");
				break;// Resolve o problema de imprimir obtusangulo depois.
			}
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if ((a == b) && (b == c)) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((a == b && b != c) || (b == c && c != a) || (a == c && c != b)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

	}
}