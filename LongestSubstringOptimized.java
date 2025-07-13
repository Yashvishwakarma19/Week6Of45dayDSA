import java.util.*;

public class LongestSubstringOptimized{
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        int[] hash = new int[256];

        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            hash[ch]++;
    
        while(hash[ch] > 1){
            hash[s.charAt(left)]--;
            left++;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }
        return maxLength;
    }
     public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}