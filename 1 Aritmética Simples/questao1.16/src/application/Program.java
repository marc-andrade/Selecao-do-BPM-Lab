package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.16 Funções Trigonométricas
		Entrar via teclado com o valor de um ângulo em graus, calcular e exibir
		as seguintes funções trigonométricas: seno, coseno, tangente e secante deste
		ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.*/
		
		Scanner sc = new Scanner(System.in);
		
		// a = ângulo, r = radianos, sin = seno, cos = cosseno
		// tan = tangente, sec = secante
		double a,r,sin,cos,tan,sec;
		
		System.out.print("Digite o ângulo: ");
		a = sc.nextDouble();
		// Conversão de ângulo para radianos
		r = Math.toRadians(a);
		// Função para calcular o seno
		sin = Math.sin(r);
		// Função para calcular o cosseno
		cos = Math.cos(r);
		// Função para calcular a Tangente
		tan = Math.tan(r);
		// Função para calcular a secante
		sec = (1.0/Math.cos(a));
	
		System.out.printf("\nValor do seno em Radianos: %.2f \n",sin);
		System.out.printf("Valor do cosseno em Radianos: %.2f\n",cos);
		System.out.printf("Valor da tangente em Radianos: %.2f\n",tan);
		System.out.printf("Valor da secante em Radianos: %.2f\n",sec);
		sc.close();
	}

}
