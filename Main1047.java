
import java.util.Scanner;

public class Main1047 {
	public static void main(String[] arg) {
		// ENTRADAS:
		Scanner input = new Scanner(System.in);
		int horaInicio = input.nextInt(), minutoInicio = input.nextInt(), horaFim = input.nextInt(),
				minutoFim = input.nextInt();
		input.close();

		// VARIAVEIS:
		int hora = 0, minuto = 0, temp;

		// CONTROLE DE FLUXO:
		if (horaInicio == horaFim && minutoInicio == minutoFim) {// Caso em que durou 24h.
			hora = 24;
			minuto = 0;
		}

		if ((horaInicio == horaFim) && (minutoInicio > minutoFim)) {// Quase próximo das 24h.
			temp = ((24 * 60) - (horaInicio * 60 + minutoInicio)) + (horaFim * 60 + minutoFim);
			hora = temp / 60;// 23
			minuto = temp % 60;
			//System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");
		}

		if (horaInicio < horaFim) {// Quando começou no mesmo dia e terminou no mesmo dia.
			temp = (horaFim * 60 + minutoFim) - (horaInicio * 60 + minutoInicio);// minutos
			hora = temp / 60;
			minuto = temp % 60;
		}

		if (horaInicio == horaFim && minutoInicio < minutoFim) {
			temp = (horaFim * 60 + minutoFim) - (horaInicio * 60 + minutoInicio);
			hora = temp / 60;
			minuto = temp % 60;
		}

		if (horaInicio > horaFim) {// Começa em um dia e termina no outro
			temp = (24 * 60 - (horaInicio * 60 + minutoInicio)) + (horaFim * 60 + minutoFim);// minutos
			hora = temp / 60;
			minuto = temp % 60;
		}

		System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");

	}
}
