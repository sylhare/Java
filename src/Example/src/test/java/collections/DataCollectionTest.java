package collections;


import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * Source https://www.javatpoint.com/collections-in-java
 */
public class DataCollectionTest {
    public static void main(String[] args) {

        exMap();
        exHashTable();
        exHashSet();
        exCollection();
        ex2DList();

    }

    /**
     * exemple of use of hashtable
     */
    public static void exHashTable() {
        //Hashtable
        Hashtable<String, ListTest> ht = new Hashtable<>();
        ListTest test_class = new ListTest();
        ht.put("a1", test_class);
        ht.put("a2", test_class);
        ht.put("a3", test_class);

        System.out.print("\nHashtable Elements");
        System.out.print("\t" + ht + "\n");

        Hashtable<Integer, String> hm = new Hashtable<>();

        hm.put(100, "A");
        hm.put(102, "B");
        hm.put(101, "E");
        hm.put(103, "Z");

        // Will print from 103 to 100
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    /**
     * exemple of use of map
     */
    public static void exMap() {
        //Map
        Map<String, String> map = new HashMap<>();
        map.put("AAAA", "0000");
        map.put("BBBB", "1111");
        map.put("CCCC", "2222");

        System.out.print("\nMap Elementts");
        System.out.print("\t" + map);

        //Adding elements to map
        map.put("100", "A");
        map.put("101", "B");
        map.put("102", "Z");

        map.remove(102);

        //Traversing Map from 100 to 101 (102 has been suppressed
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    /**
     * exemple of use of hashSet
     */
    public static void exHashSet() {
        System.out.println("\nHashSet Elements");

        //Creating a HashSet
        HashSet<String> hset = new HashSet<String>();

        //Adding elements
        hset.add("A");
        hset.add("B");
        hset.add("E");
        hset.add("Z");
        hset.add(null);
        hset.add(null);

        //Traversing elements will print from Z to A
        for (String s : hset) {
            System.out.println(s);
        }
    }

    /**
     * exemple of use of collection
     */
    public static void exCollection() {
        System.out.println("\nCollections");

        //Collections
        List<Double> temp = new ArrayList<>();
        Collections.fill(temp, 0.0);
        temp.add(40.5);
        temp.add(33.9);
        temp.add(37.8);
        temp.add(15.3);
        temp.add(25.6);

        if (Collections.binarySearch(temp, 40.5) >= 0) {
            Collections.replaceAll(temp, 40.5, 0.0);
            System.out.print("Temperature found and replaced by 0.0");
        } else {
            System.out.print("Temperature not found.");
        }

        // Sorting List in ascending order according to the natural ordering
        Collections.sort(temp);
        System.out.printf("Sorted List: %s%n", temp);

        //Shuffles the list
        Collections.shuffle(temp);
        System.out.println(new StringBuilder().append("Shuffled List: ").append(temp));

        //Reverse the list
        Collections.reverse(temp);
        System.out.println(MessageFormat.format("Reversed List: {0}", temp));

        Double max = Collections.max(temp);
        Double min = Collections.min(temp);
        System.out.printf("Maximum temperature: %s Minimum temperature: %s%n", max, min);
    }

    /**
     * exemple of use 2D list array.
     */
    public static void ex2DList() {
        System.out.println("\n2D List with ArrayList");

        //2D List with ArrayList
        List<List<String>> l = new ArrayList<>();
        l.add(new ArrayList<>());
        l.get(0).add("a");
        l.get(0).add("b");

        System.out.print("ArrayList Elements");
        System.out.println(l.get(0).get(1));
    }

}
