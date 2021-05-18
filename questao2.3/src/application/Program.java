package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.3 Maior Valor - v2
		Entrar com dois valores quaisquer. Exibir o maior deles, se existir,
		caso contrário, enviar mensagem avisando que os números são idênticos.*/
		
		Scanner sc = new Scanner(System.in);
		
		double v1,v2;
		System.out.println("======================================");
		System.out.println("   Entre com dois valores distintos");
		System.out.println("======================================");
		System.out.print("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		
		if (v1 > v2) {
			System.out.println();
			System.out.printf("O primeiro valor: "+v1+" é maior entre os dois");
		}
		if (v2 > v1) {
			System.out.println();
			System.out.print("O segundo valor: "+v2+ " é maior entre os dois");
		}
		if (v1==v2) {
			System.out.println();
			System.out.println("Os números são idênticos");
		}
		
		sc.close();
	}

}
