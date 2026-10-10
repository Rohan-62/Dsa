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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddhead=null;
        ListNode evenhead=null;
        ListNode odd=null;
        ListNode even=null;
        ListNode tptr=head;
        int count=1;
        if(head==null){
            return null;
        }
        while(tptr!=null){
            if(count%2==1){
                if(oddhead==null){
                    oddhead=tptr;
                    odd=tptr;
                }else{
                    odd.next=tptr;
                    odd=odd.next;
                }
            }else{
                if(evenhead==null){
                    evenhead=tptr;
                    even=tptr;
                }else{
                    even.next=tptr;
                    even=even.next;
                }
            }
            tptr=tptr.next;
            count++;
        }
        if(even!=null){
            even.next=null;
        }
        odd.next=evenhead;
        return oddhead;
        
    }
}