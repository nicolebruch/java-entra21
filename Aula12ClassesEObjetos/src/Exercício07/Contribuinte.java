package Exercício07;

//Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS, PR e SC) e RENDA ANUAL.
//EX:
//Nome: João da Silva
//CPF: 123.456.789-00
//UF: PR
//RendaAnual: R$40.000

//Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:

//Nível de Renda Anual     Alíquota
//0 a 4.000                  0%
//4.001 a 9.000              5,8%
//9.001 a 25.000             15%
//25.001 a 35.000            27,5%
//acima de 35.000            30%

//Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
//Imposto a pagar = Renda Anual * Alíquota

//Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.

//Calcule:
//a) Quem mais paga imposto.
//b) Quem menos paga imposto.
//c) Qual o total de imposto pago entre os 5 contribuintes?

public class Contribuinte {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido.");
		}
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null || cpf.isBlank()) {
			throw new IllegalArgumentException("CPF inválido.");
		}
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf.equalsIgnoreCase("RS") || uf.equalsIgnoreCase("SC") || uf.equalsIgnoreCase("PR")) {
			this.uf = uf;
		} else {
			throw new IllegalArgumentException("UF inválida.");
		}
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			throw new IllegalArgumentException("Renda anual inválida.");
		}
		this.rendaAnual = rendaAnual;
	}

	// calcular o imposto p/ pagar
	public double calcularImposto() {
		if (rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual <= 9000) {
			return rendaAnual * 0.058;
		} else if (rendaAnual <= 25000) {
			return rendaAnual * 0.15;
		} else if (rendaAnual <= 35000) {
			return rendaAnual * 0.275;
		} else {
			return rendaAnual * 0.3;
		}
	}
}
