import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.15 Cota��o do D�lar
		 * 
		 * Entrar via teclado com o valor da cota��o do d�lar e uma certa quantidade
		 * de d�lares. Calcular e exibir o valor correspondente em Reais (R$).
		 */
		Scanner sc = new Scanner(System.in);
		
		//dolarCot = cota��o dolar
		double dolarCot, quantidadeDolar, valorReais;
		
		System.out.print("Digite a cota��o do Dolar: ");
		dolarCot = sc.nextDouble();
		System.out.print("Digite a quantidade de dolar: ");
		quantidadeDolar = sc.nextDouble();
		
		valorReais = dolarCot * quantidadeDolar;
		
		System.out.printf("\nvalor correspondente em Reais: %.2fR$", valorReais);
		sc.close();
	}

}
