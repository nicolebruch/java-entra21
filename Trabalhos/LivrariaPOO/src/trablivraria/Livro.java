package trablivraria;

class Livro extends ItemLivraria {
	private int numeroPaginas;

	public Livro(String titulo, String autor, double preco, int numeroPaginas) {
		super(titulo, autor, preco);
		this.numeroPaginas = numeroPaginas;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		if (numeroPaginas >= 0) {
			this.numeroPaginas = numeroPaginas;
		} else {
			throw new IllegalArgumentException("Número de páginas inválido.");
		}

		this.numeroPaginas = numeroPaginas;

	}

	@Override
	public double calcularDesconto() {
		// calcula desconto p/livros
		return getPreco() * 0.1; // desconto de 10%
	}
}
