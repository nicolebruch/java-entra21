package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício05 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {

		// Ler quatro valores inteiros A, B, C e D.
		// Calcule e mostre diferença do produto de A e B pelo produto de C e D

		// entrada

		System.out.println("Informe o valor de A");
		int ValorA = entrada.nextInt();
		System.out.println("Informe o valor de B");
		int ValorB = entrada.nextInt();
		System.out.println("Informe o valor de C");
		int ValorC = entrada.nextInt();
		System.out.println("Informe o valor de D");
		int ValorD = entrada.nextInt();

		// processo

		int AB = ValorA * ValorB;
		int CD = ValorC * ValorD;
		int diferença = AB - CD;

		// saída

		System.out.println("A diferença é " + diferença);

	}

}
