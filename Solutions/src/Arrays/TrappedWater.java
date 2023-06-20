package Arrays;
// https://leetcode.com/problems/trapping-rain-water/
public class TrappedWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr2 ={4,2,3};
        System.out.println(trap2(arr2));
    }

    public static int trap(int[] arr) {
        int n = arr.length;
        int peakValue = arr[0];
        int peak = 0;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if(arr[i] >= peakValue){
                count += countWater(arr, peak, i);
                peak = i;
                peakValue = arr[i];
            }
        }
        int newPeakValue = arr[n-1];
        int newPeak = n-1;
        for (int i = n-2; i >= peak ; i--) {
            if(arr[i] >= newPeakValue){
                count += countWater2(arr, newPeak, i);
                newPeak = i;
                newPeakValue = arr[i];
            }
        }

        return count;
    }

    public static int countWater(int[] arr, int peak, int i){
        int count = 0;
        for (int j = peak+1; j < i; j++) {
            count += arr[j];
        }

        int totalSpace = Math.min(arr[peak] , arr[i])*(i-peak-1);
        return totalSpace-count;
    }

    public static int countWater2(int[] arr, int peak, int i){
        int count = 0;
        for (int j = i+1; j < peak; j++) {
            count += arr[j];
        }

        int totalSpace = Math.min(arr[peak] , arr[i])*(peak-i-1);
        return totalSpace-count;
    }


    // Optimal Approach
    public static int trap2(int[] height){
        int n = height.length;
        int left = 0, right = n-1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;

        while(left <= right){
            if (height[left] <= height[right]) {
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }else{
                    res += maxLeft - height[left];
                }
                left++;
            }else{
                if(height[right] > maxRight) {
                    maxRight = height[right];
                }else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }
}
