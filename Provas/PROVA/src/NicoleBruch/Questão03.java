package NicoleBruch;

import java.util.Scanner;

public class Questão03 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// O usuário leia altura de 10 pessoas diferentes
		// calcule a média.

		// entrada

		System.out.println("Informe a altura de 10 pessoas diferentes.");
		double altura1 = scan.nextDouble();
		double altura2 = scan.nextDouble();
		double altura3 = scan.nextDouble();
		double altura4 = scan.nextDouble();
		double altura5 = scan.nextDouble();
		double altura6 = scan.nextDouble();
		double altura7 = scan.nextDouble();
		double altura8 = scan.nextDouble();
		double altura9 = scan.nextDouble();
		double altura10 = scan.nextDouble();

		// processo

		double média = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6 + altura7 + altura8 + altura9
				+ altura10) / 10;

		// saída

		System.out.println("A média da altura de vocês é " + média);

	}

}
