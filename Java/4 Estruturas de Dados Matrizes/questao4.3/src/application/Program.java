package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * 4.3 Produto da Matriz - v2 Armazenar vinte valores na memória. Após a
		 * digitação, entrar com uma constante multiplicativa que deverá multiplicar
		 * cada um dos valores do vetor e armazenar o resultado em outro vetor, porém em
		 * posições equivalentes. Exibir os vetores na tela.
		 */

		Scanner sc = new Scanner(System.in);

		// constante mutiplicativa
		final double constante = 3.1;
		// declaracao do vetor
		double vetor[] = new double[20], vetor2[] = new double[20];
		
		System.out.println("================================");
		System.out.println("   Entre com vinte valores");
		System.out.println("================================");
		
		// Laço para receber os numeros da posição 0 até 19
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° valor: ", i + 1);
			vetor[i] = sc.nextDouble();
			// vetor sendo mutiplicado pela constante e armazenando em outro vetor na mesma posição
			vetor2[i] = vetor[i] * constante;
		}
		
		sc.close();
	}

}
