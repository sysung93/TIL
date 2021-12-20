package DoubleLinkedList.com.woori.util;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList(){
        init();
    }

    public void init(){
        head = new Node();
        tail = new Node();
        head.prev = head;
        head.next = tail;
        tail.prev = head;
        tail.next = tail;
    }


}


