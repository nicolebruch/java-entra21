package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício06 {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Crie um array de elementos
		// peça ao usuário para informar um valor
		// verifique se este valor está presente no array
		// e como consequência, printe o índice.

		// entrada

		int[] elementos = new int[10];
		for (int índice = 0; índice < elementos.length; índice++) {
			System.out.println("Informe um valor");
			elementos[índice] = scan.nextInt();

		}

		System.out.println("Informe um valor para " + "ver se está presente");
		int variávelAuxiliar = scan.nextInt();

		boolean possuiElemento = false;
		for (int índice = 0; índice < elementos.length; índice++) {
			if (elementos[índice] == variávelAuxiliar) {
				System.out.println("índice: " + índice);

			}

		}

		if (possuiElemento == false) {
			System.out.println("Não existe esse elemento.");
		}

	}

}
