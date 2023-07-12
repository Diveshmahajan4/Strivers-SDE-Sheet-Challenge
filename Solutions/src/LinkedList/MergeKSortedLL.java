package LinkedList;
// https://leetcode.com/problems/merge-k-sorted-lists/description/
public class MergeKSortedLL {
    public static void main(String[] args) {

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];

        ListNode merged = merge(lists[0], lists[1]);

        for(int i = 2; i < lists.length; i++){
            merged = merge(merged, lists[i]);
        }

        return merged;
    }

    public static ListNode merge(ListNode list1, ListNode list2){
        ListNode head = new ListNode();
        ListNode temp = head;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
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

