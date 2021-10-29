package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*2.10 Peso Ideal - v2
		Entrar com o peso, o sexo e a altura de uma determinada pessoa. Ap�s
		a digita��o, exibir se esta pessoa est� ou n�o com seu peso ideal. Veja tabela
		da rela��o peso/altura2*/
		
		Scanner sc = new Scanner(System.in);
		
		double peso,altura,R;
		char sexo;
		
		System.out.print("Digite o peso da pessoa: ");
		peso = sc.nextDouble();
		System.out.print("Digite o sexo da pessoa (F/M): ");
		sexo = sc.next().charAt(0);
		System.out.print("Digite a altura da pessoa: ");
		altura = sc.nextDouble();
		
		// imc = peso / altura * altura
		R = peso / (Math.pow(altura, 2));
		// Tabela feminina
		
		if (sexo == 'F') {
			
			if(R < 19) {
				System.out.println();
				System.out.println("Feminino: Abaixo do Peso");
			}
			else if (19 <= R && R < 24 ) {
				System.out.println();
				System.out.println("Feminino: Peso Ideal");
			}
			else if (R >= 24) {
				System.out.println();
				System.out.println("Feminino: Acima do Peso");
			}
			
			//Tabela Masculina
		} else if (sexo == 'M') {
			
			if (R < 20 ) {
				System.out.println();
				System.out.println("Masculino: Abaixo do Peso");
			}
			else if (20 <= R && R < 25) {
				System.out.println();
				System.out.println("Masculino: Peso Ideal");
			}
			
			else if (R >= 25 ) {
				System.out.println();
				System.out.println("Masculino: Acima do Peso");
			}
			
		}
		
		
		sc.close();
	}

}
