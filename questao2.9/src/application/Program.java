package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.9 Teste do Ret�ngulo
		Verificar se tr�s valores quaisquer (A,B, C) que ser�o digitados formam
		ou n�o um tri�ngulo ret�ngulo. Lembre-se que o quadrado da hipotenusa �
		igual a soma dos quadrados dos catetos.*/
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;

		System.out.print("Digite o segmento A: ");
		a = sc.nextDouble();
		System.out.print("Digite o segmento B: ");
		b = sc.nextDouble();
		System.out.print("Digite o segmento C: ");
		c = sc.nextDouble();

		if (a < b + c && b < a + c && c < a + b) {
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println();
				System.out.println("Formam Triangulo Ret�ngulo existe");
			}
			else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
				System.out.println();
				System.out.println("Formam Triangulo Ret�ngulo");
			}
			else if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
				System.out.println();
				System.out.println("Formam Triangulo Ret�ngulo");
			}else {
				System.out.println();
				System.out.println("N�o formam um Tri�ngulo Ret�ngulo");
			}
			
		} else {
			System.out.println();
			System.out.println("N�o Formam um Tri�ngulo");

		}
		sc.close();

	}

}
