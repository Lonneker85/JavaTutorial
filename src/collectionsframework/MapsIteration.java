package collectionsframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIteration {
    public static void main(String[] args) {
        // HashMap - Does not maintain order
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "BMW");
        hashMap.put(6, "Audi");
        hashMap.put(4, "Honda");
        hashMap.put(5, "Ferrari");

        System.out.println("EntrySet iteration");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", value: " + value);
        }

        System.out.println("\nKeySet iteration");
        for (Integer key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println("Key: " + key + ", value: " + value);
        }

        // LinkedMap - Maintain the order in which they are added
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "BMW");
        linkedMap.put(6, "Audi");
        linkedMap.put(4, "Honda");
        linkedMap.put(5, "Ferrari");

        System.out.println("\nLinkedMap iteration");
        for (Integer key : linkedMap.keySet()) {
            String value = linkedMap.get(key);
            System.out.println("Key: " + key + ", value: " + value);
        }

        // TreeMap - Natural sorting order
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "BMW");
        treeMap.put(6, "Audi");
        treeMap.put(4, "Honda");
        treeMap.put(5, "Ferrari");

        System.out.println("\nTreeMap iteration");
        for (Integer key : treeMap.keySet()) {
            String value = treeMap.get(key);
            System.out.println("Key: " + key + ", value: " + value);

        }
    }
}
