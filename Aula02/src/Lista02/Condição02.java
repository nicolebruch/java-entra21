package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condição02 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0");

	public static void main(String[] args) {

		// Dado dois valores inteiros
		// Escrever um algoritmo que informe se eles são múltiplos ou não.

		// entrada

		System.out.println("Informe o valor 1.");
		final int num1 = entrada.nextInt();
		System.out.println("Informe o valor 2.");
		final int num2 = entrada.nextInt();

		// processo e saída - se são divisíveis ou não

		if (num1 % num2 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}

	}

}
