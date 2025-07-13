import java.util.*;
public class LongestSubstringBruteForce{
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int maxLength = 0;

        for(int i=0;i<n;i++){
            int[] hash = new int[256];
            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)] == 1){
                    break;
                }
                hash[s.charAt(j)] = 1;
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }
     public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}