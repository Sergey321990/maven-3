package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averege(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int testmonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int testmonthMinimumSale(long[] sales) {
        int testmonthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[testmonthMinimum]) {
                testmonthMinimum = i;
            }
        }
        return testmonthMinimum + 1;
    }

    public int monthsBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averege(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsHigherAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averege(sales)) {
                counter++;
            }
        }
        return counter;
    }
}






