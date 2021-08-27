package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program  {

	public static void main(String[] args) {
		
		/*4.10 Ordem Alfabética
		Armazenar o nome de vinte pessoas em um vetor. Após a digitação
		exibir os nomes em ordem alfabética.*/
		
		Scanner sc = new Scanner(System.in);
		
		String nomes[] = new String [20];
		
		
		System.out.println("================================");
		System.out.println("   Entre com vinte nomes");
		System.out.println("================================");
		
		for (int i=0; i < nomes.length; i++) {
			System.out.printf("Digite o %d° nome: ",i+1);
			nomes[i] = sc.nextLine();
		}
		
		//Array.sort serve para ordenar o vetor
		Arrays.sort(nomes);
		
		System.out.println();
		System.out.println("======== Nomes em ordem alfabética ========");
		System.out.println();
		for (int i=0; i < nomes.length; i++) {
			System.out.printf("%d° nome: %s\n",i+1,nomes[i]);
		}
		
		sc.close();
		
	}

	}


