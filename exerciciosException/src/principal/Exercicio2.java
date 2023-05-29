package principal;

import entidades.Conta;
import entidades.ContaExcecao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		
		try {
			conta.setSaldo(1000);
			conta.Sacar(2000);
		} catch(ContaExcecao e) {
			System.err.println("Excecao Capturada:"+ e.getMessage());
		}finally{
			//para sempre mostrar o saldo, eu usei o finally, mesmo quando o o programa der erro
			System.out.println("Saldo atual: " + conta.getSaldo());
		}
		
		
		
	}
}
