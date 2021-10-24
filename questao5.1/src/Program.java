import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro();
		String posicao,jogador1,jogador2;
		int valida =0, jogadas =0;
		
		System.out.print("Digite o nome do jogador 1: ");
		jogador1 = sc.nextLine();
		System.out.print("Digite o nome do jogador 2: ");
		jogador2 = sc.nextLine();
		
		while(true) {
			System.out.println("====== JOGO DA VELHA ======");
			System.out.println();
			tab.mostrar();
			System.out.println();
			
			do {
				System.out.print("Jogador 1:"+jogador1+", informe a jogada: ");
				posicao = sc.next();
				while (!tab.validar(posicao)) {
					System.out.println("Jogada inválida, tente novamente.");
					System.out.print("Jogador 1:"+jogador1+", informe a jogada: ");
					posicao = sc.next();
					valida = 0;
				}
				tab.jogada(posicao, "X");
				valida = 1;
			}while(valida ==0);
			
			jogadas++;
			valida = 0;
			System.out.println();
			tab.mostrar();
			System.out.println();
			if(!tab.ganhador(jogadas, jogador1, jogador2).equals("null")) {
				break;
			}
			
			do {
				System.out.print("Jogador 2:"+jogador2+", informe a jogada: ");
				posicao = sc.next();
				while (!tab.validar(posicao)) {
					System.out.println("Jogada inválida, tente novamente.");
					System.out.print("Jogador 1:"+jogador2+", informe a jogada: ");
					posicao = sc.next();
					valida = 0;
				}
				tab.jogada(posicao, "O");
				valida = 1;
			}while(valida ==0);
			
			jogadas++;
			valida = 0;
			if(!tab.ganhador(jogadas, jogador1, jogador2).equals("null")) {
				break;
			}
		}
		System.out.println(tab.ganhador(jogadas, jogador1, jogador2));
		
	}
}