/**
 * Carro
 * Classe que gera um veículo do tipo Carro
 * 
 * @author Victor
 * 
 * @see Veiculo
 */
import java.util.Random;

public class Carro extends Veiculo{
	Veiculo v = new Veiculo();
	
	/**
	 * Construtor da classe Carro, que usa um super para chamar o construtor da classe Veículo
	 * 
	 * @see Veiculo
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Carro (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
	
	/**
	 * Random utilizado para gerar movimentos aleatórios
	 */
	Random r = new Random();
	
	/**
	 * Função que movimenta o carro, recebendo um objeto da própria classe como parâmetro
	 * @param c
	 */
	public void move(Carro c) {
		mov = r.nextInt(4); ///< Gerando um número aleatório para movimentação do veículo em 4 direções possíveis
		
		/**
		 * Ifs para verificação do resultado obtido no random
		 */
		if(mov == 0) {
			int x = c.getX(); ///< Obtendo o valor atual de X
			x = x + 2; ///< Somando 2 (por ser a velocidade do carro) no valor atual de X
			c.andaX(verificaX(x)); ///< Chamando a função andaX da classe Veículo para realizar a movimentação
		}
		
		/**
		 * Tudo se repete, da mesma forma que o if acima
		 */
		if(mov == 1) {
			int x = c.getX();
			x = x - 2;
			c.andaX(verificaX(x));
		}
		
		if(mov == 2) {
			int y = c.getY();
			y = y + 2;
			c.andaY(verificaY(y));
		}
		
		if(mov == 3) {
			int y = c.getY();
			y = y - 2;
			c.andaY(verificaY(y));
		}
		
	}
	
	/**
	 * Função que verifica se o carro chegou ao limite do mapa em X e reseta a coordenada
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
	 * Função que verifica se o carro chegou ao limite do mapa em Y e reseta a coordenada
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

	
	private int num_passageiros; /// Variável que guarda a quantidade de passageiros de um carro
	private int mov; /// Variável de movimentação 
}
