package com.boba;

import java.util.Scanner;

public class LinkedList {
    private Node head;

    public void createHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void createTail(int data) {
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
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

    public void insert(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int currentPosition = 0;
            while (currentPosition < position - 1 && current.next != null) {
                current = current.next;
                currentPosition++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }
    }

    public void remove(int position) {
        if (head != null) {
            if (position == 0) {
                head = head.next;
            } else {
                Node current = head;
                int currentPosition = 0;
                while (currentPosition < position - 1 && current.next != null) {
                    current = current.next;
                    currentPosition++;
                }
                if (current.next != null) {
                    current.next = current.next.next;
                }
            }
        }
    }

    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    private Node createHeadRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = current;
            return newNode;
        }
    }

    public void createTailRec(int data) {
        head = createTailRecHelper(head, data);
    }

    private Node createTailRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        } else {
            current.next = createTailRecHelper(current.next, data);
            return current;
        }
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        } else if (current.next == null) {
            return String.valueOf(current.data);
        } else {
            return current.data + " " + toStringRecHelper(current.next);
        }
    }

    public void createListFromInput(int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            createTailRec(data);
        }
    }

    public int sumOfEvenNumbers() {
        return sumOfEvenNumbersHelper(head);
    }

    private int sumOfEvenNumbersHelper(Node current) {
        if (current == null) {
            return 0;
        } else {
            int sum = 0;
            if (current.data % 2 == 0) {
                sum += current.data;
            }
            return sum + sumOfEvenNumbersHelper(current.next);
        }
    }

    public int countOfEvenNumbers() {
        return countOfEvenNumbersHelper(head);
    }

    private int countOfEvenNumbersHelper(Node current) {
        if (current == null) {
            return 0;
        } else {
            int count = 0;
            if (current.data % 2 == 0) {
                count++;
            }
            return count + countOfEvenNumbersHelper(current.next);
        }
    }

    public double averageOfEvenNumbers() {
        int sum = sumOfEvenNumbers();
        int count = countOfEvenNumbers();
        if (count == 0) {
            return 0;
        } else {
            return (double) sum / count;
        }
    }

    public void findAndSwapMinMaxEvenPositiveNumbers() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.data % 2 == 0 && current.data > 0) {
                if (current.data < min) {
                    min = current.data;
                    minIndex = index;
                }
                if (current.data > max) {
                    max = current.data;
                    maxIndex = index;
                }
            }
            current = current.next;
            index++;
        }

        if (minIndex != -1 && maxIndex != -1) {
            swapNodes(minIndex, maxIndex);
        }
    }

    private void swapNodes(int index1, int index2) {
        if (index1 == index2) {
            return;
        }

        Node prev1 = null;
        Node curr1 = head;
        int i = 0;
        while (curr1 != null && i < index1) {
            prev1 = curr1;
            curr1 = curr1.next;
            i++;
        }

        Node prev2 = null;
        Node curr2 = head;
        i = 0;
        while (curr2 != null && i < index2) {
            prev2 = curr2;
            curr2 = curr2.next;
            i++;
        }

        if (curr1 == null || curr2 == null) {
            return;
        }

        if (prev1 != null) {
            prev1.next = curr2;
        } else {
            head = curr2;
        }

        if (prev2 != null) {
            prev2.next = curr1;
        } else {
            head = curr1;
        }

        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}