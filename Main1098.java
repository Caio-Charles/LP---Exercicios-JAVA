import java.text.DecimalFormat;

public class Main1098 {
	public static void main(String[] args) {
		// Variáveis:
		DecimalFormat g = new DecimalFormat("0.0");
		double i = 0;
		double[] j = { 1, 2, 3 };

		// Controlador:
		int controlador = 0;

		do {
			if ((i == 0 || i == 1 || i == 2) || (j[0] == 1 && j[1] == 1 && j[2] == 1)
					|| (j[0] == 3 && j[1] == 3 && j[2] == 3) || (j[0] == 4 && j[1] == 4 && j[2] == 4)
					|| (j[0] == 10 && j[1] == 10 && j[2] == 10) || (j[0] == 12 && j[1] == 12 && j[2] == 12)) {
				int x = (int) i, a = (int) j[0], b = (int) j[0], c = (int) j[0];
				System.out.println("I=" + x + " J=" + a);
				System.out.println("I=" + x + " J=" + b);
				System.out.println("I=" + x + " J=" + c);
			}else {
			
				System.out.println("I=" + g.format(i) + " J=" + g.format(j[0]));
				System.out.println("I=" + g.format(i) + " J=" + g.format(j[1]));
				System.out.println("I=" + g.format(i) + " J=" + g.format(j[2]));
			}
			i += 0.2;
			j[0] += i;
			j[1] += i;
			j[2] += i;
			controlador++;
		} while (controlador < 11);

	}
}

/* if ((i > 0 || i > 1 || i > 2) || (j[0] > 1 && j[1] > 1 && j[2] > 1) || (j[0] > 3 && j[1] > 3 && j[2] > 3)
|| (j[0] > 4 && j[1] > 4 && j[2] > 4) || (j[0] > 10 && j[1] > 10 && j[2] > 10)
|| (j[0] > 12 && j[1] > 12 && j[2] > 12)) {
System.out.println("I=" + g.format(i) + " J=" + g.format(j[0]));
System.out.println("I=" + g.format(i) + " J=" + g.format(j[1]));
System.out.println("I=" + g.format(i) + " J=" + g.format(j[2]));
} */