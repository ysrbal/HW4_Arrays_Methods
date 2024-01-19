package com.yasar;

import java.util.Scanner;

public class Runner_Question_1 {
    public static void main(String[] args) {
        /**
         * Bir dizideki max min en buyuk ikinci degeri bulal�m
         */
        int lenght = diziLenght();
        int[] ints = diziOlustur(lenght);
        System.out.println("�kinci En B�y�k Sayi ..... : " + ikinciEnBuyuk(ints));
        System.out.println("�kinci En K���k Sayi ..... : " + ikinciEnKucuk(ints));
    }

    public static int diziLenght() {
        System.out.print("L�tfen dizinin uzunlu�unu giriniz.... : ");
        int lenght = new Scanner(System.in).nextInt();

        return lenght;
    }

    public static int[] diziOlustur(int sayi) {
        int[] ints = new int[sayi];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sayi; i++) {
            System.out.print((i + 1) + ". sayiyi giriniz : ");
            ints[i] = scanner.nextInt();
        }
        return ints;
    }

    public static int ikinciEnBuyuk(int[] ints) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                secondMax = max;
                max = ints[i];
            } else if (ints[i] > secondMax && ints[i] != max) {
                secondMax = ints[i];
            }
        }
        return secondMax;
    }

    public static int ikinciEnKucuk(int[] ints) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                secondMin = min;
                min = ints[i];
            } else if (ints[i] < secondMin && ints[i] != min) {
                secondMin = ints[i];
            }
        }
        return secondMin;
    }
}
