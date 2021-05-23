package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*3.5 Tabuada de um Número Positivo

		Entrar via teclado com um valor qualquer. Travar a digitação, no sen-
		tido de aceitar somente valores positivos. Após a digitação, exibir a tabuada
		do valor solicitado, no intervalo de um a dez.*/
		
		Scanner sc = new Scanner(System.in);
		
		double n=0,tabuada;
		
		while (n <= 0) {
			System.out.print("Digite um valor: ");
			n = sc.nextDouble();
		}
		
		System.out.println();
		
		for (int i = 1; i<=10; i++) {
			tabuada=i*n;
			System.out.printf("%.2f | ", tabuada);
		}
		
		
		
		
		sc.close();

	}

}
