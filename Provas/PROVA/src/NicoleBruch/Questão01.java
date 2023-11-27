package NicoleBruch;

import java.util.Scanner;

public class Questão01 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Programa onde o usuário informa um valor e a opção desejada do que deve ser
		// feito com o valor,
		// opções 1-converter de dólar para real
		// opções 2-converter de real para dólar
		// qualquer outra opção é considerada entrada inválida.

		// entrada

		System.out.println("Informe o valor para a conversão.");
		double valor = scan.nextDouble();
		double real = 1;
		double dollar = 4.97;

		System.out.println("Digite 1 para converter o dóllar em real, ou digite 2 para conversão de real para dóllar.");
		int operação = scan.nextInt();

		// auxiliar
		double auxiliar = 0;

		// processo

		double conversão = dollar * real;

		switch (operação) {
		case 1:
			auxiliar = valor / real;
			System.out.println("Convertido para Real");
			break;
		case 2:
			auxiliar = dollar * valor;
			System.out.println("Convertido para Dollar");
			break;
		default:
			System.out.println("Opção inválida.");
			break;

		// saída

		}
		System.out.println("A conversão feita é de " + auxiliar);

	}

}
