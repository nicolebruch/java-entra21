package Exercício05;

public class PrincipalLojaMateriaisConstrução {

	public static void main(String[] args) {

		/*
		 * Calcule: a) Qual o nome do material mais caro b) Qual o nome do material mais
		 * leve c) Quanto que pesa a quantidade total do produto mais caro, ou seja, a
		 * quantidade multiplicado pelo peso
		 */

		LojaMateriaisConstrução m1 = new LojaMateriaisConstrução("saco com pregos",
				"uma haste de metal, com uma das pontas afiada e com outra achatada, 10 und", 5.00, 0.020, 50);
		LojaMateriaisConstrução m2 = new LojaMateriaisConstrução("pincel", "achatado, cerdas pretas e macias", 19.99,
				0.350, 34);
		LojaMateriaisConstrução m3 = new LojaMateriaisConstrução("martelo", "ponta achatada de metal e cabo de madeira",
				38.75, 1.0, 108);
		LojaMateriaisConstrução m4 = new LojaMateriaisConstrução("saco de cimento",
				"alta qualidade, forte e resistente", 68.50, 25.5, 71);
		LojaMateriaisConstrução m5 = new LojaMateriaisConstrução("tijolo 10 un",
				"feito de barro vermelho, dimensoes 5x22x10 cm", 10.99, 30.0, 89);

		m3.setDesconto(0.10);

		double maiorValor = Integer.MIN_VALUE;
		double maisLeve = Integer.MAX_VALUE;
		double materialCaroPeso = 0;
		double caroPeso = 0;
		LojaMateriaisConstrução produtoCaro = null;
		LojaMateriaisConstrução produtoLeve = null;

		for (LojaMateriaisConstrução m : LojaMateriaisConstrução.listaMateriais) {
			if (m.getPreco() > maiorValor) {
				maiorValor = m.getPreco();
				produtoCaro = m;
				materialCaroPeso = m.getPeso();
			}

			if (m.getPeso() < maisLeve) {
				maisLeve = m.getPeso();
				produtoLeve = m;
			}

			caroPeso = materialCaroPeso * m.getEstoque();
		}

		System.out.println("Material mais caro: " + produtoCaro.toString());
		System.out.println("Material mais leve: " + produtoLeve.toString());
		System.out.println("Quantidade total do produto mais caro: " + caroPeso);
	}

}
