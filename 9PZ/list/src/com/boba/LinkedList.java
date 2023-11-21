package com.boba;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int sumOfEvenNumbers() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                sum += current.data;
            }
            current = current.next;
        }
        return sum;
    }

    public int countOfEvenNumbers() {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public double averageOfEvenNumbers() {
        int sum = sumOfEvenNumbers();
        int count = countOfEvenNumbers();
        return (double) sum / count;
    }

    public void swapMinMaxEvenNumbers() {
        Node minNode = null;
        Node maxNode = null;

        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                if (minNode == null || current.data < minNode.data) {
                    minNode = current;
                }
                if (maxNode == null || current.data > maxNode.data) {
                    maxNode = current;
                }
            }
            current = current.next;
        }

        if (minNode != null && maxNode != null) {
            int temp = minNode.data;
            minNode.data = maxNode.data;
            maxNode.data = temp;
        }
    }
}
