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
    public ListNode mergeNodes(ListNode head) {
        boolean firstzero=false;
        ListNode headptr=null;
        ListNode ptr=head;
        ListNode temp=null;
        int sum=0;
        while(ptr!=null){
            if(ptr.val==0){
                if(!firstzero){
                    firstzero=true;
                }else{
                    if(headptr==null){
                        headptr=ptr;
                        temp=ptr;
                        ptr.val=sum;
                        sum=0;
                    }else{
                        ptr.val=sum;
                        sum=0;
                        temp.next=ptr;
                        temp=temp.next;
                    }
                }
            }else if(firstzero){
                sum+=ptr.val;
            }
            ptr=ptr.next;
        }
        
        return headptr;
    }
}