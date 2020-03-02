public class Main {

	public static void main(String[] args) {
		// Instanciando tipo Veiculo
		Veiculo veiculo1 = new Veiculo();
		//Chamando método acelera
		veiculo1.acelera(180);
		veiculo1.freia(50);
		System.out.println(veiculo1.toString());
		
		
		Onibus onibus1 = new Onibus();
		onibus1.embarca (10);
		onibus1.acelera(40);
		System.out.println(onibus1.toString());
		
		Trem trem1 = new Trem (0, 0, 600); 
		trem1.embarca();
		trem1.desembarca();
		System.out.println(trem1.toString());
		
	}
}
