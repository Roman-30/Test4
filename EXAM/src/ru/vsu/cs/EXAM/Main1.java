package ru.vsu.cs.EXAM;

public class Main1 {
    static int[] array = new int[]{5, 3, 6, 4, 5, 4, 7, 8, 4, 1, 10, 3};
    static int result = -1;

    public static void main(String[] args) {
        System.out.println(search(array));
    }
    public static int search(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int f = 0;
            int d = 0;
            for (int k : array) {
                if (array[i] + 1 == k) f++;
                if (array[i] - 1 == k) d++;
            }
            if (f > 0 && d > 0) result = i;
        }
        return result;
    }
}
