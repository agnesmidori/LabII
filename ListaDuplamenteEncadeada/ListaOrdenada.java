
public class ListaOrdenada {

	private Node firstNode;
	private Node lastNode;
	private String name;  // string like "list" used in printing

	// construct empty List with "list" as the name
	public ListaOrdenada() { 
		this( "lista" ); 
	}  

	// construct an empty List with a name
	public ListaOrdenada( String listName ) {
		name = listName;
		firstNode = lastNode = null;
	}

	public Node getFirst(){
		return firstNode;
	}

	public Node getLast(){
		return lastNode;
	}

	// insert Object at front of List
	public  void insertAtFront( Object insertItem ) {
		Node n = new Node( insertItem);
		if ( isEmpty() ) // firstNode and lastNode refer to same object
			firstNode = lastNode = n;

		else {
			firstNode.setPrevious (n);
			n.setNext(firstNode);
			firstNode = n;
		}
	}

	// insert Object at end of List
	public  void insertAtBack( Object insertItem ) {
		Node n = new Node( insertItem); 
		if ( isEmpty() ) // firstNode and lastNode refer to same Object
			firstNode = lastNode = n;

		else {
			lastNode.setNext (n);
			n.setPrevious(lastNode);
			lastNode = n;
		}
	}

	// determine whether list is empty
	public boolean isEmpty() { 
		return firstNode == null; // return true if List is empty
	}

	// output List contents
	public  void print() {
		if ( isEmpty() ) {
			System.out.println( "Empty " + name );
			return;
		}

		System.out.print( "The " + name + " is: " );
		Node current = firstNode;

		// while not at end of list, output current node's data
		while ( current != null ) {
			System.out.print( current.getData().toString() + " " );
			current = current.getNext();
		}

		System.out.println( "\n" );
	}
// Resolucao da Tarefa
// Metodo insere String de forma que a lista fique sempre ordenada.
public void insert(String s) {
		Node current = firstNode;
		Node insereS = new Node (s);

		// Se a lista estiver vazia, insere s.
		if (isEmpty()) firstNode = lastNode = insereS;
		else {
			if (s.compareTo((String)current.getData()) < 0) {
				if (current == firstNode && s.compareTo((String)current.getData()) < 0) {
					firstNode.setPrevious(insereS);
					insereS.setNext(firstNode);
					firstNode = insereS;
				}
				else {
					while (current != null) {
						if (s.compareTo((String)current.getData()) < 0) {
							insereS.setNext(current);
							insereS.setPrevious(current.getPrevious());
							current.setPrevious(insereS);
							current.getPrevious().setNext(insereS);
							break;
						}
						current = current.getNext();
					} 
				}
			}
			else if (s.compareTo((String)current.getData()) > 0) {
				current = lastNode;
				if (current == lastNode && s.compareTo((String)lastNode.getData()) > 0) {
					lastNode.setNext(insereS);
					insereS.setPrevious(lastNode);
					lastNode = insereS;
				}
				else {
					while (current != null) {
						if (s.compareTo((String)current.getData()) > 0) {
							insereS.setNext(current.getNext());
							insereS.setPrevious(current);
							current.getNext().setPrevious(insereS);
							current.setNext(insereS);
							break;
						} 
						current = current.getPrevious();
					}

				}
			}
		}
	}
  // Metodo imprime do menor para o maior
	public void printAscending() {
		Node current = firstNode;
		
		if (isEmpty()) System.out.println ("Nada para exibir por aqui ;)");
		else {
			System.out.print("{ ");
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
			System.out.print("}");
		}
	}
	// Metodo imprime do maior para o menor
	public void printDescending() {
		Node current = lastNode;
				
		if (isEmpty()) System.out.println ("Nada para exibir por aqui ;)");
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
