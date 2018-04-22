import java.util.Random;

/**
 * Caminhão
 * Classe que gera um veículo do tipo Caminhão
 * 
 * @author Victor
 * 
 * @see Veiculo
 */

public class Caminhao extends Veiculo{
	Veiculo v = new Veiculo();
	
	/**
	 * Construtor da classe Caminhão, que usa um super para chamar o construtor da classe Veículo
	 * 
	 * @see Veiculo
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Caminhao (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
	
	/**
	 * Random utilizado para gerar movimentos aleatórios
	 */
	Random r = new Random();
	
	/**
	 * Função que movimenta o caminhão, recebendo um objeto da própria classe como parâmetro
	 * @param d
	 */
	public void move(Caminhao d) {
		mov = r.nextInt(4); /// Gerando um número aleatório para movimentação do veículo em 4 direções possíveis
		
		/**
		 * Ifs para verificação do resultado obtido no random
		 */
		if(mov == 0) {
			int x = d.getX();
			x = x + 1;
			d.andaX(verificaX(x));
		}
		
		if(mov == 1) {
			int x = d.getX();
			x = x - 1;
			d.andaX(verificaX(x));
		}
		
		if(mov == 2) {
			int y = d.getY();
			y = y + 1;
			d.andaY(verificaY(y));
		}
		
		if(mov == 3) {
			int y = d.getY();
			y = y - 1;
			d.andaY(verificaY(y));
		}
	
	}

	/**
	 * Função que verifica se ao caminhão chegou ao limite do mapa em X e reseta a coordenada
	 * @param x
	 * @return
	 */
	public int verificaX(int x) {
		if (x >= 29) {
			x = 1;
		}
		if(x <= 0) {
			x = 28;
		}
		return x;
	}
	
	/**
	 * Função que verifica se o caminhão chegou ao limite do mapa em Y e reseta a coordenada
	 * @param y
	 * @return
	 */
	public int verificaY(int y) {
		if (y >= 59) {
			y = 1;
		}
		if(y <= 0) {
			y = 58;
		}
		return y;
	}
	
	private int mov; /// Variável de movimentação 
	private int capacidade_carga; // Não utilizada
}
