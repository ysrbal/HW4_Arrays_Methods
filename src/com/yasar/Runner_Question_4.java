package com.yasar;

public class Runner_Question_4 {
    public static void main(String[] args) {
        /**
         * int[][] matris = { { 56, 23, 678, 231, 5 },
         * { 234, 21, 78, 26, 6 },
         * { 654, 33, 32, 67, 2 },
         * { 189, 35, 56, 89, 8 } };
         * metot veya metotlar yazarak bu araydeki
         * tek sayıları baska bir tek boyutlu arrayde toplamanızı istiyorum
         */

        int[][] matris = {{56, 23, 678, 231, 5}, {234, 21, 78, 26, 6}, {654, 33, 32, 67, 2}, {189, 35, 56, 89, 8}};

        int[] ints = oddNUmber(matris);

    }

    public static int[] oddNUmber(int[][] ints) {
        int size = 0;
        int[] oddArray = new int[ints.length * ints[0].length];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] % 2 != 0) {
                    oddArray[size++] = ints[i][j];
                }
            }
        }
        print(oddArray,size);
        return oddArray;

    }

    public static void print(int[] ints, int size) {

        for (int i = 0; i < size        ; i++) {
            System.out.print(ints[i] + "  ");
        }
    }
}
