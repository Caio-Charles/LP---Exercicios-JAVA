import java.util.*;
import java.text.*;

public class Main1117 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DecimalFormat f = new DecimalFormat("0.00");

		// ENTRADAS E VARIÁVEL:
		Scanner input = new Scanner(System.in);
		double a, b, media;

		// PROCESSAMENTO:
		a = input.nextDouble();
		while (a < 0 || a > 10) {
			System.out.println("nota invalida");
			a = input.nextDouble();
		}

		b = input.nextDouble();
		while (b < 0 || b > 10) {
			System.out.println("nota invalida");
			b = input.nextDouble();
		}
		input.close();

		media = (a + b) / 2;

		// SAÍDA:
		System.out.println("media = " + f.format(media));
	}
}