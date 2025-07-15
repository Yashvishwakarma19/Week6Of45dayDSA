public class singleNumber1{
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 5, 1, 2};
        int n = arr.length;

        int XOR = 0;
        for(int i=0;i<n;i++){
            XOR = XOR ^ arr[i];
        }
        System.out.println("The number which appeared Once is: "+ XOR);
    }
}