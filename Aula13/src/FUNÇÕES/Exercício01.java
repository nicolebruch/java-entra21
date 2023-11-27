package FUNÇÕES;

import java.util.Scanner;

public class Exercício01 {

	

//	Faça um programa que diz se um número inserido está dentro de um limite imposto pelo usuário

//	Por exemplo:

//	Usuário inseriu o limite máximo como 100.
//	Usuário inseriu o limite mínimo como 70.

//	Depois ele inseriu o número 80.

//	A saída deve ser: 80 está nos limites impostos.

	public static int limite(int numero) {
		if (numero > 100 && numero < 70) {
			System.out.println(numero + "Não está nos limites impostos pelo usuário");
		} else {
			System.out.println(numero + " está nos limites impostos pelo usuário");
		}
		int limite = numero;
		return limite;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o seu limite atingido");
		int numero = scan.nextInt();
		System.out.println(limite(numero));

	}
}

//ESSE EXERCÍCIO O USUÁRIO NÃO INFORMOU OS VALORES LIMITES, JÁ DEU VALORES FIXOS (70 & 100)