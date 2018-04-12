import java.util.Random;

public class Veiculo {
	Random r = new Random();
	
	public Veiculo() {
		x = 0;
        y = 0;
        velocidade = 0;
        fabrica = false;
        cor = null;
	}
	
	public Veiculo(int x, int y, int velocidade, String cor) {
		this.x = x;
		this.y = y;
		this.velocidade = velocidade;
		this.cor = cor;
	}
	
	public int setX() {
		x = r.nextInt(28);
		//System.out.print(x + ",");
		return x;
	}
	
	public int setY() {
		y = r.nextInt(58);
		//System.out.println(y);
		return y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public String getCor() {
		return cor;
	}
	
	
	private int x;
	private int y;
	private int velocidade;
	private boolean fabrica;
	private String cor;
}
