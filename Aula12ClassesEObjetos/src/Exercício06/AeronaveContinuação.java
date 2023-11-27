package Exercício06;

public class AeronaveContinuação {

	public static void main(String[] args) {

		Aeronave um = new Aeronave(20, 200, 300, 3, "aeronave um");
		Aeronave dois = new Aeronave(100, 100, 400, 5, "aeronave dois");
		Aeronave tres = new Aeronave(50, 120, 200, 4, "aeronave tres");
		Aeronave quatro = new Aeronave(30, 170, 150, 2, "aeronave quatro");

		Aeronave vetor[] = new Aeronave[4];
		vetor[0] = um;
		vetor[1] = dois;
		vetor[2] = tres;
		vetor[3] = quatro;

		// variaveisAuxiliares

		double tempoArMaior = Double.MIN_VALUE;
		int maiorNumPassageiros = Integer.MIN_VALUE;
		double vooLonge = 0;
		String nomeTempoAr = "";
		String nomeMaisPassageiros = "";
		String nomeMaisLongo = "";

		// a) Qual das aeronaves pode ficar no ar por mais tempo?

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].TempoArCalculo() > tempoArMaior) {
				tempoArMaior = vetor[i].TempoArCalculo();
				nomeTempoAr = vetor[i].getNome();
			}

			// b) Qual aeronave leva o maior número de passageiros?

			if (vetor[i].getPassageiros() > maiorNumPassageiros) {
				maiorNumPassageiros = vetor[i].getPassageiros();
				nomeMaisPassageiros = vetor[i].getNome();

			}

			// c) Considerando que os aviões estão em velocidade máxima, qual deles consegue
			// voar mais longe?
			if (vetor[i].distanciaMaximaCalculo() > vooLonge) {
				vooLonge = vetor[i].distanciaMaximaCalculo();
				nomeMaisLongo = vetor[i].getNome();
			}
		}

		System.out.println("O avião que mais fica no ar é a " + nomeTempoAr);
		System.out.println("O avião com mais espaço é a: " + nomeMaisPassageiros);
		System.out.println("O avião que vai mais longe é a: " + nomeMaisLongo);

	}
}

// Faça uma classe chamada Aeronave.
// Com os atributos:
// Passageiros. 
// Velocidade máxima.
// Capacidade de combustível.
// Queima de combustível por minuto.

// Crie 4 objetos de sua preferência.

// Calcule:
// a) Qual das aeronaves pode ficar no ar por mais tempo?
// b) Qual aeronave leva o maior número de passageiros?
// c) Considerando que os aviões estão em velocidade máxima, qual deles consegue
// voar mais longe?
