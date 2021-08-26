package application;

public class Program {

	public static void main(String[] args) {
		/*3.10 Bergamaschi
		Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1,
		1, 1, 3, 5, 9, 17, ...*/
		//a = a + b +c, b = a + b + c, c = a + b + c
		
		int a = 1,b = 1,c =1;
		
		System.out.printf(" %d |",a);        
		System.out.printf(" %d |",b);
		System.out.printf(" %d |",c);
		
		for(int i = 0; i < 17; i++){            
			a = a + b + c ;               
			b = a - b -c;
			c = a -b -c;
			
			System.out.printf(" %d |",a);
			
			}
	}

}
