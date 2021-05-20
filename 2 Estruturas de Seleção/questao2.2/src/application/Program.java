package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.2 Menor Valor
		Entrar via teclado, com dois valores distintos. Exibir o menor deles.*/
		
		Scanner sc = new Scanner(System.in);
		
		double v1,v2;
		System.out.println("======================================");
		System.out.println("   Entre com dois valores distintos");
		System.out.println("======================================");
		System.out.print("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		
		if (v1 < v2) {
			System.out.println();
			System.out.printf("O primeiro valor: "+v1+" é menor entre os dois");
		}
		if (v2 < v1) {
			System.out.println();
			System.out.print("O segundo valor: "+v2+ " é menor entre os dois");
		}
		
		sc.close();
	}

}
