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
    public void reorderList(ListNode head) {
       ListNode temp=head;
       Stack<ListNode> st=new Stack<>();
       while(temp!=null){
            st.push(temp);
            temp=temp.next;
       } 
       temp=head;
       while(!st.isEmpty()){
        if(!st.isEmpty() && st.peek()==temp){
            temp.next=null;
            break;
        }
        ListNode curr=temp.next;
        temp.next=st.pop();
        temp=temp.next;
        if(curr==temp){
            temp.next=null;
            break;
        }
        
        temp.next=curr;
        temp=temp.next;
       }
       
       

    }
}