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
    ListNode headOdd;
    ListNode headEven;
    public ListNode oddEvenList(ListNode head) {
        // ListNode temp=head;
        // if(head==null){
        //     return head;
        // }
        // int len=0;
        // while(temp!=null){
        //     len++;
        //     if(len%2==0){
        //         appendInEven(temp.val);
        //     }else{
        //         appendInOdd(temp.val);
        //     }
        //     temp=temp.next;
        // }
        // ListNode node =headEven;
        // if(node==null)
        //     return headOdd;
        // while(node!=null){
        //     appendInOdd(node.val);
        //     node=node.next;
        // }
        // return headOdd;
        
        if (head == null) return null;
        
        if (head.next == null || head.next.next == null) return head;
        
        ListNode current = head;
        ListNode even = current.next;
        ListNode evenStart = even;
        while (current.next != null && current.next.next != null) {
            current.next = current.next.next;
            current = current.next;
            even.next = current.next;
            even = even.next;
        }
        current.next = evenStart;
        return head;
    }
    
    
    public void appendInOdd(int new_data) { 
        ListNode new_node = new ListNode(new_data); 
  
        if (headOdd == null) { 
            headOdd = new ListNode(new_data); 
            return; 
        } 
  
        new_node.next = null; 
  
        ListNode last = headOdd;  
        while (last.next != null) 
            last = last.next; 
  
        last.next = new_node; 
        return; 
    } 
    
    public void appendInEven(int new_data) { 
        ListNode new_node = new ListNode(new_data); 
  
        if (headEven == null) { 
            headEven = new ListNode(new_data); 
            return; 
        } 
  
        new_node.next = null; 
  
        ListNode last = headEven;  
        while (last.next != null) 
            last = last.next; 
  
        last.next = new_node; 
        return; 
    } 
}