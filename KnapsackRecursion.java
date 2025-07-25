public class KnapsackRecursion {
    public static int knapsack(int[] wt, int[] val, int W, int n) {
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W)
            return knapsack(wt, val, W, n - 1);
        else
            return Math.max(
                val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1),
                knapsack(wt, val, W, n - 1)
            );
    }

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;
        int n = wt.length;
        System.out.println("Max Value (Recursion): " + knapsack(wt, val, W, n));
    }
}
