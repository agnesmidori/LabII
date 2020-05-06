public class ListTest {

    public static void main(String[] args) {
        // Testando metodo - public boolean troca_ter_quarto()
        List list = new List();  // create the List container
        // Populando a lista
        list.insertAtFront(2);
        list.insertAtBack(2);
        list.insertAtBack(4);
        list.insertAtBack(3);
        list.insertAtBack(5);
        list.print();
        boolean teste = list.troca_ter_quarto();
        if (teste == true) System.out.println("True\n");
        else if (teste == false) System.out.println("False\n");
        list.print();
        //Testando metodo - public boolean remove_impar()
        list.remove_impar();
        list.print();
    }
}
