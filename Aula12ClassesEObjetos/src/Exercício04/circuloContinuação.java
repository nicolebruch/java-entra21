package Exercício04;

// Crie uma classe chamada Circulo que tenha o atributo raio

//Calcule a área de 5 objetos diferentes de Circulo

//Para obter o valor de PI, use a função Math.PI do Java

public class circuloContinuação {

	public static void main(String[] args) {

		circulo area1 = new circulo(5);
		circulo area2 = new circulo(10);
		circulo area3 = new circulo(30);
		circulo area4 = new circulo(22);
		circulo area5 = new circulo(55);

		System.out.println("Círculo 1: " + area1.circuloCalculo());
		System.out.println("Círculo 2: " + area2.circuloCalculo());
		System.out.println("Círculo 3: " + area3.circuloCalculo());
		System.out.println("Círculo 4: " + area4.circuloCalculo());
		System.out.println("Círculo 5: " + area5.circuloCalculo());
	}
}