package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variáveis
		// t = número de pessoas que acessaram o 3 site, entrada via input do usuário 
		//site2= segundo site da lista de pesquisa, site2 = t*2
		//site1= primeiro site da lista de pesquisa, site1 = site2*2
		
		int t=0,site2,site1;
		
		while (t <=0 || t > 100) {
			System.out.print("Digite a quantidade de acessos do 3° site: ");
			t = sc.nextInt();
			if (t <=0 || t > 100) {
				System.out.printf("Erro, informe o valor novamente.\n");
			}
		}
		
		//formúla lógica do site 2
		site2 = t * 2;
		//formúla lógica do site 1
		site1 = site2*2;
		
		System.out.println(site1);
		
		
		sc.close();
	}

}
