import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.7 M�dia Geom�trica
		Calcular e exibir a m�dia geom�trica de dois valores quaisquer que
		ser�o digitados.*/
		
		Scanner sc = new Scanner(System.in);
		
		// vari�veis das medias 
		double v1,v2,mediaGeo;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		
		mediaGeo = Math.sqrt(v1*v2);
		
		System.out.println();
		System.out.println("A media geom�trica dos valores �: "+mediaGeo);
		
		sc.close();
	}

}
