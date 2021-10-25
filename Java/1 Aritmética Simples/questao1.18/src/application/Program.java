package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*1.18 Compra e Troco
		Entrar via teclado com o valor de cinco produtos. Após as entradas,
		digitar um valor referente ao pagamento da somatória destes valores. Calcular
		e exibir o troco que deverá ser devolvido.*/
		
		Scanner sc = new Scanner(System.in);
		// sum = soma dos produtos
		double produtos,pagamento,troco,sum = 0;
		
		for (int i = 1; i <= 5 ; i++) {
			System.out.printf("Digite o valor do %d° produto: ",i);
			produtos = sc.nextDouble();
			sum += produtos;
		}
		produtos = sum;
		System.out.println();
		System.out.print("Digite o valor do pagamento do cliente: ");
		pagamento = sc.nextDouble();
		troco = pagamento - produtos;
		
		System.out.println();
		System.out.printf("O troco do cliente é: %.2f",troco);
		sc.close();
	}

}
