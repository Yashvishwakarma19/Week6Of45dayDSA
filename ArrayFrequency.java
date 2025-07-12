import java.util.*;
public class ArrayFrequency{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 1, 4, 3, 2};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
         System.out.println("Number frequencies:");
         for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            System.out.print(entry.getKey()+" -> "+ entry.getValue());
            System.out.println();
         }
    }
}