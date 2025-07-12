import java.util.*;
public class HashMapPractice{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 120);
        map.put("Banana", 60);
        map.put("Orange", 80);
        map.put("Cherry", 50);

        System.out.println(map);
        System.out.println();

        // get(key)
        System.out.println("Price of Apple is: " + map.get("Apple"));
        System.out.println("Price of oranges is: "+ map.get("Orange"));
        System.out.println();

        //remove key and value
        map.remove("Cherry");
        System.out.println(map);
        System.out.println();

        //Contain or not
        System.out.println("Contains Mango? : "+ map.containsKey("Mango"));
        System.out.println("Contains Apple? : "+ map.containsKey("Apple"));
        System.out.println();

        // size()
        System.out.println("Size of the map is: "+ map.size());
        System.out.println();

        //empty or not
        System.out.println("Is map empty??: "+ map.isEmpty());
        System.out.println();

        //iterate through the map
        System.out.print("Iterating through keys: ");
        for(String key : map.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();

         // Iterate through values only
        System.out.print("\nIterating values: ");
        for(int value : map.values()){
            System.out.print(value+" ");
        }
        System.out.println();

        // Iterate through key-value pairs (entrySet)
        System.out.println("\nIterating key-value pairs:");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
         }

    }
}