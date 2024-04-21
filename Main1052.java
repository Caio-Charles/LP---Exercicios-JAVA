import java.util.Scanner;

public class Main1052 {

	public static void main(String[] args) {
		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		Scanner input = new Scanner(System.in);
		int usuario = input.nextInt();
		input.close();

		switch (usuario) {
		case 1:
			System.out.println(month[0]);
			break;
		case 2:
			System.out.println(month[1]);
			break;
		case 3:
			System.out.println(month[2]);
			break;
		case 4:
			System.out.println(month[3]);
			break;
		case 5:
			System.out.println(month[4]);
			break;
		case 6:
			System.out.println(month[5]);
			break;
		case 7:
			System.out.println(month[6]);
			break;
		case 8:
			System.out.println(month[7]);
			break;
		case 9:
			System.out.println(month[8]);
			break;
		case 10:
			System.out.println(month[9]);
			break;
		case 11:
			System.out.println(month[10]);
			break;
		case 12:
			System.out.println(month[11]);
			break;
		default:
			System.out.println("Digite um valor entre 1 e 12, inclusive");
		}

	}

}
