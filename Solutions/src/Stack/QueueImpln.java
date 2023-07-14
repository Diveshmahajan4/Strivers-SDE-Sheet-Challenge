package Stack;

public class QueueImpln {
    private int[] arr ;
    private int DEFAULT_SIZE = 10;
    private int size = 0;
    private int front = 0;
    private int rear  =0;

    public QueueImpln(){
        arr = new int[DEFAULT_SIZE];
    }

    public int top(){
        if(size == 0) return -1;

        return arr[front%DEFAULT_SIZE];
    }

    public void push(int num){
        if(size == DEFAULT_SIZE){
            System.out.println("Queue is Full!");
            return;
        }
        arr[rear%DEFAULT_SIZE] = num;
        rear++;
        size++;
    }

    public int pop(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int temp = arr[front%DEFAULT_SIZE];
        arr[front%DEFAULT_SIZE] = -1;
        size--;
        front++;

        return temp;
    }

    public static void main(String[] args) {
        QueueImpln q = new QueueImpln();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        System.out.println(q.pop());
        System.out.println(q.top());
    }
}
