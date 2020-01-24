package stopwatch;

/**
 * create the Unicode characters from (char)65 to (char)limit
 */
public class Task4 {
    private String string;
    private int limit;

    public Task4(int limit) {
        this.limit = limit;
        // create string use the Unicode characters
        for (int k = 65; k < limit + 1; k++)
            this.string += (char) k;
    }

    /**
     * the string's length
     */
    public void run() {
        int sum = string.length();
        System.out.println(String.format("the length is %,d", sum));
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return String.format("the Unicode characters from (char)65 to (char)%,d", limit);
    }
}