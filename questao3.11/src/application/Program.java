package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*3.11 N Números da Sequência - v1
		Calcular e exibir a soma dos “N” primeiros valores da sequência abaixo.
		O valor “N” será digitado, deverá ser positivo, mas menor que cem. Caso o
		valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor
		novamente. A sequência:
		2, 5, 10, 17, 26, ....*/

		Scanner sc = new Scanner(System.in);
		
		int n=0;
		int A=2,B=3,sum=0;
		
		System.out.println("O Número do termo 'N' tem que ser possitivo e menor que 100.");
		
		while(n <= 0 || n > 100) {
			
			System.out.print("Digite o valor de 'N': ");
			n = sc.nextInt();
			System.out.println();
			
			if (n <= 0 || n >100) {
				System.out.println("Erro: Valor inválido,Entre com valor novamente.");
			}
		}
			System.out.println("A  de número até 'N' são: ");
			for (int i=0; i<n; i++) {
				
				System.out.printf( "%d |",A);
				//sum = variável responsável pela soma das sequência
				sum += A;
				A+=B;
				B+=2;
					
			}
			
			System.out.printf("\n\n");
			System.out.printf("A soma dos %d termos da sequência é = %d",n,sum);
			
		sc.close();
	}

}
