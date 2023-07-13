package Stack;

public class StackImpln {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(12);
        st.push(14);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
    }
}

class Stack{
    private int[] arr;
    private final int DEFAULT_VALUE = 10;
    private int top = -1;

    public Stack(){
        arr = new int[DEFAULT_VALUE];
    }

    public Stack(int size){
        arr = new int[size];
    }

    public boolean isFull(){
        return top == arr.length-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int num){
        if(isFull()){
            System.out.println("Stack is Full!");
        }else{
            top++;
            arr[top] = num;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(arr[top] + " was removed");
            top--;
        }
    }

}
