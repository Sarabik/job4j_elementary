package ru.job4j.loop.additional;

public class Abbreviation {
    public static String collect(String s) {
        String[] array = s.split(" ");
        StringBuilder line = new StringBuilder();
        for (String word : array) {
            line.append(word.charAt(0));
        }
        return line.toString();
    }
}