public class countSetBits{
    public static int cntSetBits(int n){
        int cnt = 0;
        while(n>0){
            if((n & 1) == 1) cnt++;
            n = n/2;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 13;
        int result = cntSetBits(n);
        System.out.println(result);

         int m = 33;
        int result1 = cntSetBits(m);
        System.out.println(result1);
    }
}