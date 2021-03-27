package ru.netology.stats;

public class StatsService<sales> {

    public int totalSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int mediumSum(int[] sales) {
        return totalSum(sales) / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxsales = sales[0];
        int month = 0;
        int maxmonth = 0;
        for (int sale : sales) {
            month = month + 1;
            if (maxsales <= sale) {
                maxsales = sale;
                maxmonth = month;
            }
        }
        return maxmonth;
    }

    public int minSalesMonth(int[] sales) {
        int minsales = sales[0];
        int month = 0;
        int minmonth = 0;
        for (int sale : sales) {
            month++;
            if (minsales >= sale) {
                minsales = sale;
                minmonth = month;
            }
        }
        return minmonth;
    }

    public int lowerMiddleSalesMonths (int[] sales) {
        int count = 0;
        for (int sale: sales) {
        if (sale < mediumSum(sales)) count++;
        }
        return count;
    }

    public int upperMiddleSalesMonths (int[] sales) {
        int count = 0;
        for (int sale: sales) {
            if (sale > mediumSum(sales)) count++;
        }
        return count;
    }
}
