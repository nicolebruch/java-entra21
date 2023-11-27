package trablivraria;

// classe principal 
public class Principal {
	public static void main(String[] args) {
		Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 50.0, 1000);
		CD cd = new CD("Greatest Hits", "Queen", 20.0, "Queen");

		System.out.println("Detalhes do Livro:");
		exibirDetalhesItem(livro);

		System.out.println("\nDetalhes do CD:");
		exibirDetalhesItem(cd);
	}

	// metodo p/ exibir detalhes do item da livraria
	private static void exibirDetalhesItem(ItemLivraria item) {
		System.out.println("Título: " + item.getTitulo());
		System.out.println("Autor/Artista: " + item.getAutor());
		System.out.println("Preço: $" + item.getPreco());
		System.out.println("Desconto: $" + item.calcularDesconto());
	}
}
