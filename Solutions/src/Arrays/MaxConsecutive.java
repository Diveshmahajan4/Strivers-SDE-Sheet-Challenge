package Arrays;
// https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutive {
    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int count = 0, max = 0;

        for(int i =0 ;i< n; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }

        }
        return max;
    }
}
