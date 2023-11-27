package MATRIZES;

public class Exemplo01 {

	public static void main(String[] args) {

		//

		String[][] matriz = new String[3][2];

		// vetor [0] = teste

		matriz[0][0] = "Doritos";
		matriz[0][1] = "3";
		matriz[1][0] = "Chocolate";
		matriz[1][1] = "9";
		matriz[2][0] = "Sushi";
		matriz[2][1] = "7";

		System.out.println("Comida é " + matriz[1][0] + " e a quantidade de votos foi " + matriz[1][1]);

		System.out.println("Comida é " + matriz[2][0] + " e a quantidade de votos foi " + matriz[2][1]);
	}

}
