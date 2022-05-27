package ru.job4j.loop.additional;

public class Symmetry {
    public static boolean check(int i) {
        String line = Integer.toString(i);
        for (int j = 0; j < line.length() / 2; j++) {
            if (line.charAt(j) != line.charAt(line.length() - 1 - j)) {
                return false;
            }
        }
        return true;
    }
}