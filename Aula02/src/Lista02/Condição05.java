package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condição05 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0");

	public static void main(String[] args) {

		// Dado dois valores
		// Verificar se o valor um é maior, menor ou igual ao valor dois

		// entrada

		System.out.println("Informe o valor 1.");
		final int num1 = entrada.nextInt();
		System.out.println("Informe o valor 2.");
		final int num2 = entrada.nextInt();

		// processo e saída - maior/menor/igual valor entre 1 e 2

		if (num1 > num2) {
			System.out.println("O maior número é o 1. ");
		} else if (num1 < num2) {
			System.out.println("O maior número é o 2. ");
		}
		if (num1 == num2) {
			System.out.println("Os valores são iguais. ");
		} else {

		}
	}
}
