package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.5 Terreno Grande vs Terreno Pequeno
		Calcular e exibir a �rea de um ret�ngulo, a partir dos valores da base
		e altura que ser�o digitados. Se a �rea for maior que 100, exibir a mensagem
		�Terreno grande�, caso contr�rio, exibir a mensagem �Terreno pequeno�.*/
		
		Scanner sc = new Scanner(System.in);

		double base, altura, area;

		System.out.print("Digite o valor da base do terreno retangular: ");
		base = sc.nextDouble();
		System.out.print("Digite o valor da altura do terreno retangular: ");
		altura = sc.nextDouble();

		area = base * altura;
		System.out.println();
		System.out.println("O tamanho da �rea do terreno �: " + area+" m�");
		if (area > 100) {
			System.out.println("Terreno grande");
		}
		else {
			System.out.println("Terreno pequeno");
		}
		sc.close();

	}

}
