package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício01 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0");

	public static void main(String[] args) {

		// Ler 2 valores inteiros
		// imprimair sua soma e multiplicação.

		// entrada

		System.out.println("Informe um número");
		int num1 = entrada.nextInt();
		System.out.println("Informe outro número");
		int num2 = entrada.nextInt();

		// processo

		int multiplicação = num1 * num2;
		int soma = num1 + num2;

		// saída

		System.out.println("A soma dos números é igual a " + soma);
		System.out.println("A multiplicação dos números é igual a " + multiplicação);

	}

}
