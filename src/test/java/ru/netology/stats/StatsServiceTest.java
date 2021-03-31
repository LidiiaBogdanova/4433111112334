package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    public long[] getPurchases() {
        return new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    }


    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSum(getPurchases());
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.calculateAverage(getPurchases());
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLastMaxMonthPurchase() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.findMax(getPurchases());
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLastMinMonthPurchase() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.findMin(getPurchases());
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLessThanAverageMonthCount() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.lessThanAverageMonthCount(getPurchases());
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMoreThanAverageMonthCount() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.moreThanAverageMonthCount(getPurchases());
        assertEquals(expected, actual);
    }
}