import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.3 �rea do Quadrado - v2 Calcular e exibir a �rea de um quadrado a partir do
		 * valor de sua diagonal que ser� digitado.
		 */
		Scanner sc = new Scanner(System.in);

		float diagonal, area;

		System.out.print("Digite o valor da diagonal do Quadrado: ");
		diagonal = sc.nextFloat();

		area = (diagonal * diagonal) / 2;

		System.out.println("A �rea do Quadrado �: " + area);

		sc.close();

	}

}
