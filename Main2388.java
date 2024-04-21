import java.util.Scanner;

public class Main2388 {
	public static void main(String[] args) {
		// ENTRADA E VARIÁVEIS:
		Scanner entrada = new Scanner(System.in);
		int qtd = entrada.nextInt();
		int dist = 0, temp, vel;

		// PROCESSAMENTO:
		for (int i = 0; i < qtd; i++) {
			temp = entrada.nextInt();
			vel = entrada.nextInt();
			dist += (vel * temp);
		}
		entrada.close();

		// SAÍDA:
		System.out.println(dist);

	}

}
