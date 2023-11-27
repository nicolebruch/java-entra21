package NicoleBruch;

import java.util.Scanner;

public class Questão02 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// usuário informa os dados dos lados de um triangulo
		// retorne se ele é isóscele, escaleno ou equilátero.

		// entrada

		System.out.println("Informe os dados de um triângulo");
		int ladoUm = scan.nextInt();
		int ladoDois = scan.nextInt();
		int ladoTres = scan.nextInt();

		// equilátero = Todos os dados iguais
		// isóceles = Dois lados
		// Escaleno = Nenhum lado

		if (ladoUm == ladoDois && ladoDois == ladoTres) {
			System.out.println("Equilátero");
		} else if (ladoUm == ladoDois || ladoDois == ladoTres || ladoTres == ladoUm) { // Entra neste else if pois todos
																						// os lados NÃO são iguais
			System.out.println("Isóceles");
		} else {
			System.out.println("Escaleno");
		}

	}

}
