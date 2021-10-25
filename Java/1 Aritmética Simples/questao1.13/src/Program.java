import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.13 Velocidade do Autom�vel
		 * Calcular e exibir a velocidade final (em km/h)
		 * de um autom�vel, a partir dos valores da velocidade inicial (em m/s), da
		 * acelera��o (m/s2 ) e do
		 * 
		 * tempo de percurso (em s) que ser�o digitados.
		 */
		Scanner sc = new Scanner(System.in);
		// v = Velocidade final, v0 = velocidade inicial, a = acele��o, t = tempo
		double v, v0, a, t;
		
		System.out.print("Digite a velocidade inicial em m/s: ");
		v0 = sc.nextDouble();
		System.out.print("Digite a acelera��o em m/s�: ");
		a = sc.nextDouble();
		System.out.print("Digite o tempo em segundos: ");
		t = sc.nextDouble();
		
		// calculo velocidade final em m/s
		v = v0 + (a*t);
		// convers�o de m/s para km/h
		v *= 3.60;
		
		System.out.println();
		System.out.printf("Velocidade final �: %.2f km/h",v);
		sc.close();
	}

}
