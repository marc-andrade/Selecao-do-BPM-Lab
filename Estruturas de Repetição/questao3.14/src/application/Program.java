package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*3.14 Maior, Soma e Média
		Entrar via teclado com dez valores positivos. Consistir a digitação e
		enviar mensagem de erro, se necessário. Após a digitação, exibir:
		A. O maior valor;
		B. A soma dos valores;
		C. A média aritmética dos valores.*/
		
		Scanner sc = new Scanner(System.in);
		
		double vet[] = new double [10], maior = 0, sum = 0,media;
		
		System.out.println("======================================");
		System.out.println("||      Entre com 10 valores        ||");
		System.out.println("======================================");
		System.out.println();
		
		for (int i =0; i< vet.length; i++) {
			
				System.out.printf("Digite o %d° valor: ",(i+1));
				vet[i] = sc.nextDouble();
			
			//Laço para aceitar somente valores possitivos	
			while (vet[i] < 0) {
				System.out.println();
				System.out.println("Erro: valor inválido, Entre com valor novamente.");
				System.out.printf("Digite o %d° valor: ",(i+1));
				vet[i] = sc.nextDouble();
		}
			// condição para pegar o maior valor
			if (vet[i] > maior) {
				maior = vet[i];
			}
			// soma dos valores
			sum += vet[i];
		}
		//fórmula para a média dos valores
		media = sum / 10;
		
		System.out.println();
		System.out.println("O maior valor é: "+ maior);
		System.out.println("A soma dos valores é: "+ sum);
		System.out.println("A média aritmética dos valores é: "+ media);
		sc.close();

	}
}
