package Explicação;

import java.util.Scanner;

public class ExemploSwitch {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Caso tenha uma escola de fundamental II, e queira separa alunos por sala

		// entrada

		System.out.println("Informe o número da sua sala.");
		int salaAluno = scan.nextInt();

		// processo

		if (salaAluno == 6) {
			System.out.println("Sexto ano");
		} else if (salaAluno == 7) {
			System.out.println("Sétimo ano");
		} else if (salaAluno == 8) {
			System.out.println("Oitavo ano");
		} else if (salaAluno == 9) {
			System.out.println("Nono ano");
		}

		// saída

		switch (salaAluno) {
		case 6:
			System.out.println("Sexto ano");
			break;
		case 7:
			System.out.println("Sétimo ano");
			break;
		case 8:
			System.out.println("Oitavo ano");
			break;
		case 9:
			System.out.println("Nono ano");
			break;

		}

	}

}