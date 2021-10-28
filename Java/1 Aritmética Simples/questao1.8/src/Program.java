import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.8 Milhas vs Km
		Sabendo que uma milha mar�tima equivale a um mil, oitocentos e
		cinq�enta e dois metros e que um quil�metro possui mil metros, fazer um
		programa para converter milhas mar�timas em quil�metros.*/
		
		Scanner sc = new Scanner(System.in);
		// milhaM = milha mar�tima, km = quil�metros.
		double milhaM, km;
		
		System.out.print("Digite o valor de milhas mar�tima a ser convertido: ");
		milhaM = sc.nextDouble();
		
		km = (milhaM*1.852);

		System.out.print("O valor convertido em quilômetros é: "+km+ "km");	
		
		sc.close();
	}

}
