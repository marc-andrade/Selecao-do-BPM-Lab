import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.6 M�dia Aritm�tica
		Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que
		ser�o digitados.*/
		
		Scanner sc = new Scanner(System.in);
		// vari�veis das medias 
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
		System.out.println("A media dos valores �: "+media);
		
		sc.close();
	}

}
