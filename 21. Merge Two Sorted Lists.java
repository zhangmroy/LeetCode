/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p ;
        ListNode p1 = l1;
        ListNode p2 = l2;
        if(l1 == null)return l2;
        else if(l2 == null)return l1;
        
        if (l1.val < l2.val){head.next = l1;p1 = p1.next;}
        else {head.next = l2;p2 = p2.next;}
        p = head.next;
        
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val ){
                p.next = p1;
                p = p.next;
                p1 = p1.next;
            }
            else{
                p.next = p2;
                p = p.next;
                p2 = p2.next;
            }
        }
        if(p2 == null)p.next = p1;
        else p.next = p2;
        
        return head.next;
    }
}

/*
  简单链表的拼接
  1.注意区分引用和C中指针
  2.注意返回的是原来的头部
*/
