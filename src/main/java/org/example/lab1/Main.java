package org.example.lab1;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello світ";
        String str2 = "Привіт світ";
        String commonCyrillicLetters = "";

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (c >= '\u0400' && c <= '\u04FF' && str2.indexOf(c) != -1) {
                commonCyrillicLetters += c;
            }
        }
        System.out.println("Повторювані кирилічні символи: " + "\"" + commonCyrillicLetters + "\"");
    }
}