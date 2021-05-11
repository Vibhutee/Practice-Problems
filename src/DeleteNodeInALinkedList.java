/*
 * Write a function to delete a node in a singly-linked list. You will not be given access to
 * the head of the list, instead you will be given access to the node to be deleted directly.
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 *
 * Example 1:
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list should become
 * 4 -> 1 -> 9 after calling your function.
 */
public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        Solution10 obj = new Solution10();
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(4);
        myLinkedList.addAtTail(5);
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(9);
        ListNode node = myLinkedList.head;
        while(node.val != 5){
            node = node.next;
        }
        obj.deleteNode(node);
        node = myLinkedList.head;
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}

//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

class Solution10 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class MyLinkedList {

    ListNode head;
    int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /** Add a node of value val before the first element of the linked list.
     *  After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode current = new ListNode(val);
        current.next = head;
        head = current;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode current = new ListNode(val);
        ListNode n = head;
        while(n.next != null){
            n = n.next;
        }
        n.next = current;
        current.next = null;
        size++;
    }
}