package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * 4.2 Produto da Matriz - v1 Armazenar vinte valores em um vetor. Após a
		 * digitação, entrar com uma constante multiplicativa que deverá multiplicar
		 * cada um dos valores do vetor e armazenar o resultado no próprio vetor, na
		 * respectiva posição.
		 */

		Scanner sc = new Scanner(System.in);
		
		//constante mutiplicativa
		final double constante = 3.1;
		// declaracao do vetor
		double valores[] = new double[20];
		
		System.out.println("================================");
		System.out.println("   Entre com vinte valores");
		System.out.println("================================");
		
		// Laço para receber os numeros da posição 0 até 19 
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite o %d° valor: ", i + 1);
			valores[i] = sc.nextDouble();
			//vetor sendo mutiplicado pela constante e sendo armazenado na mesma posição
			valores[i] *= constante;
		}
		
		sc.close();
	}

}
