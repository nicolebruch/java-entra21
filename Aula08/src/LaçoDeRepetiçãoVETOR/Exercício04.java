package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício04 {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Crie uma array de 5 elementos e descubra:

		// a) Qual o maior elemento

		// b) Qual o menor elemento

		// c) A média dos elementos

		// entrada

		double[] elementos = new double[5];

		// váriavel auxiliar

		double maiorValor = Double.MIN_VALUE;
		double menorValor = Double.MAX_VALUE;
		double soma = 0;

		// processo

		for (int índice = 0; índice < elementos.length; índice++) {
			System.out.println("Informe 5 elementos");
			elementos[índice] = scan.nextDouble();
			soma = soma + elementos[índice];

			if (elementos[índice] > maiorValor) {
				maiorValor = elementos[índice];

			}

			if (elementos[índice] < menorValor) {
				menorValor = elementos[índice];

			}

		}
			System.out.println("O valor menor é: " + menorValor);
			System.out.println("O valor maior é: " + maiorValor);
			System.out.println("A média é " + (soma / elementos.length));
		}

	}


