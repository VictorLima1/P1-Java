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
	
	public Veiculo(int x, int y, int velocidade, String cor, boolean fabrica) {
		this.x = x;
		this.y = y;
		this.velocidade = velocidade;
		this.cor = cor;
		this.fabrica = fabrica;
	}
	
	public int setX() {
		x = r.nextInt(28);
		//System.out.print(x + ",");
		return x;
	}
	
	public void setXNovamente(int x) {
		this.x = x;
	}
	
	public void andaX(int x) {
		this.x = x;
	}
	
	public void andaY(int y) {
		this.y = y;
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
	
	public void setFabrica(boolean status) {
		fabrica = status;
	}
	
	public boolean getFabrica() {
		return fabrica;
	}
	
	private int x;
	private int y;
	private int velocidade;
	private boolean fabrica;
	private String cor;
}
