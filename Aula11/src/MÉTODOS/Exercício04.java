package MÉTODOS;

import java.util.Scanner;

public class Exercício04 {

	static Scanner scan = new Scanner(System.in);

	// Faça um método para cada um dos seus seus colegas
	// O método deve printar:
	// O nome dele(a) é [nome]
	// Ele(a) tem [idade] anos
	// Ele(a) é estudante do Entra 21
	// (Em prints separados)

	// Os dados devem ser passados como parametros
	// O método pode ser chamado mais de uma vez

	public static void colega1(String nome1, int idade1, boolean texto) {

		System.out.println("Nome " + nome1);
		System.out.println("Idade: " + idade1);
		if (texto) {
			System.out.println("É um estudante do ENTRA21");
		} else {
			System.out.println("Não é um estudante do ENTRA21");
		}
	}

	public static void colega2(String nome2, int idade2, boolean texto) {

		System.out.println("Nome " + nome2);
		System.out.println("Idade: " + idade2);

		if (texto) {
			System.out.println("É um estudante do ENTRA21");
		} else {
			System.out.println("Não é um estudante do ENTRA21");
		}
	}

	public static void colega3(String nome3, int idade3, boolean texto) {

		System.out.println("Nome " + nome3);
		System.out.println("Idade: " + idade3);

		if (texto) {
			System.out.println("É um estudante do ENTRA21");
		} else {
			System.out.println("Não é um estudante do ENTRA21");
		}
	}

	public static void main(String[] args) {

		String nome1 = "Duda";
		int idade1 = 17;
		colega1(nome1, idade1, true);

		String nome2 = "Sara";
		int idade2 = 19;
		colega2(nome2, idade2, true);

		String nome3 = "Trixx";
		int idade3 = 17;

		colega3(nome3, idade3, true);

	}

}
