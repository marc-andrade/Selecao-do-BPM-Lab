package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.7 Peso Ideal - v1
		Entrar com o peso e a altura de uma determinada pessoa. Após a
		digitação, exibir se esta pessoa está ou não com seu peso ideal. Veja tabela da
		relação peso/altura2*/
		
		Scanner sc = new Scanner(System.in);
		
		double peso,altura,R;
		
		System.out.print("Digite o peso da pessoa: ");
		peso = sc.nextDouble();
		System.out.print("Digite a altura da pessoa: ");
		altura = sc.nextDouble();
		
		// imc = peso / altura * altura
		R = peso / (Math.pow(altura, 2));
		
		//Tabela de peso
		if (R < 20 ) {
			System.out.println();
			System.out.println("Abaixo do Peso");
		}
		if (20 <= R && R < 25) {
			System.out.println();
			System.out.println("Peso Ideal");
		}
		
		if (R >= 25 ) {
			System.out.println();
			System.out.println("Acima do Peso");
		}
		
		sc.close();
	}

}
