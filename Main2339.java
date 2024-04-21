import java.util.Scanner;

public class Main2339 {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner entrada = new Scanner(System.in);
		int qtdPessoa = entrada.nextInt(), qtdComp = entrada.nextInt(), qtdReceber = entrada.nextInt();
		entrada.close();

		// PROCESSAMENTO COM SAÍDA:
		System.out.println(qtdPessoa * qtdReceber <= qtdComp ? "S" : "N");

	}

}
