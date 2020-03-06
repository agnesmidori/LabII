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
	
	}
}
