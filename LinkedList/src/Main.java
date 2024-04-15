import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> al1 = new LinkedList<>(); //You cannot give an initial size to Linkedlist as size will generate after nodes are added

        LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        //LinkedList can utilize all the methods of ArrayList
        al1.add(10); //Adding an element without indexing, it will add it to the last of the list
        al1.add(0, 5); //Adding an element with index
        al1.addAll(1, al2); //addAll method will add all the elements of collection al2 into al1
        al1.add(5, 70);

        al1.contains(50); //contains return a boolean value anf checks if the element/object specified resides in the collection or not
        al1.get(5); //get method takes index as its argument and returns the object at that index
        al1.indexOf(70); //returns the index of the object, returns -1 if the object doesn't exist.
        //let us suppose there are two same object in the collection, how to know the index of second element
        al1.lastIndexOf(70);

        al1.set(6, 100); //replace the value of index with specified object/element



        //New Methods
        al1.addFirst(3);
        al1.addLast(200);

        al1.forEach(n->show(n));
    }
    static void show(int n) {
//        if(n>60)
            System.out.println(n);

    }
}