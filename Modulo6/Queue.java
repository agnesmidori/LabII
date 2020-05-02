public class Queue {
	protected int first = 0, last = -1;

	protected Object q[];

	public Queue(int size) {
		q = new Object[size];
	}

	public boolean isEmpty() {
		if (last == first - 1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (last == q.length - 1)
			return true;
		return false;
	}

	/* Insert the element in the final of this queue */
	public void enqueue(Object element) throws OverflowException {
		if (isFull()) {
			throw new OverflowException();
		} else {
			last++;
			q[last] = element;
		}
	}

	/* Retrives and remove the first element of this queue */
	public Object dequeue() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			Object o = q[first];
			q[first] = null;
			first++;
			return o;
		}
	}
	

	// Questao 2
	public Queue makeQueueFromStack(Stack s) throws UnderflowException, OverflowException {
		Queue queuedStack = new Queue (q.length);
		s = s.reverse();
        while (!s.isEmpty()) {                    
        	queuedStack.enqueue(s.pop());
        }

        return queuedStack;                          
	}
	
	// Método extra para verificar o resultado
	public void imprimeQueue(){
        for(int i=0; i<q.length;i++)
                        System.out.println(+i+" - "+q[i]);
}

	public static void main(String args[]) throws UnderflowException, OverflowException {
		Queue q = new Queue(5);
		System.out.println("Vazia=" + q.isEmpty());
		try {
			q.enqueue("1");
			q.enqueue("2");
			q.enqueue("3");
			q.enqueue("4");
		} catch (OverflowException e) {
			System.out.println(e.toString());
		}
		Stack s = new Stack(5);
		try {
			s.push("1");
			s.push("2");
			s.push("3");
			s.push("4");
			s.push("5");
		} catch (OverflowException e) {
			System.out.println(e.toString());
		}
		
		Queue fila = new Queue(5);
		s.imprimeStack();
		fila.makeQueueFromStack(s).imprimeQueue();
		
		}
}
