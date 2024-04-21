import java.util.Scanner;

public class Main1050 {
	public static void main(String[] args) {
		// Matrizes:
		int[] ddd = new int[8];
		String[] regiao = new String[8];

		ddd[0] = 61;
		regiao[0] = "Brasilia";
		ddd[1] = 71;
		regiao[1] = "Salvador";
		ddd[2] = 11;
		regiao[2] = "Sao Paulo";
		ddd[3] = 21;
		regiao[3] = "Rio de Janeiro";
		ddd[4] = 32;
		regiao[4] = "Juiz de Fora";
		ddd[5] = 19;
		regiao[5] = "Campinas";
		ddd[6] = 27;
		regiao[6] = "Vitoria";
		ddd[7] = 31;
		regiao[7] = "Belo Horizonte";

		// Entrada:
		Scanner input = new Scanner(System.in);
		int usuario = input.nextInt();
		input.close();

		// Controle de fluxo:
		if (usuario == ddd[0]) {
			System.out.println(regiao[0]);
		}
		if (usuario == ddd[1]) {
			System.out.println(regiao[1]);
		}
		if (usuario == ddd[2]) {
			System.out.println(regiao[2]);
		}
		if (usuario == ddd[3]) {
			System.out.println(regiao[3]);
		}
		if (usuario == ddd[4]) {
			System.out.println(regiao[4]);
		}
		if (usuario == ddd[5]) {
			System.out.println(regiao[5]);
		}
		if (usuario == ddd[6]) {
			System.out.println(regiao[6]);
		}
		if (usuario == ddd[7]) {
			System.out.println(regiao[7]);
		} // Como eu faria para automatizar isso com um processo de repetição controlada?
		if (usuario != ddd[0] && usuario != ddd[1] && usuario != ddd[2] && usuario != ddd[3] && usuario != ddd[4]
				&& usuario != ddd[5] && usuario != ddd[6] && usuario != ddd[7]) {
			System.out.println("DDD nao cadastrado");
		}
	}

}
