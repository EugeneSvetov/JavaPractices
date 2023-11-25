package com.boba;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.createHead(1);
        list.createHead(2);
        list.createHead(3);
        System.out.println(list.toString());

        list.addFirst(4);
        list.addLast(5);
        list.insert(6, 2);
        System.out.println(list.toString());

        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println(list.toString());

        list.createHeadRec(1);
        list.createHeadRec(2);
        list.createHeadRec(3);
        System.out.println(list.toStringRec());

        list.createTailRec(4);
        list.createTailRec(5);
        list.insert(6, 2);
        System.out.println(list.toStringRec());

        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println(list.toStringRec());
        list.createListFromInput(5);
        System.out.println("Sum of even numbers: " + list.sumOfEvenNumbers());
        System.out.println("Count of even numbers: " + list.countOfEvenNumbers());
        System.out.println("Average of even numbers: " + list.averageOfEvenNumbers());

        list.findAndSwapMinMaxEvenPositiveNumbers();
        System.out.println(list.toStringRec());
    }
}