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

public class ContribuinteContinuação {

	public static void main(String[] args) {

		Contribuinte[] contribuintes = new Contribuinte[5];

		contribuintes[0] = new Contribuinte("João da Silva", "123.456.789-00", "PR", 40000);
		contribuintes[1] = new Contribuinte("Maria Oliveira", "987.654.321-00", "SC", 8000);
		contribuintes[2] = new Contribuinte("Carlos Souza", "111.222.333-44", "RS", 12000);
		contribuintes[3] = new Contribuinte("Ana Pereira", "555.666.777-88", "SC", 30000);
		contribuintes[4] = new Contribuinte("Lucas Santos", "999.888.777-66", "RS", 45000);

		// VariavelAuxiliar
		Contribuinte maisPaga = null;
		Contribuinte menosPaga = null;
		double totalImposto = 0;

		for (Contribuinte contribuinte : contribuintes) {
			double imposto = contribuinte.calcularImposto();
			totalImposto += imposto;

			if (maisPaga == null || imposto > maisPaga.calcularImposto()) {
				maisPaga = contribuinte;
			}

			if (menosPaga == null || imposto < menosPaga.calcularImposto()) {
				menosPaga = contribuinte;
			}
		}

		System.out.println("Quem mais paga imposto: " + maisPaga.getNome());
		System.out.println("Quem menos paga imposto: " + menosPaga.getNome());
		System.out.println("Total de imposto pago entre os 5 contribuintes: " + totalImposto);
	}

}
