package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*3.4 Tabuada do 5
		Exibir a tabuada do número cinco no intervalo de um a dez.*/
		
		Scanner sc = new Scanner(System.in);
		int tabuada;
		for (int i = 1; i<=10; i++) {
			tabuada=i*5;
			System.out.printf("%d ", tabuada);
		}
		
		sc.close();
	}

}
