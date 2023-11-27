package trablivraria;

abstract class ItemLivraria {
	private String titulo;
	private String autor;
	private double preco;

	public ItemLivraria(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.isBlank() || titulo == null) {
			throw new IllegalArgumentException("Título inválido");
		} else {
			this.titulo = titulo;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.isBlank() || autor == null) {
			throw new IllegalArgumentException("Autor inválido");
		} else {
			this.autor = autor;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
		} else {
			throw new IllegalArgumentException("Preço inválido.");
		}

		this.preco = preco;
	}

	// metodo abstrato p/ calcular desconto
	public abstract double calcularDesconto();
}
