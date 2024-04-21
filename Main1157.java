import java.util.Scanner;

public class Main1157 {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner entrada = new Scanner(System.in);
		final int n = entrada.nextInt();
		entrada.close();
		
		// PROCESSAMENTO COM SAÍDA:
		for (int i = 1; i <= n; i++) { // Lista de 1 a n, pois é o menor div. + possível e n o maior.
			if(n % i != 0) { // Garante que não serão impressos núm. incorretos, pois avanca para prox. iteração.
				continue;
			}
			System.out.println(i); // O continue resolve o problema da impressão de núm. incorretos.
		}

	}

}
