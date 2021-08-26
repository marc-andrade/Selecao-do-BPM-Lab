package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*3.7 Tabuada de 1 a 20, com Pausas
		Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez.
		Entre as tabuadas, solicitar que o usuário pressione uma tecla.*/
		
		Scanner sc = new Scanner(System.in);
		
		int tabuada;
		
		for (int i = 1; i<=10; i++) {
			tabuada=i*20;
			System.out.println(""+tabuada);
			if (tabuada != 200) {
				System.out.print("Digite ENTER para continuar: ");
				sc.nextLine();
			}
		}
		
		sc.close();
	}

}
