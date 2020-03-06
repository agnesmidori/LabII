public class Main {

	public static void main(String[] args) {
		// Instanciando a classe Onibus
		Onibus onibus1 = new Onibus();
		onibus1.embarca (10);
		onibus1.acelera(40);
		System.out.println(onibus1.toString());
		
		// Instanciando a classe Foguete
		Foguete foguete1 = new Foguete (); 
		foguete1.embarcaViagem();
		System.out.println(foguete1.toString());
		
		// Teste 
		Veiculo veiculo = new Onibus ();
		veiculo.acelera(80);
		((Onibus)veiculo).embarca(50);
		System.out.println(veiculo.toString());		
		((Onibus)veiculo).desembarca(30);
		veiculo.freia(80);
		System.out.println(veiculo.toString());		
	
	}
}
