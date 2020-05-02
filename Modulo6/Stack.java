public class Stack {
	private Object s[];

	private int top = -1;

	public Stack(int size) {
		s = new Object[size];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (top == s.length - 1)
			return true;
		return false;
	}

	public void push(Object obj) throws OverflowException {
		if (!isFull()) {
			s[++top] = obj;
		} else
			throw new OverflowException();
	}

	public Object pop() throws UnderflowException {
		if (!isEmpty()) {
			Object o = s[top];
			s[top] = null;
			top--;
			return o;
		} else
			throw new UnderflowException();

	}
	
	// Questao 1
	public Stack reverse() throws UnderflowException,OverflowException {
        Stack reversedStack = new Stack(s.length);
        for(int i = top; i > -1; i--) {
        	reversedStack.push(s[i]);
        }
        
        return reversedStack;
    }
	
	// Método extra para verificar o resultado
	public void imprimeStack(){
		System.out.print("[");
        for(int i=0; i<=top;i++){
                        System.out.print(s[i] + " ");
        }
        System.out.print("]\n");
    }
			
	public static void main(String args[]) throws OverflowException, UnderflowException {
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
				
		s.reverse().imprimeStack();
	}

	
}
