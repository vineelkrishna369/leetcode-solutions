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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
ListNode curr = head;

while(curr != null){
    curr = curr.next;
    cnt++;
}

int f_cnt = cnt - n;

if(f_cnt == 0){
    return head.next;
}

curr = head;

while(f_cnt > 1){
    curr = curr.next;
    f_cnt--;
}

curr.next = curr.next.next;

return head; 

        
    }
}