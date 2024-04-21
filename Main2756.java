/**
 * Coloque sete espaços em branco e coloque o carácter 'A'; Coloque seis espaços
 * em branco e coloque o carácter 'B', um espaço em branco e o carácter 'B';
 * Coloque cinco espaços em branco e coloque o carácter 'C', três espaço em
 * branco e o carácter 'C'; Coloque quatro espaços em branco e coloque o
 * carácter 'D', cinco espaço em branco e o carácter 'D'; Coloque três espaços
 * em branco e coloque o carácter 'E', sete espaço em branco e o carácter 'E';
 * Repita o procedimento 4; Repita o procedimento 3; Repita o procedimento 2;
 * Repita o procedimento 1.
 */
public class Main2756 {
	public static void main(String[] args) {
		// ARRAY UNIDIMENSIONAL E VARIÁVEL:
		String[] texto = { "       A", "      B B", "     C   C", "    D     D", "   E       E" };
		int posicao = 0; // Armazena o indice do valor.

		// REPETIDOR CONTROLADO EM ORDEM CRESCENTE:
		for (int i = 0; i < texto.length; i++) {
			System.out.println(texto[i]);
			if (texto[i].equalsIgnoreCase("    D     D")) {
				posicao = i; 
			}
		}

		// REPETIDOR CONTROLADO EM ORDEM DESCRECENTE:
		for (int i = posicao; i >= 0; i--) {
			System.out.println(texto[i]);
		}

	}

}
