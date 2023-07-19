package Stack;

import java.util.Arrays;
import java.util.Stack;

// https://www.interviewbit.com/problems/nearest-smaller-element/
public class NearestSmallerElement {
    public static void main(String[] args) {

    }

    // Brute force approach
    public static int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n];
        Arrays.fill(arr1, -1);

        for (int i = 0; i < n; i++) {
            for(int j = i-1; j >= 0; j-- ){
                if(arr[j] < arr[i]){
                    arr1[i] = arr[j];
                }
            }
        }
        return arr1;
    }

    public static int[] prevSmaller1(int[] A) {
        Stack<Integer> st=new Stack<>();
        int n=A.length;
        int nge[]=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&& st.peek()>=A[i])
            {
                st.pop();
            }
            if(i<n)
            {
                if(!st.isEmpty()) nge[i]=st.peek();
                else nge[i]=-1;
            }
            st.push(A[i]);
        }
        return nge;
    }
}
