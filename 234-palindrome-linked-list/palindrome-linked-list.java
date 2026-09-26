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
    public boolean isPalindrome(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            list.add(curr);
            curr = curr.next;
        }
        int cnt=0;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i).val==list.get(n-i-1).val){
                cnt++;
            }
        }
        if(cnt==n){
            return true;
        }
        return false;
        
    }
}