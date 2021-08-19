package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*3.17 Fatorial

		Calcular o fatorial de um valor que será digitado. Este valor não po-
		derá ser negativo. Enviar mensagem de erro e solicitar o valor novamente,

		se necessário. Perguntar se o usuário deseja ou não fazer um novo cálculo,
		consistir a resposta em “S” ou “N”.
		N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1))
		Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120*/
		
		Scanner sc = new Scanner(System.in);
		
		String resp;
		
		//Laço/Estrutura para continuar com o programa
		do {
			
			
		int n=0,fatorial=1;
		
		
		//Laço para aceitar os valores determinados fatorial
		do {
			System.out.print("Digite o valor que deseja calcular o fatorial: ");
			n = sc.nextInt();
			
			// condicional para exibir mensagem de erro.
			if (n < 0 ) {
				System.out.println("Erro: valor tem quer ser possitivo.");
			}
		}while(n < 0);
		
		//Laço para calcular o fatorial
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		
		System.out.println("O valor do fatorial é = "+fatorial);
		
		// Laço para 
		do {
			System.out.println();
			System.out.print("Digite novamente S/N: ");
			resp = sc.next();
			
			//Condicional de erro
			if(!resp.equals("S") && !resp.equals("N") && !resp.equals("s") && !resp.equals("n")) {
				System.out.println("Erro: Valor invalido");
			}
			//Se a respostar for diferente de S/N e s/n não ira sair do laço de resposta
		}while(!resp.equals("S") && !resp.equals("N") && !resp.equals("s") && !resp.equals("n"));
		System.out.println();
		//Laço para continuar o programa
		}while(resp.equals("S") || resp.equals("s"));
		
		
		sc.close();
	}

}
