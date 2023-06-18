public static Node findMiddle(Node head)
    {
        if(head.next==null) return head;
        Node slow, fast;
        slow = fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }