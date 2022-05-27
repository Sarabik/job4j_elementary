package ru.job4j.loop.additional;

public class Cryptography {
    public static String code(String s) {
        if ("".equals(s)) {
            return "empty";
        }
        if (s.length() > 0 && s.length() <= 4) {
            return s;
        }
        StringBuilder cardNumber = new StringBuilder(s);
        for (int i = 0; i < s.length() - 4; i++) {
            cardNumber.setCharAt(i, '#');
        }

        return cardNumber.toString();
    }
}