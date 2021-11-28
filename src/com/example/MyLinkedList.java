package com.example;

import java.util.Objects;

public class MyLinkedList<T> {
    private Node head;

    public void add(T value) {
        if (Objects.isNull(head)) {
            head = new Node();
            head.addValue(value);
        } else {
            add(head, value);
        }
    }

    public boolean contains(T value) {
        return contains(head, value);
    }

    public int size() {
        int i = 0;
        Node n = head;

        while (Objects.nonNull(n)) {
            n = n.getNext();
            i++;
        }

        return i;
    }

    private Node add(Node node, T value) {
        if (Objects.isNull(node)) {
            Node n = new Node();
            n.addValue(value);
            return n;
        } else {
            Node n = add(node.getNext(), value);
            node.setNext(n);
            return node;
        }
    }

    private boolean contains(Node node, T value) {
        if (Objects.isNull(node)) {
            return false;
        }

        if (Objects.equals(node.getValue(), value)) {
            return true;
        } else {
            return (contains(node.getNext(), value));
        }
    }

    private static class Node<T> {
        private T value;
        private Node next;

        void addValue(T value) {
            this.value = value;
        }

        T getValue() {
            return value;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node node) {
            next = node;
        }
    }
}
