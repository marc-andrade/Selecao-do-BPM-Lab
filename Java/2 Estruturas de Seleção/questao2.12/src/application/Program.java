package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.12 Aluno Aprovado
		Uma escola com cursos em regime semestral, realiza duas avaliações
		durante o semestre e calcula a média do aluno, da seguinte maneira:

		media = P1 + 2 * P2 / 3

		Fazer um programa para entrar via teclado com os valores das notas
		(P1 e P2) e calcular a média. Exibir a situação final do aluno (“Aprovado” ou
		“Reprovado”), sabendo que a média de aprovação é igual a cinco.*/
		
		Scanner sc = new Scanner(System.in);
		
		double P1,P2,media;
		
		System.out.print("Digite a 1° nota: ");
		P1 = sc.nextDouble();
		System.out.print("Digite a 2° nota: ");
		P2 = sc.nextDouble();
		
		media = (P1 + 2 * P2)/3.0;
		
		System.out.println();
		System.out.println("A media do aluno: "+media);
		System.out.print("Situação: ");
		
		if (media >= 5) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		sc.close();
	}

}
