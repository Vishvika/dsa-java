package array;

public class StockBuySell {
    static int maxProfit(int[] prices){
        int res =0;
        int minSoFar = prices[0];

        for(int i=0; i<prices.length; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
