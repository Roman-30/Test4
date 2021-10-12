package ru.vsu.cs.EXAM;

import java.util.Scanner;

public class Main3 {
    static int d = readSomething("");

    public static void main(String[] args) {
        print(d);
    }

    public static void print(int d) {
        int m;
        for (int i = 0; i < d; i++) {
            m = 0;
            for (int j = 0; j < d - i; j++) {
                while (m < i) {
                    System.out.print(" ");
                    m++;
                }
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
    public static int readSomething(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name);
        return scanner.nextInt();
    }
}
