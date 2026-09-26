/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // LinkedList<Integer> list = new LinkedList<>();
        // we can use flyod algo
        // HashSet<ListNode>  set = new HashSet<>();
        // ListNode curr =head;
        // while(curr!=null){
        //     set.add(curr);
        //     curr = curr.next;
        //     if(set.contains(curr)){
        //         return true;
        //     }
        // }
        // return false;
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while(curr!=null){
            
            if(!set.contains(curr)){
                set.add(curr);
            }
            else{
                return true;
            }
            curr = curr.next;
            
        }
        return false;
        
    }
}