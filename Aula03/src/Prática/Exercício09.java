package Prática;

import java.util.Scanner;

public class Exercício09 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Escreva um algoritmo em que o usuário entra com um número.
		// Ele escolhe a operação que vai ser feita com esse número
		// Caso ele escolha a operação 1
		// Modifique a variável do número entrado e some 10 ao número original
		// Caso ele escolha a operação 2
		// Modifique a variável do número entrado e subtraia 10 do número original
		// Caso ele escolha a operação 3
		// Modifique a variável do número entrado e multiplique 10 ao número original
		// Caso ele escolha a operação 4
		// Modifique a variável do número entrado e divida 10 do número original

		// entrada

		System.out.println("Informe um número");
		double num1 = scan.nextDouble();
		System.out.println("Escolha uma das 4 operações");
		double num2 = 10;
		int operação = scan.nextInt();

		// variável auxiliar ou temporária

		double variávelAuxiliar = 0;
		boolean válida = true;

		// processo com Switch

		switch (operação) {
		case 1:
			variávelAuxiliar = num1 + num2;
			break;

		case 2:
			variávelAuxiliar = num1 - num2;
			break;

		case 3:
			variávelAuxiliar = num1 * num2;
			break;

		case 4:
			variávelAuxiliar = num1 / num2;
			break;

		default:
			válida = false;
			System.out.println("Valor inválido.");
			break;
		}

		if (válida == true) {

			// saída
			System.out.println("O resultado é " + variávelAuxiliar);

		}
	}
}