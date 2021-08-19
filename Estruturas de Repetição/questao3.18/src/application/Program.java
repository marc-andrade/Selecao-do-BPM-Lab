package application;

public class Program {

	public static void main(String[] args) {
		
		/*3.18 Mega Sena
		O jogo da mega-sena consiste em acertar seis dos sessenta números
		disponíveis em um volante. Fazer um programa para calcular a quantidade de
		jogos que temos que fazer, para com certeza acertar o resultado da mega sena.
		Admitindo que faremos jogos de seis números por volante, o programa deverá
		exibir quais seriam estes números em cada volante, ou seja, exibir todos os
		resultados possíveis.*/
		
		// A variável count server para armazenar a quantidade de jogos
		// As variáveis numero1,numero2,numero3,numero4,numero5,numero6 são respectivamente as parcelas de cada jogo
		 int count = 0,numero1,numero2,numero3,numero4,numero5,numero6;
		
		 System.out.println("todos os resultados possíveis para acertar na mega sena:");
		 
		for (numero1 = 1; numero1 <= 60; numero1++) {
			
				for(numero2 = 2; numero2 <= 60; numero2++) {
				
						for (numero3=3; numero3 <=60; numero3++) {
						
								for ( numero4 = 4; numero4 <=60;numero4++) {
									
										for ( numero5 = 5; numero5 <= 60;numero5++) {
							
												for ( numero6 = 6; numero6 <= 60; numero6++) {
											
													if (numero1 < numero2 && numero2<numero3 && numero3<numero4 && numero4<numero5 && numero5<numero6) {
													System.out.println(numero1+" "+numero2+" "+numero3+ " "+numero4+" "+numero5+" "+numero6);
													count ++;
											}
												}
											}
										}
									}
								}
							}
							
		System.out.println("A quantidade de jogos para com certeza ganhar na mega sena é: "+count);
	}
}
