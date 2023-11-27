package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício04 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {

		// Ler valor da sua altura
		// Ler valor de seu amigo e
		// Calcular a média

		// entrada

		System.out.println("Informe o seu nome");
		String name1 = entrada.next();
		System.out.println("Informe a sua altura");
		double altura1 = entrada.nextDouble();
		System.out.println("Informe o nome do seu amigo(a)");
		String name2 = entrada.next();
		System.out.println("Informe a altura do seu amigo(a)");
		double altura2 = entrada.nextDouble();

		// processo

		double média = (altura1 + altura2) / 2;

		// saída

		System.out.println("A média da altura de vocês é " + média);

	}

}
