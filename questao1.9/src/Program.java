import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.9 Lei de Ohm
		Calcular e exibir a tensão de um determinado circuito eletrônico a
		partir dos valores da resistência e corrente elétrica que serão digitados. Utilize
		a lei de Ohm.*/
		
		Scanner sc = new Scanner(System.in);
		
		double tensao,resistencia,corrente;
		
		System.out.print("Digite o valor da resistência: ");
		resistencia = sc.nextDouble();
		System.out.print("Digite o valor da corrente elétrica em ampères: ");
		corrente = sc.nextDouble();
		
		tensao = resistencia * corrente;
		
		System.out.println();
		System.out.println("A tensão é igual: "+tensao);
		
		sc.close();
	}

}
