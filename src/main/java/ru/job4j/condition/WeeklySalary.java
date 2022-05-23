package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int payed = 0;
        int averagePay = 10;
        int averagePayPlus = 15;
        for (int i = 0; i < 7; i++) {
            int payedForDay = 0;
            if (hours[i] <= 8) {
                payedForDay += (hours[i] * averagePay);
            } else {
                payedForDay += ((8 * averagePay) + (hours[i] - 8) * averagePayPlus);
            }
            if (i >= 5) {
                payedForDay *= 2;
            }
            payed += payedForDay;
        }
        return payed;
    }
}