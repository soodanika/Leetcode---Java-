class BuySell{
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};

        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            profit = Math.max(profit, (prices[i]-buy));
        }
        System.out.println(profit);
    }
}