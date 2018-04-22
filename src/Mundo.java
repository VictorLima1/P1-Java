import java.util.ArrayList;

public class Mundo {
	/**
	 * Instanciando a classe veículo
	 */
	Veiculo v = new Veiculo();
	/**
	 * Gerando ArrayList de cada um dos veículos
	 */
	ArrayList <Carro> ca = new ArrayList<>();
	ArrayList <Caminhao> da = new ArrayList<>();
	ArrayList <Moto> ma = new ArrayList<>();

	public int mapa[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
	
	/**
	 * Função que gera veículos aleatóriamente
	 */
	public void geraVeiculos() {
		for(int i = 0; i < 10; i++) {
			ca.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
			while (mapa[ca.get(i).getX()][ca.get(i).getY()] == 2) { /**< Verificando se o carro foi gerado onde há uma fábrica, se sim, trocando-o */
				ca.get(i).setX();
				ca.get(i).setY();
			}

			da.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "amarelo", false));
			while (mapa[da.get(i).getX()][da.get(i).getY()] == 2) {
				da.get(i).setX();
				da.get(i).setY();
			}

			ma.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
			while (mapa[ma.get(i).getX()][ma.get(i).getY()] == 2) {
				ma.get(i).setX();
				ma.get(i).setY();
			}
		}		
	}
	
	/**
	 * Função que zera o mapa, acabando com o rastro que ficaria caso o mapa não fosse zerado
	 */
	public void refazMapa() {
		for(int i = 0; i<30; i++) {
			for(int j = 0; j < 60; j++) {
				if(mapa[i][j] != 1 && mapa[i][j] != 2) {
					mapa[i][j] = 0;
				}
			}
		}
		/**
		 * Esse é um comentário a parte, mas que achei legal estar na documentação:
		 * Parte do código que alteraria a situação de um veículo que não está mais em uma fábrica para false
		 * Essa parte foi comentada porém não removida pois faz a quantidade de veículos aumentar ao invés de zerar, como no vídeo de exemplo
		 * Apesar de ser o mais lógico colocar um veículo fora de uma fábrica como false, decidi remover do código final
		 * Removi pois o funcionamento do vídeo de exemplo se asemelha mais com o código funcionando sem essa parte
		 * 
		for(int a = 0; a < ca.size(); a++) {
			int xa = ca.get(a).getX(); 
			int ya = ca.get(a).getY();
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xa && j == ya) {
						if(mapa[i][j] != 2 && ca.get(a).getFabrica() == true) {
							ca.get(a).setFabrica(false);
						}
					}
				}
			}
		}
		
		for(int a = 0; a < da.size(); a++) {
			int xa = da.get(a).getX(); 
			int ya = da.get(a).getY();
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xa && j == ya) {
						if(mapa[i][j] != 2 && da.get(a).getFabrica() == true) {
							da.get(a).setFabrica(false);
						}
					}
				}
			}
		}
		
		for(int a = 0; a < da.size(); a++) {
			int xa = da.get(a).getX(); 
			int ya = da.get(a).getY();
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xa && j == ya) {
						if(mapa[i][j] != 2 && da.get(a).getFabrica() == true) {
							da.get(a).setFabrica(false);
						}
					}
				}
			}
		}
		*/
		/**
		 * Adicionando os novos veículos no mapa
		 */
		for (int a = 0; a < ca.size(); a++) {
			/// Obtendo as corrdenadas do veículo
			int xa = ca.get(a).getX(); 
			int ya = ca.get(a).getY();
			

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xa && j == ya) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2; /// SObrescrevendo 2 caso seja uma fábrica
							
						}
						else {
							mapa[i][j] = 3;
						}
					}
				}
			}
		}
		
		for(int a  = 0; a < da.size(); a++) {
			int ba = da.get(a).getX();
			int ca = da.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == ba && j == ca) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 4;
						}
					}
				}
			}
		}
		
		for(int a = 0; a < ma.size(); a ++) {
			int ea = ma.get(a).getX();
			int fa = ma.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == ea && j == fa) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 5;
						}
					}
				}
			}	
		}
		
	}
	
	/**
	 * Função que desenha o mundo
	 */
	public void desenhaMundo() {
		
		/**
		 * Contadores para exibir quantidade de veículos
		 */
		int carros = 0;
		int motos = 0;
		int caminhoes = 0;
		
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					
					/**
					 * Desenhando o mapa com base no que foi refeito
					 */
					if(mapa[i][j] == 1) {
						System.out.print("\u001b[47m \033[0m");
					}
					else if(mapa[i][j] == 0) {
						System.out.print(" ");
					}
					
					else if(mapa[i][j] == 2) {
						System.out.print("\u001b[42m \033[0m");
					}
					else if(mapa[i][j] == 3){
						System.out.print("\u001b[44m \033[0m");
					}
					else if(mapa[i][j] == 4){
						System.out.print("\u001b[43;1m \033[0m");
					}
					else if(mapa[i][j] == 5){
						System.out.print("\u001b[41m \033[0m");
					}
					
				}
				
				System.out.println("");
			}	
			
			/**
			 * Imprimindo a legenda
			 */
			System.out.print("\u001b[44m \033[0m");
			System.out.print(" Carros   ");
			System.out.print("\u001b[41m \033[0m");
			System.out.print(" Motos   ");
			System.out.print("\u001b[43;1m \033[0m");
			System.out.println(" Caminhões");
			
			/**
			 * Contadores de veículos
			 */
			for(int a = 0; a < ca.size(); a++) {
				carros++;
			}
			for(int a = 0; a < da.size(); a++) {
				caminhoes++;
			}
			for(int a = 0; a < ma.size(); a++) {
				motos++;
			}
			
		
			System.out.println("Número de carros: " + carros);
			System.out.println("Número de caminhões: " + caminhoes);
			System.out.println("Número de motos: " + motos);
	}
	
	/**
	 * Função que atualiza o mundo fazendo os veículos se moverem
	 */
	public void atualizaMundo() {
		for(int i = 0; i < ca.size(); i++) {
			ca.get(i).move(ca.get(i));
		}
		
		for (int i = 0; i < da.size(); i ++) {
			da.get(i).move(da.get(i));
		}
		
		for (int i = 0; i < ma.size(); i ++) {
			ma.get(i).move(ma.get(i));
		}
		
		geraVeiculo();
		detectaColisao();
		refazMapa();
		desenhaMundo();
	}
	
	/**
	 * Função que detecta colisão
	 */
	public void detectaColisao() {
		/// Colisão entre carros apenas
		for (int i = 0; i < ca.size(); i ++) {
			for (int j = 0; j < ca.size(); j++) {
				if(ca.get(j).getX() == ca.get(i).getX() && ca.get(j).getY() == ca.get(i).getY()) {
					if (i == j) { /// Essa parte verifica se o veículo é ele mesmo, e não o remove
						
					}
					else {
						ca.remove(ca.get(i));
					}	
				}
			}
		}
		
		/// Colisão entre caminhões apenas
		for (int i = 0; i < da.size(); i ++) {
			for (int j = 0; j < da.size(); j++) {
				if(da.get(j).getX() == da.get(i).getX() && da.get(j).getY() == da.get(i).getY()) {
					if(i == j) {
						
					}
					else {
						da.remove(da.get(i));
					}	
				}
			}
		}
		
		/// Colisão entre motos apenas
		for (int i = 0; i < ma.size(); i ++) {
			for (int j = 0; j < ma.size(); j++) {
				if(ma.get(j).getX() == ma.get(i).getX() && ma.get(j).getY() == ma.get(i).getY()) {
					if(i == j) {
						
					}
					else {
						ma.remove(ma.get(i));
					}	
				}
			}
		}
		
		/// Colisão entre caminhão e carro
		for(int i = 0; i < da.size(); i++) {
			for (int j = 0; j < ca.size(); j++) {
				if(ca.get(j).getX() == da.get(i).getX() && ca.get(j).getY() == da.get(i).getY()) {
					if(da.size() > ca.size()) {
						
					}
					else {
						ca.remove(ca.get(j));
					}
				}
			}
		}
		
		/// Colisão entre caminhão e moto
		for(int i = 0; i < da.size(); i++) {
			for (int j = 0; j < ma.size(); j++) {
				if(ma.get(j).getX() == da.get(i).getX() && ma.get(j).getY() == da.get(i).getY()) {
					if(da.size() > ma.size()) {
						
					}
					else {
						ma.remove(ma.get(j));
					}
				}
			}
		}
		
		/// Colisão entre carro e moto
		for(int i = 0; i < ca.size(); i++) {
			for (int j = 0; j < ma.size(); j++) {
				if(ma.get(j).getX() == ca.get(i).getX() && ma.get(j).getY() == ca.get(i).getY()) {
					if(ca.size()>ma.size()) {
						
					}
					else {
						ma.remove(ma.get(i));
					}
					
				}
			}
		}
	}
	
	/**
	 * Função que gera um veículo se passarem em fábricas
	 */
	public void geraVeiculo() {
		for(int a = 0; a < ca.size(); a++) {
			int x = ca.get(a).getX();
			int y = ca.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && ca.get(a).getFabrica() == false) {
								ca.get(a).setFabrica(true); /// Já que o veículo passou numa fábrica, ele fica impossibilitado de gerar novamente caso não saia da fabrica
								ca.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
								}
							}
						}
					}
				}
		
		for(int a = 0; a < da.size(); a++) {
			int x = da.get(a).getX();
			int y = da.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && da.get(a).getFabrica() == false) {
								da.get(a).setFabrica(true);
								da.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "verde", false));
								}
							}
						}
					}
				}
		
	
		for(int a = 0; a < ma.size(); a++) {
			int x = ma.get(a).getX();
			int y = ma.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && ma.get(a).getFabrica() == false) {
								ma.get(a).setFabrica(true);
								ma.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
							}
						}
					}
				}
		}
	}
}
	
	
	

	
	
	
