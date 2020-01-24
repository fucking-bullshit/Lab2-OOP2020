package stopwatch;

/**
 * Time the tasks and display results.
 */
public class Main {

    public static void main(String[] args) {

        // Find Sum values of the array use double values
        Stopwatch s1 = new Stopwatch();
        Task1 task1 = new Task1(10_000_000);
        System.out.println("\n" + task1);
        s1.start();
        task1.run();
        s1.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", s1.getElapsed());

        // Find Sum values of the array use Double objects
        Stopwatch s2 = new Stopwatch();
        Task2 task2 = new Task2(10_000_000);
        System.out.println("\n" + task2);
        s2.start();
        task2.run();
        s2.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", s2.getElapsed());

        // Find Sum values of the array use BigDecimal objects
        Stopwatch s3 = new Stopwatch();
        Task3 task3 = new Task3(10_000_000);
        System.out.println("\n" + task3);
        s3.start();
        task3.run();
        s3.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", s3.getElapsed());

        // Find length of the Unicode characters from (char)65
        Stopwatch s4 = new Stopwatch();
        Task4 task4 = new Task4(65_000);
        System.out.println("\n" + task4);
        s4.start();
        task4.run();
        s4.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", s4.getElapsed());

        // Find length of the Unicode characters from (char)65, use StringBuilder,
        // then convert to String
        Stopwatch s5 = new Stopwatch();
        Task5 task5 = new Task5(65_000);
        System.out.println("\n" + task5);
        s5.start();
        task5.run();
        s5.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", s5.getElapsed());

        // play the plusing game
        Stopwatch s6 = new Stopwatch();
        Task6 task6 = new Task6(); // call default upperbound
        System.out.println("\n" + task6);
        s6.start();
        task6.run();
        s6.stop();
        System.out.printf("Elapsed time %.6f sec\n\n", s6.getElapsed());
    }
}