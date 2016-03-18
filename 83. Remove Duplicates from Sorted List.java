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
    ListNode* deleteDuplicates(ListNode* head) {
        if(!head || head->next == NULL)return head;
        ListNode *bef,*aft;
        bef = head;
        aft = head->next;
        while(aft){
            if(aft->val == bef->val){
                aft = aft->next;
                bef->next = aft;
            }
            else{
                bef = aft;
                aft = bef->next;
            }
        }
        return head;
    }
};

/*
  简单题,遍历删除即可,无需其他操作
*/
