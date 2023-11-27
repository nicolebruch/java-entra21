package PercorrendoMatriz;

public class Exercício02 {

	public static void main(String[] args) {
		// Agora criem uma segunda linha
		// e novamente somem todas as colunas
		// por fim somem os valores da linha 0 e da linha 1

		// entrada

		int[][] matriz = new int[2][10];

		matriz[0][0] = 3;
		matriz[1][1] = 5;
		matriz[0][0] = 8;
		matriz[1][1] = 9;
		matriz[0][2] = 12;
		matriz[1][3] = 18;
		matriz[0][4] = 20;
		matriz[1][5] = 23;
		matriz[0][6] = 32;
		matriz[1][7] = 40;
		matriz[0][8] = 45;
		matriz[1][9] = 90;

		// variáveis
		double soma = 0;

		// processo

		for (int linha0 = 0; linha0 < matriz[0].length; linha0++) {
			soma = soma + matriz[0][linha0];

		}
		System.out.println("Soma da linha0 é de " + soma);
		for (int linha1 = 0; linha1 < matriz[1].length; linha1++) {
			soma = soma + matriz[1][linha1];
		}
		System.out.println("Soma da linha1 é " + soma);

		
	}

}
