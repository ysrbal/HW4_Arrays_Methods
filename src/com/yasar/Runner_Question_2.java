package com.yasar;

import java.util.Locale;
import java.util.Scanner;

public class Runner_Question_2 {
    public static void main(String[] args) {
        /**
         * T�rk�e karakterleri inglizce karakterler �evirme
         * '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'
         * d��ar�dan bir kelime girece�iz bu kelime i�erisinde ge�en t�rk�e karakterleri
         * ing karakterlere d�n��t�rece�iz(array kullanabilirsiniz) ;
         */
        String word = addWord();
        System.out.println("T�rk�e Karakter Girilen Kelime .......... : " + word);
        changeCharacter(word);
    }

    public static String addWord() {
        System.out.print("L�tfen bir kelime giriniz.... : ");
        String word = new Scanner(System.in).nextLine();
        return word;
    }

    public static void changeCharacter(String string) {
        string = string.replace("�", "I");
        string = string.replace("�", "i");
        string = string.replace("�", "s");
        string = string.replace("�", "s");
        string = string.replace("�", "c");
        string = string.replace("�", "C");
        string = string.replace("�", "g");
        string = string.replace("�", "G");
        string = string.replace("�", "u");
        string = string.replace("�", "U");
        string = string.replace("�", "o");
        string = string.replace("�", "O");

        System.out.println("�ngilizce Karakterlere D�n��m�� Hali .... : " + string);
    }
}
