package LaçoDeRepetição;

import java.util.Scanner;

public class Exercício01 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Faça uma calculadora.
		// O usuário entra com dois números e depois com a operação desejada.
		// Caso o número da operação seja 1: some os dois números.
		// Caso seja 2: subtraia os dois números.
		// Caso seja 3: multiplique os dois números.
		// Caso seja 4: divida os dois números.
		// Solicite ao usuário se deseja continuar realizando operações (sempre com dois
		// novos valores)
		// Digite qualquer tecla e caso queira encerrar informe a letra ‘n’.

		// entrada

		double num1 = 0;
		double num2 = 0;

		System.out.println("Informe um número");
		num1 = scan.nextDouble();
		System.out.println("Informe outro número");
		num2 = scan.nextDouble();

		System.out.println("Informe o tipo de operação.");
		int operação = scan.nextInt();
		System.out.println("Insira a opção.");
		char opção = scan.next().charAt(0);

			// auxiliares

			double Auxiliar = 0;

			// processo

			while (opção != 'n') {
				
			switch (operação) {
			case 1:
				Auxiliar = num1 + num2;
				break;
			case 2:
				Auxiliar = num1 - num2;
				break;
			case 3:
				Auxiliar = num1 * num2;
				break;
			case 4:
				Auxiliar = num1 / num2;
				break;
			default:
				System.out.println("Operação inválida.");
				break;
			}

			// saída

			System.out.println("O resultado é " + Auxiliar);
			System.out.println("Caso queira continuar, digite qualquer letra, exceto 'n");
			opção = scan.next().charAt(0);

			System.out.println("Digite 'n' para finalizar");
			System.out.println("Fim");
		}
	}
}
