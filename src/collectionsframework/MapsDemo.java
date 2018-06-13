package collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args){
        // Stores in pair, (key - value) = Entry
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "BMW");
        map.put(6, "Audi");
        map.put(4, "Honda");

        String value1 = map.get(1);
        System.out.println(value1);

        // Keys are unique, value can't be duplicated
        map.put(2, "BMW");
        String value2 = map.get(2);
        System.out.println(value2);

        map.put(4, "Benz");
        String value3 = map.get(4);
        System.out.println(value3);

    }
}
