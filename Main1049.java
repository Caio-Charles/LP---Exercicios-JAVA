import java.util.Scanner;

public class Main1049 {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner input = new Scanner(System.in);
		String nome1 = input.nextLine(), nome2 = input.nextLine(), nome3 = input.nextLine();
		input.close();

		// CONTROLE DE FLUXO COM COMPARAÇÕES, IGNORANDO AS LETRAS MINÚSCULAS E
		// MAIÚSCULAS:
		if (nome1.equalsIgnoreCase("vertebrado")) {

			if (nome2.equalsIgnoreCase("ave")) {
				if (nome3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {// SERVE?! SIM. PORÉM NÃO QUER DIZER QUE ESTEJA NECESSARIAMENTE CORRETO.
					System.out.println("pomba");
				}
			}

			if (nome2.equalsIgnoreCase("mamifero")) {
				if (nome3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} // parte dos vertebrados tá rodando.

		if (nome1.equalsIgnoreCase("invertebrado")) {
			if (nome2.equalsIgnoreCase("inseto")) {
				if (nome3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			}

			if (nome2.equalsIgnoreCase("anelideo")) {
				if (nome3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}

	}
}