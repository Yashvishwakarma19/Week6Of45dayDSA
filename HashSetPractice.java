import java.util.*;

public class HashSetPractice {
    public static void main(String[] args) {
        // Creating HashSet
        HashSet<String> set = new HashSet<>();
        
        // add(element)
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Apple"); // Duplicate, will not be added

        // Displaying HashSet (no duplicates, no order guarantee)
        System.out.println("HashSet: " + set);

        // remove(element)
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // contains(element)
        System.out.println("Contains Mango? " + set.contains("Mango")); // true
        System.out.println("Contains Banana? " + set.contains("Banana")); // false

        // size()
        System.out.println("Size of set: " + set.size());

        // isEmpty()
        System.out.println("Is set empty? " + set.isEmpty());

        // Iterating through HashSet
        System.out.println("\nIterating through HashSet:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
