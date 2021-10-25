package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.8 Teste do Tri�ngulo
		A partir de tr�s valores que ser�o digitados, verificar se formam ou n�o
		um tri�ngulo. Em caso positivo, exibir sua classifica��o: �Is�sceles, escaleno ou
		eq�il�tero�. Um tri�ngulo escaleno possui todos os lados diferentes, o is�sceles,
		dois lados iguais e o equil�tero, todos os lados iguais. Para existir tri�ngulo
		� necess�rio que a soma de dois lados quaisquer seja maior que o outro, isto,
		para os tr�s lados.*/
		
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
			System.out.print("Formam um Tri�ngulo: ");
			if (a == b && b == c) {
				System.out.println("Equil�tero");
			} else if (a != b && b != c && c != a) {
				System.out.print("Escaleno");
			} else {
				System.out.print("Is�seles");
			}
		} else {
			System.out.println();
			System.out.println("N�o Formam um Tri�ngulo");

		}
		sc.close();
	}

}
