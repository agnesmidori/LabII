public class Onibus extends Veiculo {
	protected int qtdPassageiros;
	protected final int capacidade = 50;
	
	public boolean embarca (int n) {
		if ((qtdPassageiros + n) <=capacidade) {
			qtdPassageiros = qtdPassageiros + n;
			return true;
		} 
		else {
			return false;
		}
	}
		
	public boolean desembarca (int n) {
		if ((qtdPassageiros - n) >= 0) {
			qtdPassageiros = qtdPassageiros - n;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String toString () {
		return (super.toString() + " Passageiros: " + qtdPassageiros);
	}
}
