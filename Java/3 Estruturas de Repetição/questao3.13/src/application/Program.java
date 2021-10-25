package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double A = 1, B = 0, sum = 0;

		System.out.println("O valor de 'N' termos tem que ser um número possitivo e menor que ciquenta.");
		while (n <= 0 || n > 50) {
			System.out.print("Digite o valor de 'N': ");
			n = sc.nextInt();
			if (n <= 0 || n > 50) {
				System.out.println("Erro: valor inválido, Entre com valor de 'N' novamente.");
			}
		}

		for (int i = 0; i < n; i++) {
			
			B = (1/A) + (1/Math.pow(A, 3));
			sum += B;
			A++;

		}
		System.out.println();
		System.out.printf("A soma dos %d termos da sequência é: %.2f", n, sum);

		sc.close();

	}

}
