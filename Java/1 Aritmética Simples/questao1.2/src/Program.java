import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.2 �rea do Quadrado - v1 Calcular e exibir a �rea de um quadrado, a partir
		 * do valor de sua aresta que ser� digitado.
		 */

		Scanner sc = new Scanner(System.in);

		double aresta;

		System.out.print("Digite a aresta do Quadrado: ");
		aresta = sc.nextDouble();
		
		System.out.println();
		System.out.println("A �rea do retangulo �: " + aresta * aresta);

		sc.close();

	}

}
