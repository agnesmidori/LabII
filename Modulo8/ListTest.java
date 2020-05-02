public class ListTest {

    public static void main(String[] args) {
        // Testando metodo - public boolean troca_ter_quarto()
        List list = new List();  // create the List container
        // Populando a lista
        list.insertAtFront(6);
        list.insertAtBack(2);
        list.insertAtBack(4);
        list.insertAtBack(3);
        list.print();
        list.troca_ter_quarto();
        list.print();
        //Testando metodo - public boolean remove_impar()
        list.remove_impar();
        list.print();

    }

}
