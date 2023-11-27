package Exercício03;

public class produtoContinuação {

	public static void main(String[] args) {

//		A partir das representações abaixo dos objetos de uma classe Produto.
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

		produto um = new produto("Caderno", "Caderno em espiral tamanho médio", 4.50, 0.15);
		produto dois = new produto("Caneta ESF", "Caneta esferográfica 5mm", 1.20, 0.2);
		produto tres = new produto("Esquadro", "Esquadro de acrílico 20 cm", 2.35, 0.10);

		exibirInformacoesProduto(um);
		exibirInformacoesProduto(dois);
		exibirInformacoesProduto(tres);
	}

	private static void exibirInformacoesProduto(produto p) {
		System.out.println("Nome: " + p.getNome());
		System.out.println("Descrição: " + p.getDescricao());
		System.out.println("Preço Unitário: R$" + p.getPrecoUnitario());
		System.out.println("Desconto: " + (p.getDesconto() * 100) + "%");
		System.out.println();
	}
}