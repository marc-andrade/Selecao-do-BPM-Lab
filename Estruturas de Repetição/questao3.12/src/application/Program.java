package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*3.12 N N�meros da Sequ�ncia - v2
		Calcular e exibir a soma dos �N� primeiros valores da sequ�ncia abaixo.
		O valor �N� ser� digitado, dever� ser positivo, mas menor que cinquenta. Caso
		o valor n�o satisfa�a a restri��o, enviar mensagem de erro e solicitar o valor
		novamente. A sequ�ncia:
		1/2 + 2/3 + 3/4 + 4/5 + � � �*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0 ;
		double A=1, B=2,C,sum=0;
		
		System.out.println("O valor de 'N' termos tem que ser um n�mero possitivo e menor que ciquenta.");
		while (n <=0 || n > 50) {
			System.out.print("Digite o valor de 'N': ");
			n = sc.nextInt();
			if (n <=0 || n > 50) {
				System.out.println("Erro: valor inv�lido, Entre com valor de 'N' novamente.");
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
			System.out.printf("A soma dos %d termos da sequ�ncia �: %.2f",n,sum);
		
		sc.close();
	}
}
