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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first=l1;
        ListNode second=l2;
        ListNode resultSum=new ListNode(0);
        ListNode resultPointer=resultSum;
        // ListNode result=resultSum;
        int sum=0;
        while(first!=null || second!=null){
            sum=sum/10;
            if(first!=null){
                sum+=first.val;
                first=first.next;
            }
            if(second!=null){
                sum+=second.val;
                second=second.next;
            }
            resultPointer.next=new ListNode(sum%10);
            resultPointer=resultPointer.next;    
        }
        if(sum>=10){
             resultPointer.next=new ListNode(1);
        }
       // return result.next;
        return resultSum.next;
    }
}
