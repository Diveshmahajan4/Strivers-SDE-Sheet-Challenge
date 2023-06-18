package LinkedList;
// https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1
public class FlatteningLL {

    static class Node
    {
        int data;
        Node next;
        Node bottom;

        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }

    public static Node merge(Node a, Node b){
        Node temp = new Node(0);
        Node ans = temp;

        while(a != null && b!= null){
            if(a.data < b.data){
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }else{
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }

        if( a != null){
            temp.bottom = a;
        }else{
            temp.bottom = b;
        }

        return ans.bottom;
    }

    public static Node flatten(Node root)
    {
        // Your code here
        if(root == null || root.next == null){
            return root;
        }

        root.next = flatten(root.next);
        root = merge(root, root.next);

        return root;
    }
    public static void main(String[] args) {

    }


}
