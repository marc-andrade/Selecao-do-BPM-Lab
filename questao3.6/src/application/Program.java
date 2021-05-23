package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*3.5 Tabuada de um Número Positivo

		Entrar via teclado com um valor qualquer. Travar a digitação, no sen-
		tido de aceitar somente valores positivos. Após a digitação, exibir a tabuada

		do valor solicitado, no intervalo de um a dez.*/
		
		Scanner sc = new Scanner(System.in);

		
		double X=0,A=0,B=0,tabuada;
		
		while (X <= 0) {
			System.out.print("Digite o valor X: ");
			X = sc.nextDouble();
		}
		System.out.println();
		System.out.println("Digite o intervalo de A até B");
		System.out.print("Digite o valor de A: ");
		A = sc.nextDouble();
		
		
		while (B < A) {
			System.out.print("Digite o valor de B : ");
			B = sc.nextDouble();
		}
		
		System.out.println();
		
		while ( A<=B ) {
			tabuada=B*X;
			System.out.printf("%.2f | ", tabuada);
			B--;
		}

		sc.close();
	}

}
