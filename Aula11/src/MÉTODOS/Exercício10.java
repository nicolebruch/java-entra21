package MÉTODOS;

import java.util.Scanner;

public class Exercício10 {

	
	// Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes.

	//Baseado nisto faça um programa que informe: 		


		    static Scanner scanner = new Scanner(System.in);

		    public static void cinema() {
		    		
		        int totalClientes = 30; //Trinta deles foram ouvidos
		        int somaNotasCinema = 0;
		        int somaNotasHomens = 0;
		        int notaMulherJovem = Integer.MAX_VALUE; //  valor muito alto
		        int notaSuperiorMulher50tao = 0;

		        for (int i = 1; i <= totalClientes; i++) {
		            System.out.println("Cliente " + i + ":");
		            
		            //para cada um perguntou-se o sexo (1=feminino 2=masculino)
		            System.out.print("Sexo (1=feminino, 2=masculino): ");
		            int sexo = scanner.nextInt();
		            
		            //uma nota para o cinema (zero até dez, valor inteiro) e a idade. 
		            System.out.print("Nota para o cinema (zero até dez, valor inteiro): ");
		            int notaCinema = scanner.nextInt();

		            System.out.print("Idade: ");
		            int idade = scanner.nextInt();

		            somaNotasCinema += notaCinema;

		            if (sexo == 2) { // homem
		                somaNotasHomens += notaCinema;
		            } else if (sexo == 1 && idade < notaMulherJovem) { //qual a nota atribuída pela mulher mais jovem; 
		                notaMulherJovem = notaCinema;
		            }

		            if (sexo == 1 && idade > 50 && notaCinema > somaNotasCinema / totalClientes) {
		            	notaSuperiorMulher50tao++; //quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
		            }
		        }
		        //qual a nota média recebida pelo cinema; 
		        double mediaCinema = (double) somaNotasCinema / totalClientes;
		        
		        //qual a nota média atribuída pelos homens; 
		        double mediaHomens = (double) somaNotasHomens / (totalClientes / 2); // a metade dos clientes sao homens

		        System.out.println("Nota média recebida pelo cinema: " + mediaCinema);
		        System.out.println("Nota média atribuída pelos homens: " + mediaHomens);
		        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherJovem);
		        System.out.println("Mulheres com mais de 50 anos que deram nota superior à média do cinema: " + notaSuperiorMulher50tao);
		    }

		    public static void main(String[] args) {
		        cinema();
		    }
		}
		