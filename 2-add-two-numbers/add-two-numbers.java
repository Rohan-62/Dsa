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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first=l1;
        ListNode second=l2;
        int carry=0;
        while(first!=null || second!=null){
          if(first!=null && second!=null){
            int sum=carry+first.val+second.val;
            carry=sum/10;
            first.val=sum%10;
            if(first.next!=null && second.next!=null){
                first=first.next;
                second=second.next;
            }
            else if(first.next==null && second.next!=null){
                ListNode temp=new ListNode(0);
                first.next=temp;
                first=first.next;
                second=second.next;
            }else if(first.next!=null && second.next==null){
                first=first.next;
                second.val=0;
            }else{
                first=first.next;
                second=second.next;
            }

          }
        }
        if(carry>0){
            ListNode traverse=l1;
            while(traverse.next!=null){
                traverse=traverse.next;
            }
            ListNode temp=new ListNode(carry);
            traverse.next=temp;
        }
        return l1;
    }
}