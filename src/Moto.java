/**
 * Moto
 * Classe que gera um veículo do tipo Moto
 * 
 * @author Victor
 * 
 * @see Veiculo
 */
import java.util.Random;

public class Moto extends Veiculo{
	Veiculo v = new Veiculo();
	
	/**
	 * Construtor da classe Moto, que usa um super para chamar o construtor da classe Veículo
	 * 
	 * @see Veiculo
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	
	public Moto (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
	
	/**
	 * Random utilizado para gerar movimentos aleatórios
	 */
	Random r = new Random();
	
	/**
	 * Função que movimenta a moto, recebendo um objeto da própria classe como parâmetro
	 * @param m
	 */
	public void move(Moto m) {
		mov = r.nextInt(4); /// Gerando um número aleatório para movimentação do veículo em 4 direções possíveis
		
		
		/**
		 * Ifs para verificação do resultado obtido no random
		 */
		if(mov == 0) {
			int x = m.getX();
			x = x + 3;
			m.andaX(verificaX(x));
		}
		
		if(mov == 1) {
			int x = m.getX();
			x = x - 3;
			m.andaX(verificaX(x));
		}
		
		if(mov == 2) {
			int y = m.getY();
			y = y + 3;
			m.andaY(verificaY(y));
		}
		
		if(mov == 3) {
			int y = m.getY();
			y = y - 3;
			m.andaY(verificaY(y));
		}
	
	}
	

	/**
	 * Função que verifica se a moto chegou ao limite do mapa em X e reseta a coordenada
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
	 * Função que verifica se a moto chegou ao limite do mapa em Y e reseta a coordenada
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
	private String tipo; // Não entendi muito bem essa variável, portanto não a utilizei

}
