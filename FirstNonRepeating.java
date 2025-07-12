import java.util.HashMap;

public class FirstNonRepeating{
    public static void main(String[] args) {
        String str = "Yash Vishwakarma";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char ch : str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0) + 1);
        }

        boolean found = false;
        for(char ch : str.toCharArray()){
            if(ch == ' ') continue;
            if(freqMap.get(ch) == 1){
                System.out.println("First Not repeating character found, that is : "+ ch);
                found = true;
                break;
            }
        }
         if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}