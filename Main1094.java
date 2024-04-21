import java.util.Scanner;

public class Main1094 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtdTeste = input.nextInt();
		String[] quantia = new String[qtdTeste];
		
		for(int i = 0; i < qtdTeste; i++) {
			quantia[i] = input.next();
		}
		System.out.println(quantia);
	}

}
