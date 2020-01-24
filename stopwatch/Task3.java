package stopwatch;

import java.math.BigDecimal;

/**
 * Add BigDecimal objects using an array.
 */
public class Task3 {
    private int limit;
    private BigDecimal[] array;

    public Task3(int limit) {
        this.limit = limit;
        // initialize the array with values 1 ... limit+1
        this.array = new BigDecimal[limit];
        for (int k = 0; k < array.length; k++)
            array[k] = BigDecimal.valueOf(k + 1);
    }

    /**
     * Sum values of the array.
     */
    public void run() {
        BigDecimal sum = new BigDecimal(0.0);
        for (int k = 0; k < array.length; k++)
            sum = sum.add(array[k]);
            System.out.println(String.format("the sum is %,.2f",sum));
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return String.format("Sum an array of %,d BigDecimal objects", limit);
    }
}