package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.9 Teste do Retângulo
		Verificar se três valores quaisquer (A,B, C) que serão digitados formam
		ou não um triângulo retângulo. Lembre-se que o quadrado da hipotenusa é
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
				System.out.println("Formam Triangulo Retângulo existe");
			}
			else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
				System.out.println();
				System.out.println("Formam Triangulo Retângulo");
			}
			else if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
				System.out.println();
				System.out.println("Formam Triangulo Retângulo");
			}else {
				System.out.println();
				System.out.println("Não formam um Triângulo Retângulo");
			}
			
		} else {
			System.out.println();
			System.out.println("Não Formam um Triângulo");

		}
		sc.close();

	}

}
