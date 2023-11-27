package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício03 {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// quem preenche os valores(String) do vetor é o usuário
		// por fim printe o vetor (vetor de 5 posições).

		// entrada

		String[] valores = new String[5];
		System.out.println("Informe 5 valores.");

		valores[0] = scan.next();
		valores[1] = scan.next();
		valores[2] = scan.next();
		valores[3] = scan.next();
		valores[4] = scan.next();

		for (int índice = (valores.length - 1); índice >= 0; índice--) {
			System.out.println(valores[índice]);

		}
	}
}
