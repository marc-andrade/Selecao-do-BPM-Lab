import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.11 �rea do C�rculo
		A partir do di�metro de um c�rculo que ser� digitado, calcular e exibir
		sua �rea.*/
		
		Scanner sc = new Scanner(System.in);
		
		double diametro,area,PI;
		
		System.out.print("Digite o di�metro do c�rculo: ");
		diametro = sc.nextDouble();
		
		//Biblioteca Math usada para fazer a pontencia��o e pegar valor de Pi
		
		PI = Math.PI;
		
		area = (PI*(Math.pow(diametro, 2)))/4.0;
		
		System.out.println();
		System.out.printf("A �rea do c�rculo �: %.2f cm�",area);
		
		sc.close();

	}

}
