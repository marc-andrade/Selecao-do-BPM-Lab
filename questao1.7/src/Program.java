import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.7 Média Geométrica
		Calcular e exibir a média geométrica de dois valores quaisquer que
		serão digitados.*/
		
		Scanner sc = new Scanner(System.in);
		
		// variáveis das medias 
		double v1,v2,mediaGeo;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		
		mediaGeo = Math.sqrt(v1*v2);
		
		System.out.println();
		System.out.println("A media geométrica dos valores é: "+mediaGeo);
		
		sc.close();
	}

}
