package Arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}
