package queue;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*1*/
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "st1");
        map.put(2, "st2");
        map.put(3, "st3");
        map.put(4, "st4");
        map.put(5, "st5");
        map.put(6, "st6");
        map.put(7, "st7");
        map.put(8, "st8");
        map.put(9, "st9");
        map.put(10, "st10");

        for(Map.Entry<Integer, String> mapping: map.entrySet()){
            System.out.println(mapping.getKey() + " " + mapping.getValue());
        }

        /*2*/
        ArrayList<String> listArr = new ArrayList<String>();

        listArr.add("Java");
        listArr.add("Python");
        listArr.add("Perl");
        listArr.add("C++");
        listArr.add("Java");
        listArr.add("C++");
        listArr.add("C#");
        System.out.println(listArr);
        ArrayList<String> listArr2 = new ArrayList<>(listArr);
        System.out.println(listArr2);

        /*3*/
        ArrayList<Integer> elem = new ArrayList<Integer>();
        elem.add(1);
        elem.add(2);
        elem.add(3);
        elem.add(5);
        elem.add(4);
        elem.add(3);
        elem.add(2);
        elem.add(1);
        elem.add(2);
        elem.add(3);
        elem.add(5);
        System.out.println(elem);
        for (int i = 0; i < elem.size(); i++) {
            if (countNum(elem, elem.get(i)) == 1) {
                System.out.println("Число 2 повторяется " + Collections.frequency(elem, 2)+ " раза");
            }
        }

    }
    public static int countNum(ArrayList<Integer> NumberArr, Integer number) {
        return Collections.frequency(NumberArr, number);
    }
}
