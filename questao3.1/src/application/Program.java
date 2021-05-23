package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*3.1 Apenas Positivos
		Criar uma rotina de entrada que aceite somente um valor positivo.*/
		
		Scanner sc = new Scanner(System.in);
		
		double n=0;
		
		while (n >= 0) {
			System.out.print("Digite um valor: ");
			n = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Você digitou um valor negativo.");
		
		sc.close();
	}

}
