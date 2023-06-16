package LinkedList;
// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeLL {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while(list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return head.next;
    }
}
