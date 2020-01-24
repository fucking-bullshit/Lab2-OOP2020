package stopwatch;

/**
 * create the Unicode characters from (char)65 to (char)limit use StringBuilder
 */
public class Task5 {
    private StringBuilder string = new StringBuilder();
    private int limit;

    public Task5(int limit) {
        this.limit = limit;
        // create string use the Unicode characters
        for (int k = 65; k < limit + 1; k++)
            string.append((char) k);
    }

    /**
     * the string's length
     */
    public void run() {
        int sum = string.toString().length();
        System.out.println(String.format("the length is %,d", sum));
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return String.format("the Unicode characters from (char)65 to (char)%,d ,use StringBuilder", limit);
    }
}