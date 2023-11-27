package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício03 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0"); 
			
	public static void main(String[] args) {

		// Ler dois valores de ponto flutuante
		// Calcular a média ponderada
		// Nota A = peso 3.5
		// Nota B = 6.5.

		// entrada

		System.out.println("Informe sua primeira nota");
		double NotaC = entrada.nextDouble();
		System.out.println("Informe sua segunda nota");
		double NotaD = entrada.nextDouble();
		double NotaA = 3.5f;
		double NotaB = 6.5f;

		// processo

		double média = (NotaC + NotaD + NotaA + NotaB) / 4;

		// saída

		System.err.println("A sua média ponderada é " + média);

	}

}
