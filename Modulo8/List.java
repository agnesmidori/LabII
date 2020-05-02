public class List {
    private Node firstNode;   
    private Node lastNode;
    private String name;  // string like "list" used in printing

    // construct empty List with "list" as the name
    public List() { 
        this( "list" ); 
    }  

    // construct an empty List with a name
    public List( String listName ) {
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
        if ( isEmpty() ) // firstNode and lastNode refer to same object
            firstNode = lastNode = new Node( insertItem );

        else // firstNode refers to new node
            firstNode = new Node( insertItem, firstNode );
    }

    // insert Object at end of List
    public  void insertAtBack( Object insertItem ) {
        if ( isEmpty() ) // firstNode and lastNode refer to same Object
            firstNode = lastNode = new Node( insertItem );

        else {// lastNode's nextNode refers to new node
            lastNode.setNext (new Node( insertItem ));
            lastNode = lastNode.getNext();
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
       
    // remove first node from List
    public  Object removeFromFront() {
        if ( isEmpty() ); // throw exception if List is empty
        Object removedItem = firstNode.getData(); // retrieve data being removed

        // update references firstNode and lastNode 
        if ( firstNode == lastNode )
            firstNode = lastNode = null;
        else
            firstNode = firstNode.getNext();
        return removedItem; // return removed node data
    } // end method removeFromFront

    // remove last node from List
    public  Object removeFromBack() {
        if ( isEmpty() ); // throw exception if List is empty
        Object removedItem = lastNode.getData(); // retrieve data being removed
        // update references firstNode and lastNode
        if ( firstNode == lastNode )
            firstNode = lastNode = null;
        else { // locate new last node
            Node current = firstNode;
        // loop while current node does not refer to lastNode
        while ( current.getNext() != lastNode )
            current = current.getNext();
            lastNode = current; // current is new lastNode
            current.setNext(null);
        }
        return removedItem; // return removed node data
    } // end method removeFromBack
	   
    public boolean remove(Object o) { 
        if (isEmpty())//se lista estiver vazia 
            return false; 
        if (firstNode.getData().equals(o)){ //se for o primeiro 
            removeFromFront(); 
            return true; 
        } else if (lastNode.getData().equals(o)){ //se for o último 
            removeFromBack(); 
            return true;
        } 
        //se for um nodo interno 
        Node tmp = firstNode; //procura elemento 
        Node ant = firstNode; 
        while (tmp != null && !tmp.getData().equals(o)){ 
            ant = tmp; 
            tmp = tmp.getNext(); 
        } 
        if (tmp == null)//se não encontrou 
            return false; 
        else 
            ant.setNext(tmp.getNext()); 
        return true; 
    }   
	   
    // Tarefa
    public boolean troca_ter_quarto() {
        Node current = firstNode;
        Object thirdNode = null; 
        Object fourthNode;
        Node troca;
        int cont = 1;
        if (isEmpty()) return false; 
        if (firstNode == lastNode) return false;
        while (current.getNext() != null) {
            cont++;
            current = current.getNext();
        }
        if (cont >= 4) {
            cont = 1;
            current = firstNode;
            while (current.getNext() != null) {
                cont++;
                current = current.getNext();
                if (cont == 3) {
                    thirdNode = current.getData();
                    troca = current.getNext();
                    fourthNode = troca.getData();
                    current.setData(fourthNode);
                }
                if (cont == 4) {
                    current.setData(thirdNode);
                    return true; 
                }
            }
        }
        return false;
    }
           
    public boolean remove_impar() {
        Node current = firstNode;
        Object elemento;
        boolean encontrou = false;
        if (isEmpty()) return false; 
        if (firstNode == lastNode) {
            if ((Integer)current.getData() %2 != 0) {
                elemento = current.getData();
                this.remove(elemento);
                return true;
            }
            else return false;
        } 
        if ((Integer)current.getData() % 2 != 0) {
            elemento = current.getData();
            this.remove(elemento);
            return true;
        }
        while (current.getNext() != null && encontrou == false) {
            current = current.getNext();
            if((Integer)current.getData()%2 != 0) {
                encontrou = true;
                elemento = current.getData();
                this.remove(elemento);
                return true;
            }
        }
        return false;
    }
}
