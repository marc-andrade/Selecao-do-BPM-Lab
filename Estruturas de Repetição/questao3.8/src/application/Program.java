package application;

public class Program {

	public static void main(String[] args) {
		/*3.8 Soma de 1 a 100
		Exibir a soma dos números inteiros positivos do intervalo de um a cem.*/
		
		
		int s = 0;
		
		for (int i = 1; i<=100; i++) {
			s += i;
		}
		
		System.out.println("O valor da soma é: "+s);
		

	}

}
