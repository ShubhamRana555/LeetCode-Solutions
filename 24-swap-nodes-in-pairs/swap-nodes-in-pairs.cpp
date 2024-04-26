/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode* prev=new ListNode(-1),*ans=prev;
        while(head){
            if(head->next==NULL){
                prev->next=head;
                head=NULL;
            }else{
                ListNode* x=head->next->next;
                prev->next=head->next;
                prev->next->next=head;
                head->next=NULL;
                prev=prev->next->next;
                head=x;
            }
        }
        return ans->next;
    }
};