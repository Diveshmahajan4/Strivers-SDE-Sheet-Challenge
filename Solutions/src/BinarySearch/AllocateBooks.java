package BinarySearch;
// https://www.interviewbit.com/problems/allocate-books/
public class AllocateBooks {
    public static void main(String[] args) {
        int[] arr = {12, 34, 68, 90};
        int B = 2;
        System.out.println(books(arr , B));
    }

    public static int books(int[] A, int B) {
        if(B > A.length) return -1;

        int low = A[0];
        int high = 0;

        for (int j : A) {
            high += j;
            low = Math.min(low, j);
        }

        int res = -1;

        while(low <= high){
            int mid = (low +high) >> 1;

            if(isPossible(A, mid, B)){
                res = mid;
                high = mid -1;
            }else {
                low = mid+1;
            }
        }

        return res;
    }

    public static boolean isPossible(int[] arr, int pages, int students){
        int count = 0;
        int sumAllocated = 0;

        for (int i = 0; i < arr.length; i++) {
            if(sumAllocated + arr[i] > pages){
                count++;
                sumAllocated = arr[i];
                if(sumAllocated > pages) return false;
            }else {
                sumAllocated += arr[i];
            }
        }
        return (count < students);
    }
}  
