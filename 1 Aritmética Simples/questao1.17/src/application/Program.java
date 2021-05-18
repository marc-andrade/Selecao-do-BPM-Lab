package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.17 Exponencial e Logaritmo Natural
		Entrar via teclado com dois valores quaisquer �X� e �Y�. Calcular e
		exibir o c�lculo XY

		(�X� elevado a �Y�). Pesquisar as fun��es Exp e Ln.*/
		
		Scanner sc = new Scanner(System.in);
		// exp = exponencial, log = longari
		double x,y, exp,log;
		
		System.out.print("Digite o valor da base X: ");
		x = sc.nextDouble();
		System.out.print("Digite o valor do expoente Y: ");
		y = sc.nextDouble();
		//Fun��o para calcular exponencial
		exp = Math.pow(x, y);
		//Fun��o para calcular o longaritmo
		log = Math.log(exp);
		
		System.out.printf("\n%.2f elevado a %.2f �: %.2f \n",x,y,exp);
		System.out.printf("Log10 de %.2f �: %.2f", exp,log);
		sc.close();
	}

}
