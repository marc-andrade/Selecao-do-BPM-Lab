import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.9 Lei de Ohm
		Calcular e exibir a tens�o de um determinado circuito eletr�nico a
		partir dos valores da resist�ncia e corrente el�trica que ser�o digitados. Utilize
		a lei de Ohm.*/
		
		Scanner sc = new Scanner(System.in);
		
		double tensao,resistencia,corrente;
		
		System.out.print("Digite o valor da resist�ncia: ");
		resistencia = sc.nextDouble();
		System.out.print("Digite o valor da corrente el�trica em amp�res: ");
		corrente = sc.nextDouble();
		
		tensao = resistencia * corrente;
		
		System.out.println();
		System.out.println("A tens�o � igual: "+tensao);
		
		sc.close();
	}

}
