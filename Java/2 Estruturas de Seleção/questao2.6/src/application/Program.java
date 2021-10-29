package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2.6 Maior Valor - v3 Entrar via teclado com tr�s valores distintos. Exibir o
		 * maior deles.
		 */

		Scanner sc = new Scanner(System.in);

		double v1, v2,v3;
		System.out.println("======================================");
		System.out.println("   Entre com três valores distintos");
		System.out.println("======================================");
		System.out.print("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		v3 = sc.nextDouble();

		if (v1 > v2 && v1 > v3) {
			System.out.println();
			System.out.printf("O primeiro valor: " + v1 + "e o maior entre os tres");
		}
		if (v2 > v1 && v2 > v3) {
			System.out.println();
			System.out.print("O segundo valor: " + v2 + " e o maior entre os tres");
		}
		if (v3 > v1 && v3 > v2) {
			System.out.println();
			System.out.print("O Terceiro valor: " + v3 + " e o maior entre os tres");
		}
		if (v1 == v2 && v1 == v3) {
			System.out.println();
			System.out.println("Os números são identicos");
		}

		sc.close();
	}

}
