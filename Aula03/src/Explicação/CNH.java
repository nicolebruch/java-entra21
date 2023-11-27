package Explicação;

import java.util.Scanner;

public class CNH {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Se é possível ter uma CNH
		// É preciso ter mais de 18 anos
		// Ser brasileiro

		// entrada 

		System.out.println("Informe a sua idade");
		int idade = scan.nextInt();

		System.out.println("Informe sua nacionalidade");
		String nacionalidade = scan.next();

		boolean permissãoJudicial = false;

		// processo e saída

		if (permissãoJudicial == true || idade >= 18 && nacionalidade.equals("brasileiro")) {
			System.out.println("É possível ter CNH!");

		} else {
			System.out.println("Não é possível ter CNH.");
		}
	}
}