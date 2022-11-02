import java.util.Scanner;
public class HighLow {

    private Scanner user = new Scanner(System.in);
    private int guess;
    private int threshold;
    private int number;
    private int count;

    public HighLow()
    {
    }

    public void HighOrLow()
    {
        System.out.print("What do you want the High threshold to be? ");
        threshold = user.nextInt();
        number = (int) ((Math.random() * threshold) + 1);
        System.out.print("Guess a number: ");
        guess = user.nextInt();
        while (guess != number)
        {
            if (guess > number)
            {
                System.out.println("Too high!");
                count++;
            }
            else
            {
                System.out.println("Too low!");
                count++;
            }
            System.out.print("Guess a number: ");
            guess = user.nextInt();
        }
        count++;
        System.out.println("You guessed correct! The secret number was " + number);
        System.out.println("You guessed it after " + count + " tries");
    }
}
