import java.util.Scanner;

public class Main1943 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int posicao;
		do {
			posicao = entrada.nextInt();
		} while (posicao < 1 || posicao > 100);
		entrada.close();

		boolean top1 = posicao == 1, top3 = posicao > 1 && posicao <= 3, top5 = posicao > 3 && posicao <= 5,
				top10 = posicao > 5 && posicao <= 10, top25 = posicao > 10 && posicao <= 25,
				top50 = posicao > 25 && posicao <= 50, top100 = posicao > 50 && posicao <= 100;

		if (top1) {
			System.out.println("Top 1");
		} else if (top3) {
			System.out.println("Top 3");
		} else if (top5) {
			System.out.println("Top 5");
		} else if (top10) {
			System.out.println("Top 10");
		} else if (top25) {
			System.out.println("Top 25");
		} else if (top50) {
			System.out.println("Top 50");
		} else if (top100) {
			System.out.println("Top 100");
		}
	}

}
