package tests;


import java.text.MessageFormat;
import java.util.*;

/**
 * Source https://www.javatpoint.com/collections-in-java
 *
 *  Created by sylhare on 2017-05-03.
 */
public class DataCollectionTest {
    public static void main(String args[]) {

        //Map
        Map<String, String> map = new HashMap<>();
        map.put("AAAA", "0000");
        map.put("BBBB", "1111");
        map.put("CCCC", "2222");
        System.out.print("Map Elementts");
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

        Hashtable<Integer, String> hm = new Hashtable<>();

        hm.put(100, "A");
        hm.put(102, "B");
        hm.put(101, "E");
        hm.put(103, "Z");

        // Will print from 103 to 100
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

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
        Iterator<String> itr = hset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //2D List with ArrayList
        List<List<String>> l = new ArrayList<>();
        l.add(new ArrayList<>());
        l.get(0).add("a");
        l.get(0).add("b");

        System.out.print("ArrayList Elements");
        System.out.println(l.get(0).get(1));

        //Hashtable
        Hashtable<String, ListTest> ht = new Hashtable<>();
        ListTest test_class = new ListTest();
        ht.put("a1", test_class);
        ht.put("a2", test_class);
        ht.put("a3", test_class);

        System.out.print("Hashtable Elements");
        System.out.print("\t" + ht.toString() + "\n");

        //Collections
        List<Double> temp = new ArrayList<>();
        Collections.fill(temp, 0.0);
        temp.add(40.5);
        temp.add(33.9);
        temp.add(37.8);
        temp.add(15.3);
        temp.add(25.6);

        if(Collections.binarySearch(temp, 40.5) >=0){
            Collections.replaceAll(temp, 40.5, 0.0);
            System.out.print("Temperature found and replaced by 0.0");
        }
        else{
            System.out.print("Temperature not found.");
        }

        // Sorting List in ascending order according to the natural ordering
        Collections.sort(temp);
        System.out.printf("Sorted List: %s%n", temp);

        //Shuffles the list
        Collections.shuffle(temp);
        System.out.println(new StringBuilder().append("Shuffled List: ").append(temp).toString());

        //Reverse the list
        Collections.reverse(temp);
        System.out.println(MessageFormat.format("Reversed List: {0}", temp));

        Double max = Collections.max(temp);
        Double min = Collections.min(temp);
        System.out.printf("Maximum temperature: %s Minimum temperature: %s%n", max, min);

    }

}
