import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1048 {
	public static void main(String[] args) {
		// ENTRADA:
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		input.close();

		double novoSal = 0, reajuste = 0;
		int[] percent = { 15, 12, 10, 7, 4 };
		int percentI = 0;

		if (salario >= 0 && salario <= 400) {
			reajuste = salario * 0.15;
			novoSal = salario + reajuste;
			percentI = percent[0];
		}
		if (salario >= 400.01 && salario <= 800) {
			reajuste = salario * 0.12;
			novoSal = salario + reajuste;
			percentI = percent[1];
		}
		if (salario >= 800.01 && salario <= 1200) {
			reajuste = salario * 0.1;
			novoSal = salario + reajuste;
			percentI = percent[2];
		}
		if (salario >= 1200.01 && salario <= 2000) {
			reajuste = salario * 0.07;
			novoSal = salario + reajuste;
			percentI = percent[3];
		}
		if (salario > 2000) {
			reajuste = salario * 0.04;
			novoSal = salario + reajuste;
			percentI = percent[4];
		}

		// Formatação e saída:
		DecimalFormat f = new DecimalFormat("0.00");
		System.out.println("Novo salario: " + f.format(novoSal));
		System.out.println("Reajuste ganho: " + f.format(reajuste));
		System.out.println("Em percentual: " + percentI + " %");
	}

}
