import java.util.concurrent.LinkedBlockingQueue;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 public class Solution{
    public ListNode swapPairs(ListNode head) {
        int flag = 1;
        ListNode nhead = new ListNode(1);
        ListNode p1 = nhead;
        ListNode p2 = nhead;
        ListNode p = nhead;
        ListNode pflag = nhead;
        
        nhead.next = head;
        if(head == null || head.next == null)return head;
        p1 = head;
        p2 = p1.next;
        p = head;
        while(p1 != null && p2 != null){
            p = p2.next;
            pflag.next = p2;
            p1.next = p;
            p2.next = p1;
            
            //reset p
            pflag = p1;
            p1 = p;
            if(p != null)p2 = p.next;
        }
        if(p != null)pflag.next = p;
        return nhead.next;
    }
 }
/*public class Solution {
    public ListNode swapPairs(ListNode head) {
        LinkedBlockingQueue<ListNode> queue1 = new LinkedBlockingQueue<ListNode>();
        LinkedBlockingQueue<ListNode> queue2 = new LinkedBlockingQueue<ListNode>();
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode p = head;
        int flag = 1;
        try{
        while(p != null){
            p = p.next;
            if(flag % 2 == 1)queue1.put(h.next);
            else queue2.put(h.next);
            
            h.next = p;
            flag++;
        }
        
        flag = 1;
        p = h;
        while(queue1.size()!=0 || queue2.size() !=0){
            if(flag % 2 == 1)p.next = queue2.poll();
            else p.next = queue1.poll();
            
            flag++;
            p = p.next;
        }
        }catch(InterruptedException e){}
        
        return h.next;

    }
}

*/
/*
1.方法1:用两个辅助栈, 内存过大
2.方法2:边遍历边修改, 没问题.  注意结束条件  
*/
