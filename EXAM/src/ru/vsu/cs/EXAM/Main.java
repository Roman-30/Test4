package ru.vsu.cs.EXAM;

import java.util.Scanner;

public class Main {

    // static int[][] arr = new int[][]{{4, 10, 66, 2, 6}, {12, 20, 0, -6, 50}, {50, 12, 21, 15, 84}};
    static int num = -1;
    static int row = readSomething("Enter matrix row: ");
    static int column = readSomething("Enter matrix column: ");
    static int[][] matrix = setMatrix();

    public static void main(String[] args) {
        System.out.println(sortNumbers(matrix));
    }

    public static int sortNumbers(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    index += 1;
                }
            }
            if (index == arr[i].length) num = i;
        }
        return num;
    }

    public static int[][] setMatrix() {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = readSomething("Enter " + j + " element " + i + " line: ");
            }
        }
        return matrix;
    }

    public static int readSomething(String name) {
        Scanner scn = new Scanner(System.in);
        System.out.print(name);
        return scn.nextInt();
    }
}
