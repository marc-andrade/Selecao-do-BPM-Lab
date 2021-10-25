import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.13 Velocidade do Automóvel
		 * Calcular e exibir a velocidade final (em km/h)
		 * de um automóvel, a partir dos valores da velocidade inicial (em m/s), da
		 * aceleração (m/s2 ) e do
		 * 
		 * tempo de percurso (em s) que serão digitados.
		 */
		Scanner sc = new Scanner(System.in);
		// v = Velocidade final, v0 = velocidade inicial, a = aceleção, t = tempo
		double v, v0, a, t;
		
		System.out.print("Digite a velocidade inicial em m/s: ");
		v0 = sc.nextDouble();
		System.out.print("Digite a aceleração em m/s²: ");
		a = sc.nextDouble();
		System.out.print("Digite o tempo em segundos: ");
		t = sc.nextDouble();
		
		// calculo velocidade final em m/s
		v = v0 + (a*t);
		// conversão de m/s para km/h
		v *= 3.60;
		
		System.out.println();
		System.out.printf("Velocidade final é: %.2f km/h",v);
		sc.close();
	}

}
