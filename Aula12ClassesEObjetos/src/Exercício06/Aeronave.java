package Exercício06;

public class Aeronave {

	private int passageiros;
	private double velocidadeMaxima;
	private double capacidadeCombustivel;
	private String nome;

	public Aeronave(int passageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelMin,
			String nome) {
		super();
		setPassageiros(passageiros);
		setVelocidadeMaxima(velocidadeMaxima);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQueimaCombustivelMin(queimaCombustivelMin);
		setNome(nome);
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		if (velocidadeMaxima < 0) {
			System.out.println("Erro, número não pode ser negativo.");
		} else {
			this.velocidadeMaxima = velocidadeMaxima;
		}
	}

	public double TempoArCalculo() {
		return capacidadeCombustivel / queimaCombustivelMin;
	}

	public double distanciaMaximaCalculo() {
		return velocidadeMaxima * TempoArCalculo();

	}

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		if (capacidadeCombustivel < 0) {
			System.out.println("Erro, número não pode ser negativo.");
		} else {
			this.capacidadeCombustivel = capacidadeCombustivel;
		}
	}

	public double getQueimaCombustivelMin() {
		return queimaCombustivelMin;
	}

	public void setQueimaCombustivelMin(double queimaCombustivelMin) {
		if (queimaCombustivelMin < 0) {
			System.out.println("Erro, número não pode ser negativo.");
		} else {
			this.queimaCombustivelMin = queimaCombustivelMin;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private double queimaCombustivelMin;
}

//  Faça uma classe chamada Aeronave.
//Com os atributos:
//Passageiros.
//Velocidade máxima.
//Capacidade de combustível.
//Queima de combustível por minuto.

//Crie 4 objetos de sua preferência.

//Calcule:
//a) Qual das aeronaves pode ficar no ar por mais tempo?
//b) Qual aeronave leva o maior número de passageiros?
//c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?
