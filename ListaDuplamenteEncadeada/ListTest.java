

public class ListTest {

   public static void main( String args[] ) {
      ListaOrdenada list = new ListaOrdenada();  // create the List container

      // insert references to objects in list
      list.insert("banana");
      list.print();
      list.insert("maçã");
      list.print();
      list.insert("banana");
      list.print();
      list.insert("abacate");
      list.print();
      list.insert("pera");
      list.print();
      list.insert("goiaba");
      list.print();
      list.insert("laranja");
      list.print();
      list.insert("manga");
      list.print();
      list.insert("uva");
      list.print();
      list.insert("banana");
      list.print();
      list.insert("mexerica");
      list.print();
      list.insert("abacate");
      list.print();
      list.insert("jaboticaba");
      list.print();
      list.insert("mamão");
      list.print();
      list.insert("melão");
      list.print();
      
      list.printAscending();
      System.out.println(" ");
      list.printDescending();
   

   }
} // end class ListTest

