import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.4 Área do Triângulo 
		 * A partir dos valores da base e altura de um triângulo,
		 * calcular e exibir sua área.
		 */
		Scanner sc = new Scanner(System.in);
		
		float base,altura,area;
		
		System.out.print("Digite a Base do Triângulo: ");
		base = sc.nextFloat();
		System.out.print("Digite a Altura do Triângulo: ");
		altura = sc.nextFloat();
		
		area = (base*altura)/2;
		
		System.out.println();
		System.out.println("A área do Triangulo é: " + area);
		
		sc.close();
		
	}

}
