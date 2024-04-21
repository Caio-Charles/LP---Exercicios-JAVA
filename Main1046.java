import java.util.Scanner;

public class Main1046 {
	public static void main(String[] args) {
		// ENTRADAS:
		Scanner input = new Scanner(System.in);
		int horaInicio = input.nextInt(), horaFim = input.nextInt();
		if (horaInicio >= 1 && horaInicio <= 24 && horaFim >= 1 && horaFim <= 24) {

		} else if (horaInicio == 0 || horaFim == 0) {

		} else {
			input.close();
		}

		int duracao = 0;

		// Processamento:
		if (horaInicio < horaFim) {// Jogo começou e terminou no mesmo dia.
			duracao = horaFim - horaInicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		if (horaInicio == horaFim) {// Sempre será 24h.
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		if (horaInicio > horaFim) {// Começou em um dia e terminou no outro.
			duracao = (24 - horaInicio) + horaFim;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}

	}

}
