package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*4.4 Pesquisando Valor
		Armazenar um máximo de 20 valores em um vetor. A quantidade de
		valores a serem armazenados será escolhida pelo usuário. Enviar mensagem
		de erro, caso a quantidade de valores escolhida esteja fora da faixa possível
		e solicitar a quantidade novamente. Após a digitação dos valores, criar uma
		rotina de consulta, onde o usuário digita um número e o programa exibe
		em qual posição do vetor este número está localizado. Se o número não for
		encontrado, enviar mensagem “Valor não encontrado!”. Perguntar ao usuário
		se deseja ou não fazer uma nova consulta, consistir a resposta e encerrar o
		programa em caso negativo.*/
		
		Scanner sc = new Scanner(System.in);
		
		int n =0,valorExiste=0;
		double busca;
		String resp;
		
		System.out.println("Digite um valor para 'N' entre 1 a 20,");
		// Laço para conção dos valores possitivos e maiores que vinte
		while (n <= 0 || n > 20) {
			System.out.print("Digite o valor de 'N': ");
			n = sc.nextInt();

			// condicional para exibir mensagem de erro.
			if (n <= 0 || n > 20) {
				System.out.println("Erro: valor inválido, Entre com valor de 'N' novamente.");
			}
		}
		
		// Variável declarada em baixo para atribuição de tamanho de vetor, vet[]<-n.
		double vetor[] = new double[n];
		
		System.out.println();
		//lendo valores no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° valor: ", i + 1);
			vetor[i] = sc.nextDouble();
		}
		
			do {
				valorExiste=0;
				System.out.println();
				System.out.print("Digite o valor que deseja saber a posição: ");
				busca = sc.nextDouble();
				
				for(int i=0; i<vetor.length; i++) {
					if (vetor[i] == busca) {
						System.out.println("Valor na posição "+i+" do vetor." );
						valorExiste=1;
					}
				}
				
				if (valorExiste ==0 ) {
					System.out.println("Valor não encontrado!");
				}
				System.out.println();
				System.out.print("Deseja continuar a consulta ? (S/N): ");
				do {
					resp = sc.next();
					if(!resp.equals("S") && !resp.equals("N") && !resp.equals("s") && !resp.equals("n")) {
						System.out.println("Erro: Valor invalido");
						System.out.print("Digite novamente S/N: ");
					}
				}while(!resp.equals("S") && !resp.equals("N") && !resp.equals("s") && !resp.equals("n"));
			}while(resp.equals("S") || resp.equals("s"));
			
			System.out.println("Programa encerrado...");
			
		
		sc.close();
	}

}
