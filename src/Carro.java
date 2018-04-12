import java.util.Random;

public class Carro extends Veiculo{
	public Carro (int x, int y, int velocidade, String cor) {
		super(x, y, velocidade, cor);
	}
	
	Random r = new Random();
	
	public int mov = r.nextInt(4);
	
	public void move() {
		if(mov == 0) {
			
		}
	}
	
	private int num_passageiros;
}
