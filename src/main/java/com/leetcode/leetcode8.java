package com.leetcode;

/**
 * 给定一个链表，如果链表中存在环，则返回到链表中环的起始节点，如果没有环，返回null。
  思路：
        使用快慢指针的方式进行，从当前的头结点 快指针一次两步 慢指针一次一步如果走完一周
     快慢指针没有相遇返回为空 如果相遇则返回下一个指针
 入口点的判断首先通过快慢指针得到该链表是否带环，如果有环则将快慢指针进行重置，分别指向头节点和之前相遇的节点，再进行单步前进，两指针相遇的节点就是环的入口节点。
 */
public class leetcode8 {
    /**
     * 定义结点
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next =null;
        }
    }
    public ListNode CycleStack(ListNode head){
        if (head == null || head.next == null){
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        //先判断是否有环
        while (fast!=slow){
            if (fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow 和head正好差一个结点 当head是环的入口时 slow就是环入口的上一个结点
        while (head != slow.next){
            head = head.next;
            slow = slow.next;
        }

        return head;

    }

}

