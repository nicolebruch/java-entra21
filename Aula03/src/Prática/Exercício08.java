package Prática;

import java.util.Scanner;

public class Exercício08 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Faça uma calculadora.
		// O usuário entra com dois números e depois com a operaçao desejada.
		// Caso o número da operação seja 1: some os dois números.
		// Caso seja 2: subtraia os dois números.
		// Caso seja 3: multiplique os dois números.
		// Caso seja 4: divida os dois números.

		// entrada - 2 números - operação

		System.out.println("Informe um número.");
		double num1 = scan.nextDouble();
		System.out.println("Informe outro número.");
		double num2 = scan.nextDouble();
		System.out.println("Informe o tipo de operação.");

		int operação = scan.nextInt();

		// variável auxiliar ou temporária

		double variávelAuxiliar = 0;

		// processo

		if (operação == 1) {
			variávelAuxiliar = num1 + num2;
		} else if (operação == 2) {
			variávelAuxiliar = num1 - num2;
		} else if (operação == 3) {
			variávelAuxiliar = num1 * num2;
		} else if (operação == 4) {
			variávelAuxiliar = num1 / num2;
		} else {
			System.out.println("Valor inválido");
		}

		// saída
		System.out.println("O resultado é " + variávelAuxiliar);
	}

}