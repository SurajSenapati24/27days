public class BuyandSellStock {
    public static int solution(int prices[]){
        int profit=0;
        int minimum=prices[0];
        for(int i=1;i<prices.length;i++){
            int curr=prices[i];
            if (minimum<curr) {
                profit=Math.max(profit, curr-minimum);
            }
            else minimum=prices[i];
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(solution(arr));
    }
}
