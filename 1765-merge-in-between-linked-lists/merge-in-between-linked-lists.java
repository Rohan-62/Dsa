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
        ListNode tail=list2;
        while(tail.next!=null){
            tail=tail.next;
        }
        int count=0;
        ListNode tptr=list1;
        ListNode first=null;
        ListNode last=null;
        while(tptr!=null){
            if(count==a-1){
                first=tptr;
            }
            if(count==b+1){
                last=tptr;
            }
            count++;
            tptr=tptr.next;
        }
        first.next=list2;
        tail.next=last;
        return list1;
    }
}