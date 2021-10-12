package ru.vsu.cs.EXAM;

public class Main4 {
    static int[] array = new int[]{};//1, 3, 2, 5, 1, 3, 6, 5, 7, 6, 7, 3, 6,};
    static int result = -1;

    public static void main(String[] args) {
        System.out.println(searchLastIndex());
    }

    public static int searchLastIndex() {
        if (array.length != 0) {
            int b = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (b < array[i + 1]) {
                    b = array[i + 1];
                    result = i + 1;
                }
            }
        }
        return result;
    }
}
