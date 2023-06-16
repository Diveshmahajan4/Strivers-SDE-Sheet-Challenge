package Arrays;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeToBuy(arr));
    }

    public static int bestTimeToBuy(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            profit = arr[i] - min;
            max = Math.max(profit, max);
        }
        return max;
    }
}
