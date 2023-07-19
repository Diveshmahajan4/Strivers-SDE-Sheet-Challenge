package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {

    }

    public static void sortStack(Stack<Integer> st) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        Collections.sort(list);
        for(int x : list){
            st.push(x);
        }
    }
}
