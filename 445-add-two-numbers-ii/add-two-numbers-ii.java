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
       Stack<ListNode> st1=new Stack<>();
       Stack<ListNode> st2=new Stack<>();
       ListNode tptr=l1;
       while(tptr!=null){
            st1.push(tptr);
            tptr=tptr.next;
       }
       tptr=l2;
       while(tptr!=null){
        st2.push(tptr);
        tptr=tptr.next;
       }
       tptr=null;
       int carry=0;
       while(!st1.isEmpty() || !st2.isEmpty()){
        ListNode first=null;
        ListNode sec=null;
        int num1=0;
        int num2=0;
            if(!st1.isEmpty()){
                first=st1.pop();
                num1=first.val;
            }
            if(!st2.isEmpty()){
                sec=st2.pop();
                num2=sec.val;
            }
            if(first!=null){
                int sum=num1+num2+carry;
                first.val=sum%10;
                carry=sum/10;
                first.next=tptr;
                tptr=first;
            }else{
                int sum=num1+num2+carry;
                sec.val=sum%10;
                carry=sum/10;
                sec.next=tptr;
                tptr=sec;
            }
       }
       if(carry>0){
        ListNode c=new ListNode(carry);
        c.next=tptr;
        tptr=c;
       }
       return tptr;

    }
}