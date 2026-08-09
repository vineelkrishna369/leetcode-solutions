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
    public ListNode middleNode(ListNode head) {
       int cnt=0;
       ListNode curr = head;
       while(curr!=null){
        curr = curr.next;
        cnt++;
       }
       int f_cnt = cnt/2;
       curr = head;
       while(f_cnt>0){
        curr=curr.next;
        f_cnt--;
       }
      return curr;

        
    }
}