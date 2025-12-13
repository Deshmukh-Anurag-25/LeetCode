public class BestTimeBuySellStock{
  public int maxProfit(int[] prices){
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int price : prices){
      minPrice = Math.min(price, minPrice);
      maxProfit = Math.max(maxProfit, price - minPrice);
    }

    return maxProfit;
  }

  public static void main(String[] args){
    BestTimeBuySellStock obj1 = new BestTimeBuySellStock();
    int[] prices = {7, 1, 5, 3, 6, 4};
    System.out.println(obj1.maxProfit(prices));
  }
}
