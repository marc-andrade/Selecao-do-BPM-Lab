package application;

import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) {
		
		/*4.8 Ordem Crescente
		Armazenar vinte valores em um vetor. Após a digitação, exibir os
		valores em ordem crescente.*/
		
		Scanner sc = new Scanner(System.in);
		
		double valores[] = new double [20];
		
		System.out.println("================================");
		System.out.println("   Entre com vinte valores");
		System.out.println("================================");
		
		for(int i =0; i< valores.length; i++) {
			System.out.printf("Digite o %d° valor: ",i+1);
			valores[i] = sc.nextDouble();
		}
		
		//Program pr = new Program();
		Program.ordenar(valores);
		
		System.out.println();
		System.out.println("=========== Valores Ordenados em ordem crescente ===========");
		
		for(int i=0; i < valores.length; i++) {
		      System.out.println(valores[i]);
		     /* if(i < valores.length-1) {
		    	  System.out.print(", ");
		      }*/
		    }
		
		sc.close();
	}

	//Função bubble sorte para ordenar
	public static void ordenar(double v[]) {
	    // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
	    for(int i = 0; i < v.length - 1; i++) {
	      // for utilizado para ordenar o vetor.
	      for(int j = 0; j < v.length - 1 - i; j++) {
	        /* Se o valor da posição atual do vetor for maior que o proximo valor,
	          então troca os valores de lugar no vetor. */
	        if(v[j] > v[j + 1]) {
	          int aux = (int) v[j];
	          v[j] = v[j + 1];
	          v[j + 1] = aux;
	        }
	      }
	    }
	  }
	}

