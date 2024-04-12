package ArraysPractice;

public class BuyAndSellStocks {

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[] {7,6,4,3,1}));

    }

    public static int maxProfit(int[] prices) {

        int leastSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;

        for(int i = 0; i <= prices.length - 1; i++) {

            if(prices[i] < leastSoFar) {

                leastSoFar = prices[i];

            }

            int profitIfSoldToday = prices[i] - leastSoFar;
            if(profitIfSoldToday > overallProfit) {

                overallProfit = profitIfSoldToday;

            }

        }

        return overallProfit;

    }

}