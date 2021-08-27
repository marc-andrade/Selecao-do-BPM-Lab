package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*4.6 Maiores de 18 - v1
		Armazenar o nome, sexo e idade de 20 pessoas. Consistir as entradas
		no sentido de aceitar apenas “F” ou “M” para o sexo e valores positivos para
		a idade. Após a digitação, exibir os dados (nome, sexo e idade) de todas as
		pessoas com idade superior a 18 anos. Ao final da lista, exibir a quantidade
		de pessoas listadas.*/
		
		Scanner sc = new Scanner(System.in);

		String nome[] = new String[20];
		char sexo[] = new char[20];
		int idade[] = new int[20], count=0;
		

		for (int i = 0; i < idade.length; i++) {
			
			System.out.printf("-- %d° Pessoa --\n",i+1);
			System.out.print("Digite o Nome: ");
			nome[i] = sc.nextLine();
			do {
				System.out.print("Digite o sexo (F/M): ");
				sexo[i] = sc.next().charAt(0);
				
				if (sexo[i] != 'F' && sexo[i] != 'M') {
					System.out.println("Erro: Sexo inválido, Digite novamente.");
				}
			} while (sexo[i] != 'F' && sexo[i] != 'M');

			do {
				System.out.print("Digite a idade: ");
				idade[i] = sc.nextInt();
				if(idade[i] < 0) {
					System.out.println("Erro: Idade inválida, Idade tem que ser um valor possitvo, Digite novamente.");
				}
			} while (idade[i] < 0);
		
			System.out.println();
			sc.nextLine();
		}
		
		System.out.println("======Listagem====== ");
		
		for (int i=0; i< idade.length; i++) {
			if (idade[i] >=18) {
				System.out.printf("-- %d° Pessoa --\n",i+1);
				System.out.println("Nome: "+nome[i]);
				System.out.println("Sexo: "+sexo[i]);
				System.out.println("Idade: "+idade[i]);
				System.out.println();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Não existem pessoas com idade maior que 18 anos.");
		}
		
		System.out.println("A quantidade de pessoas listadas foram: "+count+".");
		
		sc.close();

	}

}
