package FUNÇÕES;

public class Exercício03 {

	public static int perimetro(int altura, int base) {
		return altura + altura + base + base;
	}

	public static int area(int altura, int base) {
		return altura * base;
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule o perímetro e a área de um retângulo.
		 * 
		 * Retornar os valores calculados
		 * 
		 * Separa em dois metodos e somente retornar os valores
		 */
		System.out.println(perimetro(10, 10));
		System.out.println(area(10, 10));
	}
}
