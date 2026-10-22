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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode tptr=head;
        while(tptr!=null){
            if(st.isEmpty()){
                st.push(tptr);
            }else{
                if(st.peek().val>=tptr.val){
                    st.push(tptr);
                }
                else{
                    while(!st.isEmpty() && st.peek().val<tptr.val){
                        st.pop();
                    }
                    st.push(tptr);
                }
            }
            tptr=tptr.next;
        }
        ListNode curr=null;
        while(!st.isEmpty()){
            st.peek().next=curr;
            curr=st.pop();
        }
        return curr;
    }
}