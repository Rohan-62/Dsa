/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode sptr=list1;
        for(int i=1;i<a;i++){
            sptr=sptr.next;
        }
        ListNode eptr=sptr.next;
        for(int i=a-1;i<b;i++){
            eptr=eptr.next;
        }
        ListNode tail=list2;
        while(tail.next!=null){
            tail=tail.next;
        }
        sptr.next=list2;
        tail.next=eptr;
        return list1;
    }
}