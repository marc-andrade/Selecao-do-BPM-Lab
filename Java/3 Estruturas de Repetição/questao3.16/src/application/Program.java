package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*3.16 Maior, Menor, Soma e Média, Positivos e Negativos - v2

		Entrar via teclado com “N” valores quaisquer. O valor “N” (que repre-
		senta a quantidade de números) será digitado, deverá ser positivo, mas menor

		que vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de
		erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir:
		A. O maior valor;
		B. O menor valor;
		C. A soma dos valores;
		D. A média aritmética dos valores.
		E. A porcentagem de valores que são positivos;
		F. A porcentagem de valores negativos.
		Após exibir os dados, perguntar ao usuário de deseja ou não uma nova
		execução do programa. Consistir a resposta no sentido de aceitar somente “S”
		ou “N” e encerrar o programa em função dessa resposta.*/

		Scanner sc = new Scanner(System.in);
		String resp;
		int n = 0;
		
		do {
			
		double maior,menor, sum = 0, possitivo = 0, negativo = 0, media;
		
		System.out.println("O valor de 'N' termos tem que ser um número possitivo e menor que vinte.");

		// Laço para conção dos valores possitivos e maiores que vinte
		while (n <= 0 || n > 20) {
			System.out.print("Digite o valor de 'N': ");
			n = sc.nextInt();

			// condicional para exibir mensagem de erro.
			if (n <= 0 || n > 20) {
				System.out.println("Erro: valor inválido, Entre com valor de 'N' novamente.");
			}
		}
		System.out.println();
		// Variável declarada em baixo para atribuição de tamanho de vetor, vet[]<-n.
		double vet[] = new double[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Digite o %d° valor: ", (i + 1));
			vet[i] = sc.nextDouble();
		}
		maior = vet[0];
		menor = vet[0];
		
		for (int i = 0; i < vet.length; i++) {
			// condição para pegar o maior valor
			if (vet[i] > maior) {
				maior = vet[i];
			}
			// condição para pegar o menor valor
			if (vet[i] < menor) {
				menor = vet[i];
			}

			if (vet[i] > 0) {
				possitivo++;
			} else if (vet[i] < 0) {
				negativo++;
			}
			// soma dos valores
			sum += vet[i];
		}

		// fórmula para a média dos valores
		media = sum / n;

		System.out.println();
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A soma dos valores é: " + sum);
		System.out.println("A média aritmética dos valores é: " + media);
		// Fórmula para calcular porcentagem dentro dos comandos de mensagem
		System.out.println("A porcentagem de valores que são positivos é: " + (possitivo / n) * 100 + "%");
		System.out.println("A porcentagem de valores negativos é: " + ((negativo / n) * 100) + "%");
		
		System.out.print("Deseja continuar o programa ? (S/N): ");
		do {
			resp = sc.next();
			if(!resp.equals("S") && !resp.equals("N") && !resp.equals("s") && !resp.equals("n")) {
				System.out.println("Erro: Valor invalido");
				System.out.print("Digite novamente S/N: ");
			}
		}while(!resp.equals("S") && !resp.equals("N") && !resp.equals("s") && !resp.equals("n"));
		
		
		
		}while(resp.equals("S") || resp.equals("s"));
		
		System.out.println();
		sc.close();
	}

}