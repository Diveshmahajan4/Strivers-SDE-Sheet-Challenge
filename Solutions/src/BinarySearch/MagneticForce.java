package BinarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/magnetic-force-between-two-balls/description/
public class MagneticForce {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,1000000000};
        System.out.println(maxDistance(arr, 2));
    }

    public static int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);

        int low = 1;
        int high = position[n-1] - position[0];

        while(low <= high){
            int mid = low + (high -low)/2;
            if(canWePlace(position, mid, m)){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return high;
    }

    public static boolean canWePlace(int[] position, int mid, int m){
        int count = 1;
        int last = position[0];

        for (int i = 1; i < position.length; i++) {
            if(position[i]-last >= mid){
                count++;
                last = position[i];
            }
        }

        return (count >= m);
    }
}
