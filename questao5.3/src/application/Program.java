package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*5.3 Tomadas
		 * 
		A Olimpíada Internacional de Informática (IOI, no original em inglês)
		é a mais prestigiada competição de programação para alunos de ensino médio;
		seus aproximadamente 300 competidores se reúnem em um país diferente todo
		ano para os dois dias de prova da competição. Naturalmente, os competidores
		usam o tempo livre para acessar a Internet, programar e jogar em seus no-
		tebooks, mas eles se depararam com um problema: o saguão do hotel só tem
		uma tomada.

		Felizmente, os quatro competidores da equipe brasileira da IOI trouxe-
		ram cada um uma régua de tomadas, permitindo assim ligar vários notebooks
		em uma tomada só; eles também podem ligar uma régua em outra para au-
		mentar ainda mais o número de tomadas disponíveis. No entanto, como as
		réguas têm muitas tomadas, eles pediram para você escrever um programa
		que, dado o número de tomadas em cada régua, determina quantas tomadas
		podem ser disponibilizadas no saguão do hotel.
		
		5.3.1 Entrada
		
		A entrada consiste de uma linha com quatro inteiros positivos T1, T2,
		T3, T4, indicando o número de tomadas de cada uma das quatro réguas.

		5.3.2 Saída

		Seu programa deve imprimir uma única linha contendo um único nú-
		mero inteiro, indicando o número máximo de notebooks que podem ser conec-
		tados num mesmo instante.

		5.3.3 Restrições
		1 ≤ Ti ≤ 6
		5.3.4 Exemplos
		Entrada Saída
		2 4 3 2 | 8
		6 6 6 6 | 21
		2 2 2 2 | 5 */
		
		Scanner sc = new Scanner(System.in);
		
		int T[] = new int [4],sum = 0;
		
		for(int i=0; i<T.length; i++) {
			while (T[i] <= 0 || T[i] > 6) {
				System.out.printf("Digite o número de tomadas da %d° régua: ",i+1);
				T[i] = sc.nextInt();
				//sum serve para somar os valores do vetor
				sum += T[i];
				// condicional para exibir mensagem de erro.
				if (T[i] <= 0 || T[i] > 6) {
					System.out.println("Erro: valor inválido, informe valor de 1 a 6 novamente.");
				}
			}
		}
		
		System.out.println();
		//valor descontado de cada régua ligada em outra direto na impressão 
		System.out.println(sum-3);
		sc.close();
	}

}
