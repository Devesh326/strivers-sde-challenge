package Day_1;

import java.util.ArrayList;

public class Buy_Sell_Stock {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int n = prices.size();

        int aux[] = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = n-1; i >= 0; i--) {
            if(prices.get(i) > max)
                max = prices.get(i);

            aux[i] = max;
        }

        max = 0;
        for (int i = 0; i < n; i++) {
            int diff = aux[i] - prices.get(i);

            if(diff > max)
                max = diff;
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(2);
        prices.add(100);
        prices.add(150);
        prices.add(120);
        System.out.println(maximumProfit(prices));
    }
}
