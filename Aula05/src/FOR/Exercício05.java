package FOR;

import java.util.Scanner;

public class Exercício05 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Ler um valor inteiro (aceitar somente valores entre 1 e 10)
		// Escrever a tabuada de 1 a 10 do valor lido.

		// entrada

		System.out.println("Informe um valor");
		int num = scan.nextInt();
		int aux = 0;
		int op = 0;
		// Para o for
		int i = 0;
		if (num < 1 || num > 10) {
			System.out.println("Valor inválido");
			i = 11;
		}
		for (; i <= 10; i++) {
			op = num * i;
			System.out.println(op);
		}

	}

}
