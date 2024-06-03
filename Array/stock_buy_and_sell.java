package Array;
public class stock_buy_and_sell {
    
    
    public static int maxProfit(int[] prices){

        int minsofar=prices[0];
        int maxsofar=0;

        for(int i=0;i<prices.length;i++){

            minsofar=Math.min(minsofar,prices[i]);
            int profit=prices[i]-minsofar;
            maxsofar=Math.max(profit,maxsofar);
        }
        return maxsofar;
    }




    public static void main(String args[]){

        int[] prices={7,1,5,3,6,4};

        int result=maxProfit(prices);

        System.out.println("profit : " + result);

    }


}
