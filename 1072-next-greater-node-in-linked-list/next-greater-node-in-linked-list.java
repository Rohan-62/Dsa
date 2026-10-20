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
    public int[] nextLargerNodes(ListNode head) {
        Stack<int[]> st=new Stack<>();
        ListNode tptr=head;
        int count=0;
        while(tptr!=null){
            count++;
            tptr=tptr.next;
        }
        int []res=new int[count];
        int idx=0;
        tptr=head;
        while(tptr!=null)
        {
            if(st.isEmpty()){
                st.push(new int[]{tptr.val,idx});
            }else{
                if(tptr.val<=st.peek()[0]){
                    st.push(new int[]{tptr.val,idx});
                }else{
                    while(!st.isEmpty() && st.peek()[0]<tptr.val){
                        res[st.peek()[1]]=tptr.val;
                        st.pop();
                    }
                    st.push(new int[]{tptr.val,idx});
                }
            }
            tptr=tptr.next;
            idx++;
        }
        if(!st.isEmpty()){
            res[st.pop()[1]]=0;
        }
        return res;
    }
}