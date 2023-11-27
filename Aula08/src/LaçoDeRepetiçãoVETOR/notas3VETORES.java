package LaçoDeRepetiçãoVETOR;

import java.text.DecimalFormat;
import java.util.Scanner;

public class notas3VETORES {

	static // importar
	Scanner scan = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {

		System.out.println("Informe 3 notas");
		double[] notas = new double[3];
		notas[0] = scan.nextDouble();
		notas[1] = scan.nextDouble();
		notas[2] = scan.nextDouble();

		double soma = notas[0] + notas[1] + notas[2];
		double media = soma / 3;
		System.out.println("A media das notas é " + media);
	}

}
