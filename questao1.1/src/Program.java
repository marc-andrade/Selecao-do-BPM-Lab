
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* 1.1 �rea do Ret�ngulo
		Entrar via teclado com a base e a altura de um ret�ngulo, calcular e
		exibir sua �rea.*/
		
		Scanner sc = new Scanner(System.in);
		
		double base, altura;
		
		System.out.print("Digite a base do Ret�ngulo: ");
		base = sc.nextDouble();
		System.out.print("Digite a altura do Ret�ngulo: ");
		altura = sc.nextDouble();
		
		System.out.println();
		System.out.println("A �rea do retangulo �: " + base*altura);
		
		
		sc.close();

	}

}
