import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.11 Área do Círculo
		A partir do diâmetro de um círculo que será digitado, calcular e exibir
		sua área.*/
		
		Scanner sc = new Scanner(System.in);
		
		double diametro,area,PI;
		
		System.out.print("Digite o diâmetro do círculo: ");
		diametro = sc.nextDouble();
		
		//Biblioteca Math usada para fazer a pontenciação e pegar valor de Pi
		
		PI = Math.PI;
		
		area = (PI*(Math.pow(diametro, 2)))/4.0;
		
		System.out.println();
		System.out.printf("A área do círculo é: %.2f cm²",area);
		
		sc.close();

	}

}
