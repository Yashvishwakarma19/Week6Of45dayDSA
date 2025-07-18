public class MaxSubarrayPrint {
    public static long maxSubarraySum(int arr[], int n) {
        int sum = 0;
        int maxi = 0;

        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for(int i=0;i<n;i++){
            if(sum == 0){
                start = i;
            }

            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            
            if(sum < 0){
                sum = 0;
            }
        }
        if(maxi > 0 && ansStart != -1){
           System.out.println("Maximum subarray is: ");
           for(int i = ansStart; i<=ansEnd;i++){
            System.out.print(arr[i]+" ");
           }
           System.out.println();
        }else{
            System.out.println("Empty Subarray with sum = 0");
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        System.out.println("Maximum subarray sum is " + maxSubarraySum(arr, n));
    }
}
