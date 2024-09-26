package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
//        здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
//         например вот так:
//
        int[] arr = {1100};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) {
            return null;
        }
        int count = arr.length;
        for (int k : arr) {
            if (k > 1000) {
                count--;
            }
        }

        int[] result = new int[count];
        int j = 0;
        for (int k : arr) {
            if (k <= 1000) {
                result[j] = k;
                j++;
            }
        }
        return result;
    }

}