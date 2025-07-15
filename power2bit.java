public class power2bit{
    public static void main(String[] args) {
        int n = 16;
        if((n & (n-1)) == 0){
            System.out.println("Power of 2 digit");
        }else{
            System.out.println("Not power of 2 Digit");
        }

        int m = 18;
        if((m & (m-1)) == 0){
            System.out.println("Power of 2 digit");
        }else{
            System.out.println("Not power of 2 Digit");
        }
    }
}