package trablivraria;

class CD extends ItemLivraria {
	private String artista;

	public CD(String titulo, String autor, double preco, String artista) {
		super(titulo, autor, preco);
		this.artista = artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		if (artista.isBlank() || artista == null) {
			throw new IllegalArgumentException("Nome do artista inválido");
		} else {
			this.artista = artista;
		}
	}

	@Override
	public double calcularDesconto() {

		return getPreco() * 0.05; // desconto de 5%
	}
}
