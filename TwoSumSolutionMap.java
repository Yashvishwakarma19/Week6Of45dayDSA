import java.util.HashMap;

public class TwoSumSolutionMap{
    public static int[]  twoSum(int[] nums, int target){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int num = nums[i];
            int neededMore = target - num;

            if(map.containsKey(neededMore)){
                return new int[] { map.get(neededMore), i };
            }
            map.put(num,i);
        }
        return new int[] { -1, -1 }; // if no solution found
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices of two numbers adding up to target: " + result[0] + ", " + result[1]);

    }
}