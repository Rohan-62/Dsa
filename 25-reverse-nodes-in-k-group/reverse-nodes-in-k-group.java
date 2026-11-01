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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> st=new Stack<>();
        ListNode temphead=null;
        ListNode tptr=head;
        ListNode tail=null;
        while(tptr!=null){
            if(st.size()==k){
                ListNode temp=null;
                ListNode temptail=null;
                if(!st.isEmpty()){
                    temp=st.pop();
                    temptail=temp;
                }
                while(!st.isEmpty()){
                    ListNode curr=st.pop();
                    temptail.next=curr;
                    temptail=temptail.next;
                    temptail.next=null;
                }
                if(temphead==null){
                    temphead=temp;
                    tail=temptail;
                }
                else{
                    tail.next=temp;
                    tail=temptail;
                }
                ListNode curr=tptr;
                tptr=tptr.next;
                st.push(curr);
            }else{
                ListNode temp=tptr;
                tptr=tptr.next;
                temp.next=null; 
                st.push(temp);
            }
        }
        if(st.size()==k){
            ListNode temp=null;
            ListNode temptail=null;
            if(!st.isEmpty()){
                temp=st.pop();
                temptail=temp;
            }
            while(!st.isEmpty()){
                temptail.next=st.pop();
                temptail=temptail.next;
                temptail.next=null;
            }
            if(temphead==null){
                return temp;
            }else{
                tail.next=temp;
            }

        }else{
            ListNode temp=null;
            ListNode temptail=null;
            if(!st.isEmpty()){
                temp=st.pop();
                temptail=temp;
            }
            while(!st.isEmpty()){
                temp=st.pop();
                temp.next=temptail;
                temptail=temp;
            }
            tail.next=temp;
        }
        return temphead;
        
    }
}