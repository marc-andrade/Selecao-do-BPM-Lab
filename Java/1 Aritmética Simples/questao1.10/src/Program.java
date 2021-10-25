import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.10 Graus vs Fahrenheit
		Entrar via teclado com o valor de uma temperatura em graus Celsius,
		calcular e exibir sua temperatura equivalente em Fahrenheit.*/
		
		Scanner sc = new Scanner(System.in);
		
		double celsius,fahrenheit;
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		celsius = sc.nextDouble();
		
		//fórmula conversão de celsius para fahrenheit
		fahrenheit = celsius*(9.0/5.0)+32;
		
		System.out.println();
		System.out.println("A temperatura em Fahrenheit é: "+ fahrenheit);
		
		sc.close();
	}

}
