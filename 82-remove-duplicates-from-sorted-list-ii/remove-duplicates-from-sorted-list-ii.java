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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }else if(head.next==null){
            return head;
        }
        ListNode temp=new ListNode(-1);
        ListNode temphead=null;
        ListNode currnode=head;
        ListNode nextnode=head.next;
        int count=1;
        while(nextnode!=null){
           if(currnode.val==nextnode.val){
            count++;
            currnode=currnode.next;
           }else{
            if(count==1){
                if(temphead==null){
                    temp.next=currnode;
                    temphead=currnode;
                }else{
                    temp.next=currnode;
                    
                }
                currnode=currnode.next;
                temp=temp.next;
                temp.next=null;
                count=1;
            }else{
                count=1;
                currnode=currnode.next;
            }
           }
           nextnode=nextnode.next;
          
        }
        if(count==1){
            if(temphead==null){
                return currnode;
            }
            temp.next=currnode;
            temp=temp.next;
            temp.next=null;
        }
        return temphead;
    }
}