class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headl1=l1;
        ListNode headl2=l2;
        while(headl1!=null && headl2!=null){
            if(headl1.val+headl2.val>=10){
                if(headl1.next!=null){
                headl1.next.val+=1;
                }else{
                    ListNode temp=new ListNode(1);
                    headl1.next=temp;
                }
                headl1.val=headl1.val+headl2.val-10;
                headl1=headl1.next;
                headl2=headl2.next;
            }else{
                headl1.val=headl1.val+headl2.val;
                headl1=headl1.next;
                headl2=headl2.next;
            }
        }
        //
        if(headl1!=null){
            while(headl1.val>9 && headl1!=null){
                headl1.val=0;
                if(headl1.next==null){
                    ListNode resulttemp= new ListNode(0);
                    headl1.next=resulttemp;
                }
                headl1.next.val+=1;
                headl1=headl1.next;
            }
        }else if(headl2!=null){
            while(headl2.val>9 && headl2!=null){
                headl2.val=0;
                if(headl2.next==null){
                    ListNode resulttemp= new ListNode(0);
                    headl2.next=resulttemp;
                }
                headl2.next.val+=1;
                headl2=headl2.next;
            }
            
        }
//         if(headl1.val>=10){
//             headl1.val=headl1.val-10;
            
//             while(headl1!=null){
//             }
        
        return l1;
    }
}
