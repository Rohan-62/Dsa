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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        ListNode tptr=head;
        ListNode temp=null;
        ListNode ptr=null;
        while(tptr!=null){
            if(!set.contains(tptr.val)){
                if(temp==null){
                    temp=tptr;
                    ptr=temp;
                }else{
                    temp.next=tptr;
                    temp=temp.next;
                }
            }
            tptr=tptr.next;
        }
        temp.next=null;
        return ptr;
    }
}