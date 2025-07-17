import java.util.Scanner;

public class iterativeFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            int prev2 = 0;
            int prev = 1;
            int curr = 0;

            for (int i = 2; i <= n; i++) {
                curr = prev2 + prev;
                prev2 = prev;
                prev = curr;
            }
            System.out.println(curr);
        }
        sc.close();
    }
}
