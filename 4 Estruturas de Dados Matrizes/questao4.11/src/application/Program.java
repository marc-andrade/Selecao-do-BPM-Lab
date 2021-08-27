package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * 4.11 Mais Novos Primeiros Armazenar o nome, sexo e idade de vinte pessoas.
		 * Após a digitação, exibir os dados (nome, sexo e idade) em ordem decrescente
		 * de idade.
		 */

		Scanner sc = new Scanner(System.in);

		String nome[] = new String[20];
		char sexo[] = new char[20];
		int idade[] = new int[20];

		for (int i = 0; i < idade.length; i++) {

			System.out.printf("=== %d° Cadastro ===\n", i + 1);
			System.out.print("Digite o Nome: ");
			nome[i] = sc.nextLine();
			do {
				System.out.print("Digite o sexo (F/M): ");
				sexo[i] = sc.next().charAt(0);

				if (sexo[i] != 'F' && sexo[i] != 'M') {
					System.out.println("Erro: Sexo inválido, Digite novamente.");
				}
			} while (sexo[i] != 'F' && sexo[i] != 'M');

			do {
				System.out.print("Digite a idade: ");
				idade[i] = sc.nextInt();
				if (idade[i] < 0) {
					System.out.println("Erro: Idade inválida, Idade tem que ser um valor possitvo.");
				}
			} while (idade[i] < 0);
			
			System.out.println();
			sc.nextLine();
		}
		
		Program.ordenar(idade, nome, sexo);
		
		System.out.println("==== Cadastro em ordem decrescente de idade ====");
		
		for (int i = 0; i < idade.length; i++) {
			
				System.out.printf("=== %d° Cadastro ===\n", i + 1);
				System.out.println("Nome: " + nome[i]);
				System.out.println("Sexo: " + sexo[i]);
				System.out.println("Idade: " + idade[i]);
				System.out.println();
		}
		
		sc.close();
	}
	
	
	// Função bubble sorte para ordenar
		public static void ordenar(int v[], String nome[], char sexo[]) {
			// for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
			for (int i = 0; i < v.length - 1; i++) {
				// for utilizado para ordenar o vetor.
				for (int j = 0; j < v.length - 1 - i; j++) {
					/*
					 * Se o valor da posição atual do vetor for menor que o proximo valor, então
					 * troca os valores de lugar no vetor.
					 */
					if (v[j] < v[j + 1]) {
						int aux =  v[j];
						v[j] = v[j + 1];
						v[j + 1] = aux;
						String auxNome = nome[j];
						nome[j] = nome[j+1];
						nome[j+1] = auxNome;
						char auxSexo = sexo[j];
						sexo[j] = sexo[j+1];
						sexo[j+1] = auxSexo;
					}
				}
			}
		}
}
