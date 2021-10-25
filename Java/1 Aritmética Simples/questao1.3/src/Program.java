import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.3 Área do Quadrado - v2 Calcular e exibir a área de um quadrado a partir do
		 * valor de sua diagonal que será digitado.
		 */
		Scanner sc = new Scanner(System.in);

		float diagonal, area;

		System.out.print("Digite o valor da diagonal do Quadrado: ");
		diagonal = sc.nextFloat();

		area = (diagonal * diagonal) / 2;

		System.out.println("A área do Quadrado é: " + area);

		sc.close();

	}

}
