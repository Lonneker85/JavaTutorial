package collectionsframework;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {

        // HashSet - Does not maintain order
        Set<String> set = new HashSet<>();

        set.add("BMW");
        set.add("Audi");
        set.add("Honda");
        set.add("Honda");

        System.out.println("HashSet: -> random order");
        //System.out.println(set);

        for (String item : set){
          System.out.println(item);
        }

        // LinkedHashSet = It maintains the order in which the elements are added
        Set<String> lHSet = new LinkedHashSet<>();
        lHSet.add("BMW");
        lHSet.add("Audi");
        lHSet.add("Honda");
        System.out.println("\nLinkedHashSet: -> order in which it's added");
        for (String item : lHSet) {
            System.out.println(item);
        }

        // TreeSet - It maintains the natural sorting 1, 2, 3... a, b, c,
        Set<String> tSet = new TreeSet<>();
        tSet.add("BMW");
        tSet.add("Audi");
        tSet.add("Honda");
        System.out.println("\nTreeSet: -> alphabetical");
            for (String item : tSet){
                System.out.println(item);
            }

        List<String> list = new ArrayList<>();

        list.add("BMW");
        list.add("Audi");
        list.add("Honda");
        list.add("Honda");

        System.out.println("\nArrayList:");
        System.out.println(list);

    }
}
