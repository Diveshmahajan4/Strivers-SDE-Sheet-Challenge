package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {
    public static void main(String[] args) {

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int start = 0;
        int end = 0;
        int[] ans = new int[nums.length - k + 1];
        int index = 0;

        while(end < nums.length) {

            while(deque.size() > 0 && nums[end] > deque.getLast()) {
                deque.removeLast();
            }

            deque.addLast(nums[end]);

            if(end - start + 1 < k) {
                end++;
            }
            else {

                ans[index++] = deque.getFirst();

                if(nums[start] == deque.getFirst()) {
                    deque.removeFirst();
                }
                start++;
                end++;
            }
        }
        return ans;
    }
}
