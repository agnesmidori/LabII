public class Trem extends Veiculo{
	int passageiros;
	int capacidade;
	
	public Trem (int velocidade, int passageiros, int capacidade) {
		super.velocidade = 0;
		this.passageiros = passageiros;
		this.capacidade = capacidade;
	}
	
	public void embarca () {
		int qtdEmbarcando = Teclado.leInt ("A capacidade máxima de embarque é: " + capacidade + "\nA quantidade atual é de passageiros é de: " + passageiros + "\nDigite a quantidade que está embarcando:  ");
		while ((passageiros + qtdEmbarcando) > capacidade) {
			qtdEmbarcando = Teclado.leInt ("Número de passageiros a embarcar inválido!" + "\nA quantidade atual é de passageiros é de: " + passageiros + "\nA capacidade atual é de : " + capacidade + "\nDigite a quantidade que está embarcando:  ");
		}
		passageiros = passageiros + qtdEmbarcando;
	}
	
	public void desembarca () {
		int qtdDesembarcando = Teclado.leInt ("Digite a quantidade que está desembarcando: ");
		passageiros = passageiros - qtdDesembarcando;
	}
	
	public String toString () {
		return new String ("Capacidade: " + capacidade + " | " + "Passageiros: " + passageiros);
	}

}
