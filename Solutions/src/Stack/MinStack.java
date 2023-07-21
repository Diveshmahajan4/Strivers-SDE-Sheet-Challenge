package Stack;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class MinStack {
    private Stack<Integer> st;
    private Map<Integer, Integer> mp;

    public MinStack() {
        st = new Stack<>();
        mp = new TreeMap<>();
    }

    public void push(int val) {
        st.push(val);
        mp.put(val, mp.getOrDefault(val, 0) + 1);
    }

    public void pop() {
        int n = mp.get(st.peek());
        if(n == 1) mp.remove(st.peek());
        else mp.put(st.peek(), mp.get(st.peek()) - 1);
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        for(int ele : mp.keySet()) return ele;
        return -1;
    }
}
