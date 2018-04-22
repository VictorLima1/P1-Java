/**
 * Veículo
 * Classe que gera um veículo do tipo Carro
 * 
 * @author Victor
 * 
 * @see Veiculo
 */
import java.util.Random;

public class Veiculo {
	
	Random r = new Random(); /// Função random, utilizada para gerar posições aleatórias
	
	/**
	 * Construtor da classe Veículo
	 * Incializa as váriaveis de veículo
	 */
	public Veiculo() {
		x = 0; 
        y = 0; 
        velocidade = 0; 
        fabrica = false; 
        cor = null; 
	}
	
	/**
	 * Construtor da classe Veículo
	 * Cria veículos com variáveis que são recebidas na chamada das funções de cada veículo específico
	 * 
	 * @param x 
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
	public Veiculo(int x, int y, int velocidade, String cor, boolean fabrica) {
		this.x = x;
		this.y = y;
		this.velocidade = velocidade;
		this.cor = cor;
		this.fabrica = fabrica;
	}
	
	/**
	 * Cria um valor aleatório para o X do veículo
	 * 
	 * @return O valor aleatório gerado para X
	 */
	public int setX() {
		x = r.nextInt(28);
		return x;
		
	}
	
	/**
	 * Altera o valor de X de um veículo com base no que será passado dentro de cada veículo específico
	 * 
	 * @param x
	 */
	public void andaX(int x) {
		this.x = x;
	}
	
	/**
	 * Altera o valor de Y de um veículo com base no que será passado dentro de cada veículo específico
	 * 
	 * @param y
	 */
	public void andaY(int y) {
		this.y = y;
	}
	
	/**
	 * Cria um valor aleatório para o Y do veículo
	 * 
	 * @return O valor aleatório gerado para Y
	 */
	public int setY() {
		y = r.nextInt(58);
		return y;
	}
	
	/**
	 * @return O valor de X do veículo
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @return O valor de Y do veículo
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * @return A velocidade do veículo
	 */
	public int getVelocidade() {
		return velocidade;
	}
	
	/**
	 * @return A cor do veículo
	 */
	public String getCor() {
		return cor;
	}
	
	/**
	 * Define se um veículo está ou não dentro de uma fábrica, com base no que é recebido em status
	 * 
	 * @param status 
	 */
	public void setFabrica(boolean status) {
		fabrica = status;
	}
	
	/**
	 * @return Se um veículo está ou não em uma fábrica
	 */
	public boolean getFabrica() {
		return fabrica;
	}
	
	private int x; /// Coordenada X do veículo
	private int y; /// Coordenada Y do veículo
	private int velocidade; /// Velocidade do veículo
	private boolean fabrica; /// Informa se o veículo está ou não em uma fábrica
	private String cor; /// Cor do veículo
}
