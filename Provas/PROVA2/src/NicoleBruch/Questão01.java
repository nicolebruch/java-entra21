package NicoleBruch;

public class Questão01 {

	public static void main(String[] args) {

		// Questão 1)
		// Crie um programa para encontrar o maior número que pode ser criado
		// reordenando o
		// vetor.
		// Por exemplo:
		// {1, 2, 3, 0, 4, 6}
		// Deverá ter a saída: 643210

		// e o vetor não possui números negativos

		// entrada

		int[] elementos = { 1, 2, 3, 0, 4, 6 };

		// 5,4,2,1,0,3

		// processo e saída

		System.out.println(elementos[5] + "" + elementos[4] + "" + elementos[2] + "" + elementos[1] + "" + elementos[0]
				+ "" + elementos[3]);

	}

}
