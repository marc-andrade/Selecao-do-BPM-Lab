package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2.11 Velocidade Permitida A partir dos valores da aceleração (a em m/s2
		 * 
		 * ), da velocidade inicial (v0 em m/s) e do tempo de percurso (t em s).
		 * Calcular e exibir a velocidade final de automóvel em km/h. Exibir mensagem de
		 * acordo com a tabela: Tabela 3 – Mensagem a exibir de acordo com a velocidade
		 * Velocidade em Km (V) Mensagem V ≤ 40 Veículo muito lento 40 < V ≤ 60
		 * Velocidade permitida 60 < V ≤ 80 Velocidade de cruzeiro 80 < V ≤ 120 Veículo
		 * rápido V > 120 Veículo muito rápido
		 */

		Scanner sc = new Scanner(System.in);

		// v = Velocidade final, v0 = velocidade inicial, a = aceleção, t = tempo
		double v, v0, a, t;

		System.out.print("Digite a velocidade inicial em m/s: ");
		v0 = sc.nextDouble();
		System.out.print("Digite a aceleração em m/s²: ");
		a = sc.nextDouble();
		System.out.print("Digite o tempo em segundos: ");
		t = sc.nextDouble();

		// calculo velocidade final em m/s
		v = v0 + (a * t);
		// conversão de m/s para km/h
		v *= 3.60;
		
		System.out.println();
		System.out.printf("Velocidade final é: %.2f km/h\n",v);
		System.out.print("Mensagem: ");
		
		
		if(0<=v && v<=40) {
			System.out.println("Veículo muito lento");
		}
		else if (v <= 60) {
			System.out.println("Velocidade permitida");
		}
		else if (v <= 80) {
			System.out.println("Velocidade de cruzeiro");
		}
		else if (v <= 120) {
			System.out.println("Veículo rápido");
		}
		else if (v > 120) {
			System.out.println("Veículo muito rápido");
		}
		else {
			System.out.println("Velocidade Incorreta");
		}
		
		sc.close();
	}

}
