package Exercício03;

//		// A partir das representações abaixo dos objetos de uma classe Produto.
//		Escreva o código necessário para suportar tais objetos.
//		Ou seja, o código necessário para criar a classe e instanciar os objetos de modo que fiquem com o estado apresentado.
//
//		produto1: Produto
//		nome = “Caderno”
//		descricao = “Caderno em espiral tamanho médio”
//		precoUnitario = 4,50
//		desconto = 15
//
//
//		produto2: Produto
//		nome = “Caneta ESF”
//		descricao = “Caneta esferográfica 5mm”
//		precoUnitario = 1,20
//		desconto = 2
//
//
//		produto3: Produto 
//		nome = “Esquadro”
//		descricao = “Esquadro de acrílico 20 cm”
//		precoUnitario = 2,35
//		desconto = 10

public class produto {

	String nome;
	String descricao;
	double precoUnitario;
	double desconto;

	public produto(String nome, String descricao, double precoUnitario, double desconto) {
		setNome(nome);
		setDescricao(descricao);
		setPrecoUnitario(precoUnitario);
		setDesconto(desconto);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank() || nome == null) {
			throw new IllegalArgumentException("Nome inválido");
		} else {
			this.nome = nome;
		}

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.isBlank() || descricao == null) {
			throw new IllegalArgumentException("Descrição inválida");
		} else {
			this.descricao = descricao;
		}

	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		if (precoUnitario >= 0) {
			this.precoUnitario = precoUnitario;
		} else {
			System.out.println("Preço unitário não pode ser negativo.");
		}
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		if (desconto >= 0 && desconto <= 1) {
			this.desconto = desconto;
		} else {
			System.out.println("Desconto deve estar entre 0 e 1.");
		}
	}
}
