// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 16: ODD EVEN LINKED LIST


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
    public ListNode oddEvenList(ListNode head) {
        if( head == null){  // if LL is empty
            return null;
        }
        ListNode odd=head;  // pointing to the head of given LL, representing odd positions
        ListNode even=head.next; // pointing to the even positions of LL
        ListNode even_head=even; // storing the value of even head to connect at the end of odd LL later
        while(1==1){  // infinite loop
            if( (odd==null) || (even==null) || (even.next)==null){ // base cases
                odd.next=even_head;
                break;
            }  
            odd.next=even.next;   // connecting odd nodes;
            odd=even.next;
            // checking if there are no more nodes
            if(odd.next==null){
                even.next=null;
                odd.next=even_head; // connecting even and odd ll
                break;
            }
            even.next=odd.next; // joining even nodes
            even=odd.next;
        }
        return head;
        
    }
}