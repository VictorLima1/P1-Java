import java.util.Random;

public class Caminhao extends Veiculo{
	Veiculo v = new Veiculo();
	
	public Caminhao (int x, int y, int velocidade, String cor) {
		super(x, y, velocidade, cor);
	}
	
	public void move(Caminhao d) {
		mov = r.nextInt(4);
		
		if(mov == 0) {
			int x = d.getX();
			x = x + 1;
			if(x >= 30) {
				x = 1;
			}
			d.andaX(x);
		}
		
		if(mov == 1) {
			int x = d.getX();
			x = x - 1;
			if(x <= 0) {
				x = 29;
			}
			d.andaX(x);
		}
		
		if(mov == 2) {
			int y = d.getY();
			y = y + 1;
			if(y >= 60) {
				y = 1;
			}
			d.andaY(y);
		}
		
		if(mov == 3) {
			int y = d.getY();
			y = y - 1;
			if(y <= 0) {
				y = 59;
			}
			d.andaY(y);
		}
	
	}
	
	private int mov;
	private int capacidade_carga;
}
