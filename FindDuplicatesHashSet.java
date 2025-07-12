import java.util.*;
public class FindDuplicatesHashSet{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6, 3};

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        if(duplicate.isEmpty()){
            System.out.println("No Duplicate element present");
        }else{
            System.out.println("Duplicate element is present");
        }
    }
}