package principal;

import java.util.Scanner;

public class Exercicio1 {
	public static void metodo1(int x, int y) {
		System.out.println("Início da metodo1.");
		int []vetor = new int[x];
		for(int i = 0; i<y; i++) {
		vetor[i] = i;
		System.out.println(1+i);
		}
		System.out.println("Início da metodo2.");
		}
	
	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in); 	
		boolean teste = true;
		
		do {
			try {
		 		System.out.println("Início da main.");
		 		
		 		System.out.println("Insira o tamanho da array");
		 		int x = lerDados.nextInt();
		 		System.out.println("Insira quantos numeros você deseja rodar");
		 		int y = lerDados.nextInt();
		 		metodo1(x,y);
		 		
		 		teste = false;
		 		System.out.println("Fim da main.");
		 	} catch (ArrayIndexOutOfBoundsException e) {
		 		System.err.println("Exceção Capturada " + e.getMessage());
		 		System.out.println("Insira um tamanho igual ou menor que o da array");
		 	}
		}while(teste=true);
		
		System.out.println("encerrando...");
		
		lerDados.close();
	}
}
