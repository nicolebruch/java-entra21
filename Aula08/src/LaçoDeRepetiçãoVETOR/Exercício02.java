package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício02 {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Crie uma array de 5 elementos
		// momento de imprimir:
		// comece pelo último elemento até o primeiro elemento.

		// entrada

		int[] elementos = new int[5];
		System.out.println("Informe 5 valores.");

		// processo

		elementos[0] = scan.nextInt();
		elementos[1] = scan.nextInt();
		elementos[2] = scan.nextInt();
		elementos[3] = scan.nextInt();
		elementos[4] = scan.nextInt();

		// saída

		System.out.println("Os valores são " + elementos[4] + ", " + elementos[3] + ", " + elementos[2] + ", " + elementos[1]
				+ ", " + elementos[0]);

	}

}
