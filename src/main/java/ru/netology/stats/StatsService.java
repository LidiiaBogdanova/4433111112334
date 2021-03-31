package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        long sum = calculateSum(purchases);
        return sum / purchases.length;
    }

    public long findMax(long[] purchases) {
        int month = 0;
        int lastMaxMonth = 0;
        long currentMax = 0;
        for (long purchase : purchases) {
            month = month + 1;
            if (currentMax <= purchase) {
                currentMax = purchase;
                lastMaxMonth = month;
            }
        }
        return lastMaxMonth;
    }

    public long findMin(long[] purchases) {
        int month = 0;
        int lastMinMonth = 0;
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            month = month + 1;
            if (currentMin >= purchase) {
                currentMin = purchase;
                lastMinMonth = month;
            }
        }

        return lastMinMonth;
    }

    public int lessThanAverageMonthCount(long[] purchases) {
        long average = calculateAverage(purchases);
        int MonthCount = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                MonthCount = MonthCount + 1;
            }
        }
        return MonthCount;
    }

    public int moreThanAverageMonthCount(long[] purchases) {
        long average = calculateAverage(purchases);
        int MonthCount = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                MonthCount = MonthCount + 1;
            }
        }
        return MonthCount;
    }

}
