import java.util.Scanner;
public class RunningAverage
{
    private int sum;
    private int count;
    private double average;
    private Scanner user = new Scanner(System.in);

    public RunningAverage()
    {
    }

    public void Average()
    {
        int i;
        System.out.print("Input a number (or -1 to end program): ");
        i = user.nextInt();
        while (i != -1)
        {
            sum += i;
            count ++;
            System.out.print("Input a number (or -1 to end program): ");
            i = user.nextInt();
        }
        if (count == 0)
        {
            System.out.print("You didn't enter any numbers!");
        }
        else
        {
            average = (double) sum / (double) count;
            System.out.println("The sum of all numbers entered is: " + sum);
            System.out.println("The amount of numbers you entered is: " + count);
            System.out.println("The average of all these numbers is: " + Math.round(average * 100.00) / 100.00);
        }
    }
}