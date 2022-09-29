package datastructure.miscellaneous;

/**
 * @author piksel
 */
public class FibnaciGenerator {

    //0, 1, 1, 2, 3, 5, 8
    public int[] generateFibnaciSeriesUsingIterative(int limit) {
        int[] fibSeries = new int[limit];
        int previousNumber = 0;
        int nextNumber = 1;
        int sum = 0;
        fibSeries[0] = 0;
        fibSeries[1] = 1;
        for (int i = 2; i < limit; i++) {
            sum = previousNumber + nextNumber;
            fibSeries[i] = sum;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        return fibSeries;
    }

    public int[] generateFibnaciSeriesUsingRecursive(int limit) {
        int[] fibSeries = new int[limit];

        for (int i = 0; i < limit; i++) {
            fibSeries[i] = fibSeriesRecursive(i);
        }
        return fibSeries;
    }

    private int fibSeriesRecursive(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        return fibSeriesRecursive(index - 2) + fibSeriesRecursive(index - 1);
    }


}
