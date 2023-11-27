package PARÂMETRO;

public class Explicação01 {

	public static void main(String[] args) {
		// não posso ter métodos dentro de métodos

		String nome = "Nicole";
		escrevaNome(nome);
		média();
	}
//Parametro é o que vai dentro dos parênteses do método  parâmetro tipo String	

	public static void escrevaNome(String nome) {
		// programar dentro do método
		System.out.println("Olá, meu primeiro nome é " + nome);

	}

	public static void média() {
		int num1 = 100;
		int num2 = 10;
		
		int média = (num1 + num2 ) / 2;
		
		
		System.out.println("Médoa é igual a " + média);
	}
}