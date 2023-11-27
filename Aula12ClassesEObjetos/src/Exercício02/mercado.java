package Exercício02;

public class mercado {

	private int numAppleYear;
	private double coastApple;
	private int numOrangeYear;
	private double coastOrange;

	public mercado(int numAppleYear, double coastApple, int numOrangeYear, double coastOrange) {

		this.numAppleYear = numAppleYear;
		this.coastApple = coastApple;
		this.numOrangeYear = numOrangeYear;
		this.coastOrange = coastOrange;
	}

	public int getNumAppleYear() {
		return numAppleYear;
	}

	public void setNumAppleYear(int numAppleYear) {
		if (numAppleYear < 0) {
			System.out.println("Erro, número não pode ser negativo.");
		} else {
			this.numAppleYear = numAppleYear;
		}
	}

	public double getCoastApple() {
		return coastApple;
	}

	public void setCoastApple(double coastApple) {
		this.coastApple = coastApple;
	}

	public int getNumOrangeYear() {
		return numOrangeYear;
	}

	public void setNumOrangeYear(int numOrangeYear) {
		if (numOrangeYear < 0) {
			System.out.println("Erro, número não pode ser negativo.");
			this.numOrangeYear = numOrangeYear;
		}
	}

	public double getCoastOrange() {
		return coastOrange;
	}

	public void setCoastOrange(double coastOrange) {
		this.coastOrange = coastOrange;
	}

	public double lucroMaçã() {
		return numAppleYear * coastApple;
	}

	public double lucroLaranjas() {
		return numOrangeYear * coastOrange;
	}

	public double somaFrutas() {
		return lucroMaçã() + lucroLaranjas();
	}

//	Crie uma classe denominada Mercado.
//
//	Essa classe terá 4 atributos, as informações que deverão ser guardadas são:
//	Número de maçãs vendidas por ano.
//	Preço de venda das maçãs.
//	Número de laranjas vendidas por ano.
//	Preço de venda das laranjas.
//
//	Crie 3 objetos da classe Mercado chamados:
//
//	unidadeDeBlumenau
//	unidadeDeJoinville
//	unidadeDeFlorianopolis

}
