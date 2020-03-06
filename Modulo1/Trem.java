public class Trem extends Veiculo {
	
	private String destino = null; 
	
	public String embarcaViagem () {
		if (destino == null) 
			destino = Teclado.leString ("Digite um destino:");
		
		return destino;
	}
	
	public String toString () {
		return new String ("Você está embarcando para: " + destino);
	}

}
