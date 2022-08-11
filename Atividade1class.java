package Aula3;

import java.util.Scanner;

public class Atividade1class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== VERIFICACAO SE UM NUMERO E MULTIPLO DE 5 ===");
		System.out.println("Digite um numero: ");
		Double numero = input.nextDouble();
		Double teste = (numero%5);
		
		if (teste==0) {
			System.out.println("O numero "+numero+ " e multiplo de 5.");
		}else {
			System.out.println("O numero "+numero+ " nao e multiplo de 5.");
		}
		input.close();
	}
}
