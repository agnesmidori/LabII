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
        System.out.println(list.troca_ter_quarto());
        list.print();
        //Testando metodo - public boolean remove_impar()
        System.out.println(list.remove_impar());
        list.print();
    }
}
