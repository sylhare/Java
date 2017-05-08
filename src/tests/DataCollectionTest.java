package tests;

import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Source https://www.javatpoint.com/collections-in-java
 *
 *  Created by sylhare on 2017-05-03.
 */
public class DataCollectionTest {
    public static void main(String args[]) {

        //Map
        Map<Integer, String> map = new HashMap<>();

        //Adding elements to map
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "Z");

        map.remove(102);

        //Traversing Map from 100 to 101 (102 has been suppressed
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        Hashtable<Integer, String> hm = new Hashtable<>();

        hm.put(100, "A");
        hm.put(102, "B");
        hm.put(101, "E");
        hm.put(103, "Z");

        // Will print from 103 to 100
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Creating a Set
        Set<String> set = new HashSet<String>();

        //Adding elements
        set.add("A");
        set.add("B");
        set.add("E");
        set.add("Z");
        //Traversing elements will print from Z to A
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        List<List<String>> l = new ArrayList<>();
        l.add(new ArrayList<>());
        l.get(0).add("a");
        l.get(0).add("b");

        System.out.println(l.get(0).get(1));

        Hashtable<String, ListTest> ht = new Hashtable<>();
        ListTest test_class = new ListTest();
        ht.put("a1", test_class);


    }

}
