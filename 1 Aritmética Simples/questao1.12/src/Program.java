import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.12 Volume do Cone Calcular e exibir o volume de um cone a partir dos
		 * valores da altura e do raio da base que ser�o digitados.
		 */

		Scanner sc = new Scanner(System.in);

		double raio, volume,altura, PI;

		System.out.print("Digite o raio da base do cone: ");
		raio = sc.nextDouble();
		System.out.print("Digite a altura do cone: ");
		altura = sc.nextDouble();
		
		// Biblioteca Math usada para fazer a pontencia��o e pegar valor de Pi
		PI = Math.PI;
		
		// (PI*raio^2*altura)/3
		volume = (PI * (Math.pow(raio, 2)) * altura) / 3.0;

		System.out.println();
		System.out.printf("O volume do cone �: %.2f cm�", volume);

		sc.close();

	}

}
