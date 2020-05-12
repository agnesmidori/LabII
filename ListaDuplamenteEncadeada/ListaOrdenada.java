public class ListaOrdenada {
	
	String listaO = "ListaOrdenada";
	private List umaLO = new List ("listaO");
	
	// Metodos solicitados na tarefa do modulo 10
	// Metodo insere String em uma lista de forma ordenada
	public void insert(String s) {
		Node current = umaLO.getFirst();
		Node insereS = new Node (s);
		
		// Se a lista estiver vazia, insere s.
		if (umaLO.isEmpty()) umaLO.insertAtFront(s);
		else {
			// Se é menor que o primeiro node, insere antes.
			if (s.compareTo((String)umaLO.getFirst().getData()) < 0) {
				umaLO.insertAtFront(s);
			}
			// Se é maior que o último node, insere depois.
			else if (s.compareTo((String)umaLO.getLast().getData()) > 0) {
				umaLO.insertAtBack(s);
			}
			/* Caso contrario, procura na lista elemento maior, 
				quando encontrar insere antes dele. */ 
			else {
				while (current != null) {
					if (s.compareTo((String)current.getData()) < 0) {
						current.getPrevious().setNext(insereS);
						insereS.setPrevious(current.getPrevious());
						insereS.setNext(current);
						current.setPrevious(insereS);
						break;
					}
					current= current.getNext();
				}
			}
		}
		umaLO.print();
	}
	// Exibe a lista em ordem crescente
	public void printAscending() {
		Node current = umaLO.getFirst();

		if (umaLO.isEmpty()) System.out.println ("Nada para exibir por aqui ;)");
		else {
			System.out.print("{ ");
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
			System.out.print("}");
		}
	}
	// Exibe a lista em ordem decrescente
	public void printDescending() {
		Node current = umaLO.getLast();

		if (umaLO.isEmpty()) System.out.println ("Nada para exibir por aqui ;)");
		else {
			System.out.print("{ ");
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getPrevious();
			}
		}
		System.out.print("}");
	}

}
