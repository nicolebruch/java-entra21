package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício08 {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Ler 12 valores reais
		// os coloque em um vetor de 12 posições do tipo real.
		// Imprima quais valores desses informados são maiores que a média dos valores.

		// entrada

		float[] valoresReais = new float[12];
		float soma = 0;

		// int índice = 0;
		for (int índice = 0; índice < valoresReais.length; índice++)
			;
		{
			System.out.println("Informe 12 números");
			int índice = 0;
			valoresReais[índice] = scan.nextFloat();
			soma = soma + valoresReais[índice];
		}

		float média = soma / valoresReais.length;

		String valoresMaioresQueAMédia = "";
		for (int índice = 0; índice < valoresReais.length; índice++) {

			// Maior que a média dos valores

			if (valoresReais[índice] > média) {
				valoresMaioresQueAMédia += valoresReais[índice] + ",";
			}
		}

		System.out.println("A média é: " + média);

	}

}
