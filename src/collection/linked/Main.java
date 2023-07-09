package collection.linked;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> array = new CustomLinkedList<>();
        array.add(4);
        array.add(7);
        array.add(18);
        array.add(32);

       // array.addFirst(5);

       // System.out.println(array.size());
       // System.out.println(array.get(0));

       // array.delete(0);

        array.addFirst(20);
        for (int i =0; i<array.size(); i ++){
            System.out.println(array.get(i));
        }
        System.out.println("First Element :" + array.getFirst());

        System.out.println("First Element :" + array.getLast());


      //  LinkedList<String> linkedList = new LinkedList<>();
    }
}