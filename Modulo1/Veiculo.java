public class Veiculo {
	protected int velocidade;
	
	public void acelera (int incremento) {
		velocidade = velocidade + incremento;
	}
	
	public void freia (int decremento) {
		velocidade = velocidade - decremento;
	}
	
	public String toString () {
		return new String ("Velocidade: " + velocidade);
	}
}
