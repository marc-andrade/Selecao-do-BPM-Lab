import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.4 �rea do Tri�ngulo 
		 * A partir dos valores da base e altura de um tri�ngulo,
		 * calcular e exibir sua �rea.
		 */
		Scanner sc = new Scanner(System.in);
		
		float base,altura,area;
		
		System.out.print("Digite a Base do Tri�ngulo: ");
		base = sc.nextFloat();
		System.out.print("Digite a Altura do Tri�ngulo: ");
		altura = sc.nextFloat();
		
		area = (base*altura)/2;
		
		System.out.println();
		System.out.println("A �rea do Triangulo �: " + area);
		
		sc.close();
		
	}

}
