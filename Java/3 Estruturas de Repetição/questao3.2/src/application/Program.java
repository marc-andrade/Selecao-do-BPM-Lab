package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*3.2 Segundo Maior que Primeiro
		Entrar com dois valores via teclado, onde o segundo deverá ser maior
		que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.*/
		
		Scanner sc = new Scanner(System.in);
		
		double n,n2=0;
		
		System.out.print("Digite o 1° valor: ");
		n = sc.nextDouble();
		
		
		while (n>n2) {
			System.out.print("Digite o 2° valor: ");
			n2 = sc.nextDouble();
		}
		System.out.println("Parabéns o 2° valor e maior que o 1°!!!");
		sc.close();
	}

}
