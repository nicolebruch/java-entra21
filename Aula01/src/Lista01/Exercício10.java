package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício10 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0");

	public static void main(String[] args) {

		// Dois carros (X e Y) partem em uma mesma direção
		// Carro X = velocidade constante de 60 Km/h
		// Carro Y = velocidade constante de 90 Km/h
		// 1hora --> Carro Y se distancia 30km do Carro X
		// Carro Y = se afasta 1km a cada 2 minutos.
		// Leia a distância (em Km)
		// Calcular o tempo (em minutos)
		// para Carro Y chegar no Carro X

		// entrada

		System.out.println("Qual é a distância dos carros? (em Km)");
		int distância = entrada.nextInt();
		final int carroX = 60;
		final int carroY = 90;

		// processo

		float tempo = (carroX * distância) / 30;

		// saída

		System.out.println("O tempo para o carro Y alcançar o carro X é de " + tempo + " minutos.");

	}

}
