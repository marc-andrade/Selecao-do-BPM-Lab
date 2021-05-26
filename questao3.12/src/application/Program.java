package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*3.12 N Números da Sequência - v2
		Calcular e exibir a soma dos “N” primeiros valores da sequência abaixo.
		O valor “N” será digitado, deverá ser positivo, mas menor que cinquenta. Caso
		o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor
		novamente. A sequência:
		1/2 + 2/3 + 3/4 + 4/5 + · · ·*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0 ;
		double A=1, B=2,C,sum=0;
		
		System.out.println("O valor de 'N' termos tem que ser um número possitivo e menor que ciquenta.");
		while (n <=0 || n > 50) {
			System.out.print("Digite o valor de 'N': ");
			n = sc.nextInt();
			if (n <=0 || n > 50) {
				System.out.println("Erro: valor inválido, Entre com valor de 'N' novamente.");
			}
		}
			
			System.out.println();
			
			for (int i = 0; i < n ; i ++) {
				System.out.printf("%.0f/%.0f ",A,B);
				if ((i+1) != n ) {
					System.out.print("+ ");
				}
				C = A / B;
				sum += C;
				A ++;
				B++;
			}
			
			System.out.printf("\n\n");
			System.out.printf("A soma dos %d termos da sequência é: %.2f",n,sum);
		
		sc.close();
	}
}
