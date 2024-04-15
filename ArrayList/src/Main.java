import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10); //Adding an element without indexing, it will add it to the last of the list
        al1.add(0, 5); //Adding an element with index
        al1.addAll(1, al2); //addAll method will add all the elements of collection al2 into al1
        al1.add(5, 70);

        al1.contains(50); //contains return a boolean value anf checks if the element/object specified resides int he collection or not
        al1.get(5); //get method takes index as its argument and returns the object at that index
        al1.indexOf(70); //returns the index of the object, returns -1 if the object doesn't exist.
        //let us suppose there are two same object in the collection, how to know the index of second element
        al1.lastIndexOf(70);

        al1.set(6, 100); //replace the value of index with specified object/element

        //Iteration | Accessing all the elements one by one
        //For loop
        for(int i =0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }

        //For each loop
        for(Integer x:al1) {
            System.out.println(x);
        }

        //Iterator Using While loop
        Iterator<Integer> it = al1.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        //ListIterator using While loop
        ListIterator<Integer> it2 = al1.listIterator();
        while(it2.hasNext()) {
            System.out.println(it2.next());
        }

        //Using for loop
        for(ListIterator<Integer> it3 = al1.listIterator(); it3.hasNext();) {
            System.out.println(it3.next());
        }

        //Lambda Expression
        al1.forEach(n -> System.out.println(n));

        al1.forEach(System.out::println);

        al1.forEach(n -> show(n));
        System.out.println(al1);
    }
    static void show(int n) {
        if(n>60) {
            System.out.println(n);
        }
    }
}