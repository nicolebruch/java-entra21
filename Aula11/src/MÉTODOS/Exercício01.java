package MÉTODOS;

public class Exercício01 {

	public static void main(String[] args) {

		Informações();
		conta();
		soma();
		multiplicação();
		médiaAltura();

	}
	// a) Criar um método para imprimir seu nome, idade e cor favorita

	public static void Informações() {
		System.out.println("Meu nome é Nicole" + ", tenho 16 e" + " minha cor favorita é Azul");

	}

	// b) Criar um método com 2 variáveis com os valores 10 e 100
	// Imprima a multiplicação e soma.

	public static void conta() {
		int num1 = 10;
		int num2 = 100;

		System.out.println("A Soma é: " + (num1 + num2));
		System.out.println("A multiplicação é: " + (num1 * num2));
	}

	// c) Utilize o metodo conta(), já criado
	// quebre o mesmo em dois metodos:
	// soma() e multiplicacao()
	// os nomes das variaveis deve ser igual

	public static void soma() {
		int num1 = 10;
		int num2 = 100;

		System.out.println("A Soma é: " + (num1 + num2));

	}

	public static void multiplicação() {
		int num1 = 10;
		int num2 = 100;

		System.out.println("A multiplicação é: " + (num1 * num2));

	}

	// d) Crie mais um metodo
	// utilize os dados de altura
	// de dois amigos
	// imprima a média e os nomes

	public static void médiaAltura() {
		double h1 = 1.52;
		double h2 = 1.65;
		double h3 = 1.85;

		double média = (h1 + h2 + h3) / 3;

		System.out.println("A média da altura de Duda, Sara e Fernando é " + média);

	}

}
