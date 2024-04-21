import java.util.Scanner;

public class Main1061 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int diaI = input.nextInt(), horaI = input.nextInt(), minI = input.nextInt(), secI = input.nextInt(),
				diaF = input.nextInt(), horaF = input.nextInt(), minF = input.nextInt(), secF = input.nextInt();

		int dia = 0, hora = 0, min = 0, sec = 0;
		int contador, armazenador, resto;

		if (diaI == diaF) { // INICIO e TERMINO no MESMO DIA.
			armazenador = (horaF * 3600 + minF * 60 + secF) - (horaI * 3600 + minI * 60 + secI);// Transformar tudo em
																								// sec.
			dia = diaF - diaI;
			hora = armazenador / 3600;
			min = (armazenador % 3600) / 60;
			sec = (armazenador % 3600) % 60;
		} // Funcionando

		if (diaF - diaI == 1) {
			armazenador = ((24 * 3600) - (horaI * 3600 + minI * 60 + secI)) + (horaF * 3600 + minF * 60 + secF);
			dia = armazenador / (24 * 3600);
			hora = (armazenador % (24 * 3600)) / 3600;
			min = ((armazenador % (24 * 3600)) % 3600) / 60;
			sec = (((armazenador % (24 * 3600)) % 3600) % 60);
		}

		if (diaF - diaI > 1) {
			contador = diaF - diaI - 1; // DIAS ENTRE OS DOIS.
			armazenador = (contador * 24 * 3600) + ((24 * 3600) - (horaI * 3600 + minI * 60 + secI))
					+ (horaF * 3600 + minF * 60 + secF);
			dia = armazenador / (24 * 3600);
			resto = armazenador % (24 * 3600);
			hora = resto / 3600;
			resto = resto % 3600;
			min = resto / 60;
			resto = resto % 60;
			sec = resto;
		}

		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(min + " minuto(s)");
		System.out.println(sec + " segundo(s)");

		input.close();
	}
}
