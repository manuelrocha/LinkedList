package com.example;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        System.out.println(linkedList.contains(2));
        System.out.println(linkedList.contains(4));

        System.out.println(linkedList.size());
    }
}
