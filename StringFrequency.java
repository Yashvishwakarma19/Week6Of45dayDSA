import java.util.*;

public class StringFrequency{
    public static void main(String[] args) {
        String str = "hello world";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(ch == ' ') continue;

            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
         // Displaying frequencies
        System.out.println("Character frequencies:");
        for(Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }
    }
}