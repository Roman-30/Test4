package ru.vsu.cs.EXAM;

import java.util.Scanner;

public class Main2 {
    static int num = readSomething("Enter number: ");
    static int result = 2;

    public static void main(String[] args) {
        System.out.println(calculateSumNumbers(num));
    }

    public static int calculateSumNumbers(int num) {
        int v = 1;
        int x = num;
        if (!checkNumber(num)) x = num + 1;
        for (int i = 1; i <= x / 2; i++) {
            for (int j = 0; j < i; j++) {
                result += i;
                v += 1;
                if (v == num) break;
            }
        }
        return result;
    }

    public static boolean checkNumber(int num) {
        return num % 2 == 0;
    }

    public static int readSomething(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name);
        return scanner.nextInt();
    }
}
