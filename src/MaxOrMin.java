import java.util.Scanner;
public class MaxOrMin
{
    private int sum = 0;
    private int max = -1;
    private int min = -1;
    private Scanner input = new Scanner(System.in);

    public MaxOrMin()
    {
    }

    public void MaxMin()
    {
        int i;
        System.out.print("Enter a number (or -1 to quit): ");
        i = input.nextInt();
        max = i;
        min = i;
        while (i != -1)
        {
            if (i > max)
            {
                max = i;
            }
            if (i < min)
            {
                min = i;
            }
            System.out.print("Enter a number (or -1 to quit): ");
            i = input.nextInt();
        }
        if (max == -1 && min == -1)
        {
            System.out.println("You didn't input any numbers!");
        }
        else
        {
            System.out.println("Max is: " + max);
            System.out.println("Min is: " + min);
        }
    }

    public int MaxMinWorker(int number)
    {
        if (number != -1)
        {
            sum += number;
        }
        return sum;
    }
}
