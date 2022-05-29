package ru.job4j.array.additional;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        for (int i = 0; i < string.length; i++) {
            if (Character.isLetter(string[i])
                    && Character.isLowerCase(string[i])) {
                string[i] = Character.toUpperCase(string[i]);
            }
        }
        return string;
    }
}