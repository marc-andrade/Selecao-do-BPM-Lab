import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		
		/*1.14 Volume do Cubo e da Esfera
		Calcular e exibir o volume livre de um ambiente que contém uma esfera
		de raio “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e
		“a” serão digitados.*/
		
		Scanner sc= new Scanner(System.in);
		// a = aresta, r = raio, volumeC = volume cubo, volumeE = volume esfera
		// volumeL = volume Livre
		double  pi,a, r,volumeC,volumeE,volumeL;
		pi = Math.PI;
		
		System.out.print("Digite a aresta do cubo: ");
		a = sc.nextDouble();
		
		r = a/2.0;
		volumeC = Math.pow(a, 3);
		volumeE = (4.0/3.0)*pi*Math.pow(r, 3);
		volumeL = volumeC - volumeE;
		
		System.out.println();
		System.out.printf("O volume livre do ambiente é: %.2f",volumeL);
		
		sc.close();
		
	}
}
