import java.util.Random;

public class Carro extends Veiculo{
	Veiculo v = new Veiculo();
	
	public Carro (int x, int y, int velocidade, String cor) {
		super(x, y, velocidade, cor);
	}
	
	Random r = new Random();
	
	public void move(Carro c) {
		mov = r.nextInt(4);
		
		if(mov == 0) {
			int x = c.getX();
			x = x + 2;
			if(x >= 30) {
				x = 1;
			}
			c.andaX(x);
		}
		
		if(mov == 1) {
			int x = c.getX();
			x = x - 2;
			if(x <= 0) {
				x = 29;
			}
			c.andaX(x);
		}
		
		if(mov == 2) {
			int y = c.getY();
			y = y + 2;
			if(y >= 60) {
				y = 1;
			}
			c.andaY(y);
		}
		
		if(mov == 3) {
			int y = c.getY();
			y = y - 2;
			if(y <= 0) {
				y = 59;
			}
			c.andaY(y);
		}
		
	}

	public int getMov() {
		return mov;
	}
	
	private int num_passageiros;
	private int mov;
}
