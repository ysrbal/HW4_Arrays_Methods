package com.yasar;

import java.util.Locale;
import java.util.Scanner;

public class Runner_Question_2 {
    public static void main(String[] args) {
        /**
         * Türkçe karakterleri inglizce karakterler çevirme
         * 'Ý', 'ý', 'þ', 'Þ', 'ç', 'Ç', 'ð', 'Ð', 'ü', 'Ü', 'ö', 'Ö'
         * dýþarýdan bir kelime gireceðiz bu kelime içerisinde geçen türkçe karakterleri
         * ing karakterlere dönüþtüreceðiz(array kullanabilirsiniz) ;
         */
        String word = addWord();
        System.out.println("Türkçe Karakter Girilen Kelime .......... : " + word);
        changeCharacter(word);
    }

    public static String addWord() {
        System.out.print("Lütfen bir kelime giriniz.... : ");
        String word = new Scanner(System.in).nextLine();
        return word;
    }

    public static void changeCharacter(String string) {
        string = string.replace("Ý", "I");
        string = string.replace("ý", "i");
        string = string.replace("þ", "s");
        string = string.replace("Þ", "s");
        string = string.replace("ç", "c");
        string = string.replace("Ç", "C");
        string = string.replace("ð", "g");
        string = string.replace("Ð", "G");
        string = string.replace("ü", "u");
        string = string.replace("Ü", "U");
        string = string.replace("ö", "o");
        string = string.replace("Ö", "O");

        System.out.println("Ýngilizce Karakterlere Dönüþmüþ Hali .... : " + string);
    }
}
