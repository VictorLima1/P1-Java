import java.util.Random;

public class Moto extends Veiculo{
	Veiculo v = new Veiculo();
	
	public Moto (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
	
	public void move(Moto m) {
		mov = r.nextInt(4);
		
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
	
	private int mov;
	private String tipo;

}
