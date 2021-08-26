package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*4.1 Ordem Inversa
		Armazenar dez números na memória do computador. Exibir os valores
		na ordem inversa à da digitação.*/
		
		Scanner sc = new Scanner(System.in);
		
		//declaracao do vetor
		double numeros[] = new double [10];
		
		System.out.println("================================");
		System.out.println("   Entre com dez valores");
		System.out.println("================================");
		
		//Laço para receber os numeros da posição 0 até 9
		for (int i =0; i<numeros.length; i++) {
			System.out.printf("Digite o %d° valor: ", i+1);
			numeros[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("A ordem inversa dos valore é: ");
		//Imprimindo os numeros na ordem inversa
		for (int i = 9; 0<=i; i--) {
			System.out.printf("%.2f, ",numeros[i]);
		}
		System.out.println();
		
		sc.close();

	}

}
