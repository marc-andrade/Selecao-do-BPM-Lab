import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.2 Área do Quadrado - v1 Calcular e exibir a área de um quadrado, a partir
		 * do valor de sua aresta que será digitado.
		 */

		Scanner sc = new Scanner(System.in);

		double aresta;

		System.out.print("Digite a aresta do Quadrado: ");
		aresta = sc.nextDouble();
		
		System.out.println();
		System.out.println("A área do retangulo é: " + aresta * aresta);

		sc.close();

	}

}
