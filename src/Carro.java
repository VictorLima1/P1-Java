import java.util.Random;

public class Carro extends Veiculo{
	Veiculo v = new Veiculo();
	public Carro (int x, int y, int velocidade, String cor) {
		super(x, y, velocidade, cor);
	}
	
	Random r = new Random();
	
	public int mov;
	
	public void move(Carro c) {
		mov = r.nextInt(4);
		int x = c.getX();
		x = x+2;
		c.andaX(x);
	}
	
	private int num_passageiros;
}
