import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 1.15 Cotação do Dólar
		 * 
		 * Entrar via teclado com o valor da cotação do dólar e uma certa quantidade
		 * de dólares. Calcular e exibir o valor correspondente em Reais (R$).
		 */
		Scanner sc = new Scanner(System.in);
		
		//dolarCot = cotação dolar
		double dolarCot, quantidadeDolar, valorReais;
		
		System.out.print("Digite a cotação do Dolar: ");
		dolarCot = sc.nextDouble();
		System.out.print("Digite a quantidade de dolar: ");
		quantidadeDolar = sc.nextDouble();
		
		valorReais = dolarCot * quantidadeDolar;
		
		System.out.printf("\nvalor correspondente em Reais: %.2fR$", valorReais);
		sc.close();
	}

}
