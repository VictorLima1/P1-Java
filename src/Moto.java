import java.util.Random;

public class Moto extends Veiculo{
	Veiculo v = new Veiculo();
	
	public Moto (int x, int y, int velocidade, String cor) {
		super(x, y, velocidade, cor);
	}
	
	public void move(Moto m) {
		mov = r.nextInt(4);
		
		if(mov == 0) {
			int x = m.getX();
			x = x + 3;
			m.andaX(x);
		}
		
		if(mov == 1) {
			int x = m.getX();
			x = x - 3;
			m.andaX(x);
		}
		
		if(mov == 2) {
			int y = m.getY();
			y = y + 3;
			m.andaY(y);
		}
		
		if(mov == 3) {
			int y = m.getY();
			y = y - 3;
			m.andaY(y);
		}
	
	}
	
	private int mov;
	private String tipo;

}
