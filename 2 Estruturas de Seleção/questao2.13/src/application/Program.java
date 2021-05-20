package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Nota para Aprovação Uma escola com cursos em regime semestral realiza duas
		 * avaliações durante o semestre e calcula a média do aluno, da seguinte
		 * maneira:
		 * 
		 * media = P1 + 2 * P2/3
		 * 
		 * (2) Fazer um programa para entrar via teclado com o valor da primeira nota
		 * (P1) e o programa deverá calcular e exibir quanto o aluno precisa tirar na
		 * segunda nota (P2) para ser aprovado, sabendo que a média de aprovação é igual
		 * a cinco (5.00).
		 */

		Scanner sc = new Scanner(System.in);

		double P1, P2;

		System.out.print("Digite a 1° nota: ");
		P1 = sc.nextDouble();
		
		if (P1 >=0 && P1 <=10) {
			P2 = (5.0 * 3 - P1) / 2.0;
			
			System.out.println();
			System.out.println("O aluno precisa tirar " + P2 +" para ser aprovado.");
		}
		else {
			System.out.println();
			System.out.println("Nota inválida");
		}
		

		sc.close();
	}

}
