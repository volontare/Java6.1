package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void totalSum() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.totalSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void mediumSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.mediumSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void lowerMiddleSalesMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.lowerMiddleSalesMonths(sales);

        assertEquals(expected, actual);
    }

    @Test
    void upperMiddleSalesMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.upperMiddleSalesMonths(sales);

        assertEquals(expected, actual);
    }

}
