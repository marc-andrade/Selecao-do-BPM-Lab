
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* 1.1 Área do Retângulo
		Entrar via teclado com a base e a altura de um retângulo, calcular e
		exibir sua área.*/
		
		Scanner sc = new Scanner(System.in);
		
		double base, altura;
		
		System.out.print("Digite a base do Retãngulo: ");
		base = sc.nextDouble();
		System.out.print("Digite a altura do Retãngulo: ");
		altura = sc.nextDouble();
		
		System.out.println();
		System.out.println("A área do retangulo é: " + base*altura);
		
		
		sc.close();

	}

}
