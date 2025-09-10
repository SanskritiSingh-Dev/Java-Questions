//You are given an array prices where prices[i] is the price of a given stock on the ith day.You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


public class stockBuySell {

    public static  int maxProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE; // Initialize buy price to maximum value
        int maxProfit = 0; // Initialize maximum profit to 0
        for(int  i = 0; i< prices.length; i++){
            if(buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; //this is today's profit
                maxProfit = Math.max(maxProfit, profit); // Update maximum profit if current profit is greater
            } 
            else {
                buyPrice = prices[i]; // Update buy price if current price is lower
            }
        }
        return maxProfit; // Return the maximum profit found
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4}; // Example prices array
        System.out.println("Maximum profit is: " + maxProfit(prices));
    }
    
}
