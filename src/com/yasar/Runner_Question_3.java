package com.yasar;

public class Runner_Question_3 {
    public static void main(String[] args) {
        /**
         * 1 ile 10 arasındaki sayıların çarpım tablosunu çift boyutlu bir arrayde toplayalım
         * Her bir elamanı aşağıdaki gibi olacak;
         * [0] [0] =1x1=1   [1] [0] =2x1=2
         * [0] [1]=1x2=2    [1] [1] =2x2=4
         * … …
         */

        int[][] ints = multiplicationTable();
        print(ints);
    }

    public static int[][] multiplicationTable() {
        int[][] ints = new int[10][10];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = (i + 1) * (j + 1);
            }
        }
        return ints;
    }

    public static void print(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println((i + 1) + "x" + (j + 1) + "=" + ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
