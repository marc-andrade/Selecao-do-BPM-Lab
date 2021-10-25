
public class Tabuleiro {

	private String tabuleiro[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

	public void setarPosicao() {
		tabuleiro[0][0]= "1";
		tabuleiro[0][1]= "2";
		tabuleiro[0][2]= "3";
		tabuleiro[1][0]= "4";
		tabuleiro[1][1]= "5";
		tabuleiro[1][2]= "6";
		tabuleiro[2][0]= "7";
		tabuleiro[2][1]= "8";
		tabuleiro[2][2]= "9";
	}
	
	
	public String mostrar() {
		for (int line = 0; line < 3; line++) {
			for (int column=0; column<3 ; column++) {
				System.out.print("  "+tabuleiro[line][column]+"  |");
			}
			System.out.println();
		}
		return null;
	}
	
	public boolean validar(String p) {
		
		for (int line = 0; line < 3; line++) {
			for (int column=0; column<3 ; column++) {
				if (tabuleiro[line][column].equals(p)) {
					return true;
			}
			
		}
		
	}
		return false;
		
	}
	
	public void jogada(String p, String j) {
		if (p.equals("1")) {
			tabuleiro[0][0] = j;
		}
		else if (p.equals("2")) {
			tabuleiro[0][1] = j;
		}
		else if (p.equals("3")) {
			tabuleiro[0][2] = j;
		}
		else if (p.equals("4")) {
			tabuleiro[1][0] = j;
		}
		else if (p.equals("5")) {
			tabuleiro[1][1] = j;
		}
		else if (p.equals("6")) {
			tabuleiro[1][2] = j;
		}
		else if (p.equals("7")) {
			tabuleiro[2][0] = j;
		}
		else if (p.equals("8")) {
			tabuleiro[2][1] = j;
		}
		else if (p.equals("9")) {
			tabuleiro[2][2] = j;
		}
	}
	
	public String ganhador(int jogadas, String jogador1, String jogador2) {
		String [] T = new String [8];
		String vencedor = "null";
		
		if (jogadas == 9) {
			vencedor = "PARTIDA EMPATADA!!";
		}
		
		T[0] = tabuleiro[0][0]+ tabuleiro[0][1] + tabuleiro[0][2];
		T[1] = tabuleiro[1][0]+ tabuleiro[1][1] + tabuleiro[1][2];
		T[2] = tabuleiro[2][0]+ tabuleiro[2][1] + tabuleiro[2][2];
		
		T[3] = tabuleiro[0][0]+ tabuleiro[1][0] + tabuleiro[2][0];
		T[4] = tabuleiro[0][1]+ tabuleiro[1][1] + tabuleiro[2][1];
		T[5] = tabuleiro[0][2]+ tabuleiro[1][2] + tabuleiro[2][2];
		
		T[6] = tabuleiro[0][0]+ tabuleiro[1][1] + tabuleiro[2][2];
		T[7] = tabuleiro[0][2]+ tabuleiro[1][1] + tabuleiro[2][0];
		
		for (int i =0; i<T.length;i++) {
			
			if(T[i].equals("XXX")) {
				vencedor = "O Jogador 1:" +jogador1+ " venceu!!" ;
			}
			else if (T[i].equals("OOO")) {
				vencedor = "Jogador 2 :"+jogador2+ " venceu!!" ;
			}
		}
		
		return vencedor;
	}
}
