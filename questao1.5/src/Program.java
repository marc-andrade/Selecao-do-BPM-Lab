import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.5 Volume da Esfera Calcular e exibir o volume de uma esfera a partir do
		 * valor de seu diâmetro que será digitado.
		 */
		Scanner sc = new Scanner(System.in);
		
		double diametro,volume,raio,PI;
		
		System.out.print("Digite o diâmetro da esfera: ");
		diametro = sc.nextFloat();
		
		//Biblioteca Math usada para fazer a pontenciação e pegar valor de Pi
		
		PI = Math.PI;
		raio = (diametro/2);
		volume = (4.0/3.0)*PI*(Math.pow(raio, 3));
		
		System.out.println();
		System.out.println("O Volume da esfera é: "+volume+" cm²");
		
		sc.close();

	}

}
