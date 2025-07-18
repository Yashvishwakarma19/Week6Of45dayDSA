public class MaxSubarraySumKadaneAlgo {
    public static long MaxSubarraySumKadaneAlgo(int[] arr, int n){
        long sum = 0;
        long maxi = Long.MIN_VALUE;
        //long maxi = 0;  Change from Long.MIN_VALUE to 0 for empty subarray

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        System.out.println("Maximum subarray sum is " + MaxSubarraySumKadaneAlgo(arr, n));
    }
}
