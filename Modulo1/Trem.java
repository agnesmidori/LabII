public class Trem extends Veiculo{
	protected int passageiros;
	protected int lugares;
	
	public Trem (int velocidade, int passageiros, int lugares) {
		super.velocidade = 0;
		this.passageiros = passageiros;
		this.lugares = lugares;
	}
	
	public void embarca () {
		int qtdEmbarcando = Teclado.leInt ("A capacidade máxima de embarque é: " + lugares + "\nA quantidade atual é de passageiros é de: " + passageiros + "\nDigite a quantidade que está embarcando:  ");
		while ((passageiros + qtdEmbarcando) > lugares) {
			qtdEmbarcando = Teclado.leInt ("Número de passageiros a embarcar inválido!" + "\nA quantidade atual é de passageiros é de: " + passageiros + "\nA a quantidade de lugares atual é de : " + lugares + "\nDigite a quantidade que está embarcando:  ");
		}
		passageiros = passageiros + qtdEmbarcando;
	}
	
	public void desembarca () {
		int qtdDesembarcando = Teclado.leInt ("Digite a quantidade que está desembarcando: ");
		passageiros = passageiros - qtdDesembarcando;
	}
	
	public String toString () {
		return new String ("Lugares disponiveis: " + lugares + " | " + "Passageiros: " + passageiros);
	}

}
