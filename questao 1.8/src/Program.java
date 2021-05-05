import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.8 Milhas vs Km
		Sabendo que uma milha marítima equivale a um mil, oitocentos e
		cinqüenta e dois metros e que um quilômetro possui mil metros, fazer um
		programa para converter milhas marítimas em quilômetros.*/
		
		Scanner sc = new Scanner(System.in);
		// milhaM = milha marítima, km = quilômetros.
		double milhaM, km;
		
		System.out.print("Digite o valor de milhas marítima a ser convertido: ");
		milhaM = sc.nextDouble();
		
		km = (milhaM/1.852);

		System.out.printf("O valor convertido em quilômetros é: %.2f km",km);	
		
		sc.close();
	}

}
