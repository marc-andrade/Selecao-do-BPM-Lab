package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.4 Terreno Grande
		Calcular e exibir a área de um retângulo, a partir dos valores da base
		e altura que serão digitados. Se a área for maior que 100, exibir a mensagem
		“Terreno grande”.*/
		
		Scanner sc = new Scanner(System.in);
		
		double base,altura,area;
		
		System.out.print("Digite o valor da base do terreno retangular: ");
		base = sc.nextDouble();
		System.out.print("Digite o valor da altura do terreno retangular: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		System.out.println();
		System.out.println("O tamanho da área do terreno é: " +area);
		if (area > 100) {
			System.out.println("Terreno grande");
		}
		sc.close();
	}

}
