public class Foguete extends Veiculo{
	private String destino; 
	private int opcao;
	
	public String embarcaViagem () {
		 opcao = Teclado.leInt ("Escolha um destino. Digite 1 para Marte, 2 para Lua e 3 para Saturno:");
		 
		 while (opcao < 1 || opcao > 3) {
			  opcao = Teclado.leInt ("Opção inválida! \nEscolha um destino. Digite 1 para Marte, 2 para Lua e 3 para Saturno:");
		  }
			  
		 switch (opcao) {
		 case 1: 	destino = "Marte";
			 		break;
		 			
		 
		 case 2 : 	destino = "Lua";
		 			break;
		 
		 case 3 : 	destino = "Saturno";
		 			break;
		 }
		 
		 return destino;
	}
	
	public String toString () {
		return new String ("Você está viajando para: " + destino);
	}

}
