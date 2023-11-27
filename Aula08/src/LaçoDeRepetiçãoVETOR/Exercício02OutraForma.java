package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício02OutraForma {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Crie uma array de 5 elementos
		// momento de imprimir:
		// comece pelo último elemento até o primeiro elemento.

		// entrada

		int[] elementos = new int[5];

		elementos[0] = 1;
		elementos[1] = 2;
		elementos[2] = 3;
		elementos[3] = 4;
		elementos[4] = 5;

		// processo

		for (int índice = (elementos.length - 1); índice >= 0; índice--) {
			System.out.println(elementos[índice]);

		}

	}

}
