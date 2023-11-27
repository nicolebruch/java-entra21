package MATRIZES;

import java.util.Scanner;

public class ExercícioEXEMPLO {

	static // importar
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		// Montar tabela com 2 colunas e 3 linhas
		// altura e número da sorte

		// entrada

		double matriz[][] = new double[3][2];

		matriz[0][0] = 1.55;

		matriz[0][1] = 17;

		matriz[1][0] = 1.68;

		matriz[1][1] = 12;

		matriz[2][0] = 1.65;

		matriz[2][1] = 16;
		
		//variável
		double média = 0;

		System.out.println("A altura da Duda é de " + matriz[0][0] + ", seu número da sorte é de " + matriz[0][1]);
		System.out.println("A altura da Nicole é de " + matriz[1][0] + ", seu número da sorte é de " + matriz[1][1]);
		System.out.println("A altura da Sara é de " + matriz[2][0] + ", seu número da sorte é de " + matriz[2][1]);
		
		média = (matriz[0][0] + matriz[1][0] + matriz[2][0]) / 3;
		System.out.println("A média das alturas é de " + média);
	}

}
