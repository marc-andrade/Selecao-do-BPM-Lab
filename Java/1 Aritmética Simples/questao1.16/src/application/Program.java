package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.16 Fun��es Trigonom�tricas
		Entrar via teclado com o valor de um �ngulo em graus, calcular e exibir
		as seguintes fun��es trigonom�tricas: seno, coseno, tangente e secante deste
		�ngulo. Lembre-se que uma fun��o trigonom�trica trabalha em radianos.*/
		
		Scanner sc = new Scanner(System.in);
		
		// a = �ngulo, r = radianos, sin = seno, cos = cosseno
		// tan = tangente, sec = secante
		double a,r,sin,cos,tan,sec;
		
		System.out.print("Digite o �ngulo: ");
		a = sc.nextDouble();
		// Convers�o de �ngulo para radianos
		r = Math.toRadians(a);
		// Fun��o para calcular o seno
		sin = Math.sin(r);
		// Fun��o para calcular o cosseno
		cos = Math.cos(r);
		// Fun��o para calcular a Tangente
		tan = Math.tan(r);
		// Fun��o para calcular a secante
		sec = (1/Math.cos(a));
	
		System.out.printf("\nValor do seno em Radianos: %.2f \n",sin);
		System.out.printf("Valor do cosseno em Radianos: %.2f\n",cos);
		System.out.printf("Valor da tangente em Radianos: %.2f\n",tan);
		System.out.printf("Valor da secante em Radianos: %.2f\n",sec);
		sc.close();
	}

}
