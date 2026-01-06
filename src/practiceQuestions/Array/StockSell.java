package practiceQuestions.Array;

public class StockSell {
    public static void main(String[] args) {
        int[] prices={7,6,4,3,1};
        System.out.println(maxProfit(prices));


    }
     static int maxProfit(int[] prices) {
        int bprice=prices[0];
        int Sprice=0;
        for(int price:prices){
            bprice=Math.min(bprice,price);
            Sprice=Math.max(Sprice,price-bprice);
        }
        return Sprice;


    }
}
