package MÉTODOS;

import java.util.Scanner;

public class Exercício02 {

	static Scanner scan = new Scanner(System.in);

	// usuário entre com um número de 1 a 4
	// número 1 sendo verão
	// 2 sendo outono...
	// Dependendo de o que o usuário informa, printe:

	// É verão
	// E o tempo está quente

	// Ou

	// É inverno
	// E está frio

	public static void estações(int opções) {

		switch (opções) {
		case 1:
			System.out.println("É verão e o tempo está quente");
			break;

		case 2:
			System.out.println("É outono e está fresco");
			break;
		case 3:
			System.out.println("É inverno e está frio");
			break;
		case 4:
			System.out.println("É primavera e estou com rinite");
			break;
		default:
			System.out.println("Número inválido");
			break;
		}
	}

	public static void main(String[] args) {

		System.out.println("Informe 1 para verão, 2 para outono, 3 para inverno e 4 para primavera");
		int numbEstações = scan.nextInt();

		estações(numbEstações);
	}

}
