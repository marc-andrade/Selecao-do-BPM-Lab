package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.8 Teste do Triângulo
		A partir de três valores que serão digitados, verificar se formam ou não
		um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou
		eqüilátero”. Um triângulo escaleno possui todos os lados diferentes, o isósceles,
		dois lados iguais e o equilátero, todos os lados iguais. Para existir triângulo
		é necessário que a soma de dois lados quaisquer seja maior que o outro, isto,
		para os três lados.*/
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.print("Digite o segmento A: ");
		a = sc.nextDouble();
		System.out.print("Digite o segmento B: ");
		b = sc.nextDouble();
		System.out.print("Digite o segmento C: ");
		c = sc.nextDouble();
		
		if (a < b + c && b < a + c && c < a + b) {
			System.out.println();
			System.out.print("Formam um Triângulo: ");
			if (a == b && b == c) {
				System.out.println("Equilátero");
			} else if (a != b && b != c && c != a) {
				System.out.print("Escaleno");
			} else {
				System.out.print("Isóseles");
			}
		} else {
			System.out.println();
			System.out.println("Não Formam um Triângulo");

		}
		sc.close();
	}

}
