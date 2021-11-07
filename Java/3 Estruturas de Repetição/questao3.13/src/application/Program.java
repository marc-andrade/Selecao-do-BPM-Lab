package application;

import java.util.Scanner;


public class Program {
	
	public static int entrada(int n) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O valor de 'N' termos tem que ser um número possitivo e menor que ciquenta.");
		while (n <= 0 || n > 50) {
			System.out.print("Digite o valor de 'N': ");
			n = sc.nextInt();
			if (n <= 0 || n > 50) {
				System.out.println("Erro: valor inválido, Entre com valor de 'N' novamente.");
			}
		}
		
		sc.close();
		return n;
	}

	public static void main(String[] args) {

		/*3.13 N Números da Sequência - v3
		Calcular e exibir a soma dos “N” primeiros valores da sequência abaixo.
		O valor “N” será digitado, deverá ser positivo, mas menor que cinquenta. Caso
		o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor
		novamente. A sequência:
		
		2, 5/8, 10/27, 17/64, · · · */
		
		int n = 0;
		double A = 1, B=2 ,C=1,aux =3,calculo, sum = 0;
		
		n = Program.entrada(n);
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			//formula denominador
			C = Math.pow(A, 3);
			
			System.out.printf("%.0f/%.0f ",B,C);
			if ((i+1) != n ) {
				System.out.print("+ ");
			}
			//resultado da divisao
			calculo = (B/C);
			//calculo do numerador
			B += aux;
			aux += 2;
			// fim do calculo
			//soma dos valores
			sum += calculo;
			//contador 
			A++;
		}
		
		System.out.printf("\n\n");
		System.out.printf("A soma dos %d termos da sequência é: %.6f", n, sum);
		
	}

}