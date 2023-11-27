package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício05 {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// array de 10 elementos
		// pedir ao usuário para informar um índice
		// imprima o valor que está no vetor conforme indice informado pelo usuario

		// entrada

		int[] elementos = { 0, 98, 74, 22, 6, 13, 16, 8, 10, 30 };

		// processo --> usuário diz um índice
		System.out.println("Informe um índice");
		int índice = scan.nextInt();

		// saída --> imprimir

		System.out.println(elementos[índice]);

	}

}
