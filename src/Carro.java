import java.util.ArrayList;
import java.util.Random;

public class Carro extends Veiculo{
	Veiculo v = new Veiculo();
	//ArrayList <Carro> ca = new ArrayList<>();
	
	public Carro (int x, int y, int velocidade, String cor) {
		super(x, y, velocidade, cor);
	}
	
	Random r = new Random();
	
	public void move(Carro c) {
		mov = r.nextInt(4);
		
		if(mov == 0) {
			int x = c.getX();
			x = x + 2;
			c.andaX(verificaX(x));
		}
		
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
	
	public int verificaX(int x) {
		if (x >= 29) {
			x = 1;
		}
		if(x <= 0) {
			x = 28;
		}
		return x;
	}
	
	public int verificaY(int y) {
		if (y >= 59) {
			y = 1;
		}
		if(y <= 0) {
			y = 58;
		}
		return y;
	}

	
	private int num_passageiros;
	private int mov;
}
