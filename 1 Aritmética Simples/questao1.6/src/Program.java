import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.6 Média Aritmética
		Calcular e exibir a média aritmética de quatro valores quaisquer que
		serão digitados.*/
		
		Scanner sc = new Scanner(System.in);
		// variáveis das medias 
		double v1,v2,v3,v4,media;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		v3 = sc.nextDouble();
		System.out.print("Digite o quarto valor: ");
		v4 = sc.nextDouble();
		
		media = (v1+v2+v3+v4)/4.0;
		
		System.out.println();
		System.out.println("A media dos valores é: "+media);
		
		sc.close();
	}

}
