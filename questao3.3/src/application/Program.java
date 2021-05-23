package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*3.3 Sexo M ou F
		Entrar via teclado com o sexo de determinado usuário, aceitar somente
		“F”ou “M” como respostas válidas.*/
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		
		do {
			System.out.print("Digite o sexo F/M: ");
			sexo = sc.next().charAt(0);
		}while (sexo !='F' && sexo !='M' );
		
		System.out.println("Sexo aceito!");
		sc.close();
	}

}
