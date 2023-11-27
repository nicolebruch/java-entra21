package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício09 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {

		// Ler três valores com ponto flutuante de dupla precisão: A, B e C.
		// Calcule:
		// a) a área do triângulo retângulo que tem A por base e C por altura.
		// b) a área do círculo de raio C. (pi = 3.14159).
		// c) a área do trapézio que tem A e B por bases e C por altura.
		// d) a área do quadrado que tem lado B.
		// e) a área do retângulo que tem lados A e B.

		// entrada

		System.out.println("Informe o valor de A.");
		double ValorA = entrada.nextDouble();
		System.out.println("Informe o valor de B.");
		double ValorB = entrada.nextDouble();
		System.out.println("Informe o valor de C.");
		double ValorC = entrada.nextDouble();
		double pi = 3.14159;

		// processo

		double triângulo = (ValorA * ValorC) / 2;
		double círculo = (ValorC * ValorC) * pi;
		double trapézio = ((ValorA + ValorB) * ValorC) / 2;
		double quadrado = (ValorB * ValorB);
		double retângulo = (ValorA * ValorB);

		// saída

		System.out.println("O valor da área do triângulo retângulo é " + triângulo);
		System.out.println("O valor da área do círculo é " + círculo);
		System.out.println("O valor da área do trapézio é " + trapézio);
		System.out.println("O valor da área do quadrado é " + quadrado);
		System.out.println("O valor da área do retângulo é " + retângulo);

	}

}
