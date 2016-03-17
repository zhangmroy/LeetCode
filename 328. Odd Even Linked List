/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* oddEvenList(ListNode* head) {
        if(!head || head->next == NULL)return head;
        ListNode *headEven,*p,*p1,*p2;
        p = head;
        p2 = p->next;
        p1 = p->next;
        while(p2 && p2->next){
            p->next = p2->next;
            p = p2->next;
            p2->next = p->next;
            p2 = p->next;
        }
        p->next = p1;

        return head;
    }
};
