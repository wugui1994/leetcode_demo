package com.leetcode;

public class leetcode7 {
    public static void main(String[] args) {

    }

    //链表的反转
    public ListNode stackreverse (ListNode head) {
        ListNode pre = null;
        ListNode pnode = head;
        ListNode prec = null;
        while (pnode != null){
            ListNode pnext = pnode.next;
            if (pnext == null){
                pre = pnode;
            }
            pnext.next = prec;
            prec  = pnode;
            pnode = pnext;
        }
        return pre;
    }
    public class ListNode{
        int value;
        ListNode next;

        public ListNode(int value){
            this.value = value;
        }
    }
}
