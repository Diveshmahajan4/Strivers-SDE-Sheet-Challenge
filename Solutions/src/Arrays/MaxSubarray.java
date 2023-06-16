package Arrays;

public class MaxSubarray {
    public static void main(String[] args) {

    }

    public static long maxSubarray(int[] arr, int n){
        if (n == 0) {
            return 0;
        }
        long maxSum = arr[0];
        long currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        if(maxSum<=0){
            return 0;
        }
        return maxSum;
    }
}
