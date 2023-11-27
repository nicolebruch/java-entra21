package LaçoDeRepetição;

import java.util.Scanner;

public class Exercício04 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Algoritmo que vá lendo a altura de pessoas até o usuário entrar com o número
		// 0
		// Calcule a média de altura das mesmas.

		// entrada

		System.out.println("Pedindo alturas");
		double altura = scan.nextDouble();

		// auxiliares

		double soma = 0;
		int QuantidadeDePessoas = 0; // contador
		while (altura != 0) {
			soma = soma + altura;
			QuantidadeDePessoas++;
			System.out.println("Pedindo altura");
			altura = scan.nextDouble();

			// A PERGUNTA DEVE SER FEITA NO FINAL PARA NÃO RODAR INIFINITAMENTE A PERGUNTA

		}

		// média

		double media = soma / QuantidadeDePessoas;

		System.out.println("A média da altura é " + media);

	}

}
