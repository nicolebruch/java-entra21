package Exercício04;

// Crie uma classe chamada Circulo que tenha o atributo raio

// Calcule a área de 5 objetos diferentes de Circulo

// Para obter o valor de PI, use a função Math.PI do Java

public class circulo {

	double raio;

	public circulo(double raio) {
		setRaio(raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio >= 0) {
			this.raio = raio;
		} else {
			throw new IllegalArgumentException("Raio inválido.");
		}

		this.raio = raio;
	}

	public double circuloCalculo() {
		return Math.PI * (raio * raio);
	}

}
