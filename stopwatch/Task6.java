package stopwatch;

import java.util.Random;
import java.util.Scanner;

/**
 * Plusing game will ask you the total of two numbers. this game will play 10
 * times, so the full score is 10 point. You can custom the hard by custom the
 * upperbound of question's numbers (as a param)
 * 
 * @author Nanthakarn Limkool
 */
public class Task6 {
    /** the player's total score */
    private int score;
    /** the upperbound of the question's numbers */
    private int limit;
    /** the correct answer */
    private int solution;
    /** the player's input answer */
    private int answer;

    /** Initialize a new game with a easiest upperbound. */
    public Task6() {
        this(10);
    }

    /**
     * initialize a new game with custom upperbound.
     * 
     * @param upperbound is the upper limit for the question's number
     */
    public Task6(int limit) {
        this.limit = limit + 1;
        this.score = 0;
    }

    /**
     * Game console
     */
    public void run() {
        for (int i = 1; i < 11; i++) {
            // show the current round
            System.out.println("\nRound#" + i);

            // create the question's number (x and y)
            Random rx = new Random();
            Random ry = new Random();
            int x = rx.nextInt(this.limit);
            int y = ry.nextInt(this.limit);

            // set the Solution
            this.setSolution(x + y);

            // display the question
            System.out.printf(x + " + " + y + " = ");

            // get input(answer) from player
            Scanner answer = new Scanner(System.in);
            this.setAnswer(answer.nextInt());

            // check if the answer is right
            this.check_ans();
        }
        // display the total Score
        System.out.println(String.format("\nAfter 10 plays. You got %d point(s)\n", this.getScore()));
    }

    /**
     * Check if the answer is right, print "Correct!" and score+1, otherwise, print
     * "Wrong, then show the correct answer"
     */
    public void check_ans() {
        if (this.answer == this.solution) {
            this.score++;
            System.out.println("-> Correct!");
        } else {
            System.out.println("-> Wrong, the answer is " + this.getSolution());
        }
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

    /**
     * Get the game solution
     */
    public int getSolution() {
        return this.solution;
    }

    /**
     * Get the score
     */
    public int getScore() {
        return this.score;
    }

    /**
     * Describe this task.
     */
    public String toString() {
        return "Correct the total of two numbers,\nTry fastest (10 times)";
    }
}