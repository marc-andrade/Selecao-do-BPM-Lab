package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * 3.15 Maior, Menor, Soma e M�dia, Positivos e Negativos - v1
		 * 
		 * Entrar via teclado com �N� valores quaisquer. O valor �N� (que repre- senta a
		 * quantidade de n�meros) ser� digitado, dever� ser positivo, mas menor que
		 * vinte. Caso a quantidade n�o satisfa�a a restri��o, enviar mensagem de erro e
		 * solicitar o valor novamente. Ap�s a digita��o dos �N� valores, exibir:
		 * 
		 * A. O maior valor; B. O menor valor; C. A soma dos valores; D. A m�dia
		 * aritm�tica dos valores. E. A porcentagem de valores que s�o positivos; F. A
		 * porcentagem de valores negativos.
		 */

		Scanner sc = new Scanner(System.in);

		int n = 0;
		double maior,menor, sum = 0, possitivo = 0, negativo = 0, media;

		System.out.println("O valor de 'N' termos tem que ser um n�mero possitivo e menor que vinte.");

		// La�o para con��o dos valores possitivos e maiores que vinte
		while (n <= 0 || n > 20) {
			System.out.print("Digite o valor de 'N': ");
			n = sc.nextInt();

			// condicional para exibir mensagem de erro.
			if (n <= 0 || n > 50) {
				System.out.println("Erro: valor inv�lido, Entre com valor de 'N' novamente.");
			}
		}
		System.out.println();
		// Vari�vel declarada em baixo para atribui��o de tamanho de vetor, vet[]<-n.
		double vet[] = new double[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Digite o %d� valor: ", (i + 1));
			vet[i] = sc.nextDouble();
		}
		maior = vet[0];
		menor = vet[0];
		
		for (int i = 0; i < vet.length; i++) {
			// condi��o para pegar o maior valor
			if (vet[i] > maior) {
				maior = vet[i];
			}
			// condi��o para pegar o menor valor
			else if (vet[i] < menor) {
				menor = vet[i];
				
			}else if (vet[i] > 0) {
				possitivo++;
		
			} else if (vet[i] < 0) {
				negativo++;
			}
			// soma dos valores
			sum += vet[i];
		}

		// f�rmula para a m�dia dos valores
		media = sum / n;

		System.out.println();
		System.out.println("O maior valor e: " + maior);
		System.out.println("O menor valor e: " + menor);
		System.out.println("A soma dos valores �: " + sum);
		System.out.println("A m�dia aritm�tica dos valores �: " + media);
		// Formula para calcular porcentagem dentro dos comandos de mensagem
		System.out.println("A porcentagem de valores que sao positivos �: " + (possitivo / n) * 100 + "%");
		System.out.println("A porcentagem de valores negativos �: " + ((negativo / n) * 100) + "%");
		sc.close();
	}

}
