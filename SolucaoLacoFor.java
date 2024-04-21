import java.util.Scanner;

public class SolucaoLacoFor {
	public static void main(String[] args) {
		// ENTRADA E VARIÁVEIS:
		Scanner entrada = new Scanner(System.in);
		int valor, i;

		// PROCESSAMENTO COM VALIDAÇÃO DA ENTRADA:
		verificador: for (i = 0; true; i++) {
			valor = entrada.nextInt();
			if (valor < 1 || valor > 1000) {
				continue verificador;
			} else {
				i = 1; // PONTO CRUCIAL PRA FUNCIONAR!
				break verificador;
			}
		}
		entrada.close();

		// PROCESSAMENTO COM SAÍDA
		while (i <= valor) {
			System.out.println(i);
			i += 2;
		}
	}
}
