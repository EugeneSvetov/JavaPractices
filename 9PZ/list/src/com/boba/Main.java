package com.boba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        LinkedList list = new LinkedList();
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            list.insert(num);
        }

        int sum = list.sumOfEvenNumbers();
        int count = list.countOfEvenNumbers();
        double average = list.averageOfEvenNumbers();
        System.out.println("Сумма четных чисел: " + sum);
        System.out.println("Количество четных чисел: " + count);
        System.out.println("Среднее значение четных чисел: " + average);

        list.swapMinMaxEvenNumbers();
    }
}