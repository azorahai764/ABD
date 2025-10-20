package ABD.xam.treemap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Mango");
        map.put(5, "Grapes");
        map.put(4, "Orange");

        // Displaying the TreeMap
        System.out.println("TreeMap (Sorted by keys):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " => Value: " + entry.getValue());
        }
    }
}