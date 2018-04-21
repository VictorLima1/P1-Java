import java.util.Random;

public class Caminhao extends Veiculo{
	Veiculo v = new Veiculo();
	
	public Caminhao (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
	
	public void move(Caminhao d) {
		mov = r.nextInt(4);
		
		if(mov == 0) {
			int x = d.getX();
			x = x + 1;
			d.andaX(verificaX(x));
		}
		
		if(mov == 1) {
			int x = d.getX();
			x = x - 1;
			d.andaX(verificaX(x));
		}
		
		if(mov == 2) {
			int y = d.getY();
			y = y + 1;
			d.andaY(verificaY(y));
		}
		
		if(mov == 3) {
			int y = d.getY();
			y = y - 1;
			d.andaY(verificaY(y));
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
	private int capacidade_carga;
}
