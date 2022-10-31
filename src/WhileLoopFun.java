public class WhileLoopFun
{
    /**This class has no instance variables, so we can either include no constructor,
     or this simple no-parameter constructor, which is actually preferred practice
     over omitting the constructor entirely
     */
    public WhileLoopFun()
    {
    }

    /**Performs the factorial operation on number (i.e. number!) and returns the result as a double
     (returning a double rather than an int is intentional, as it allows for much larger results to be returned
     than would be possible if returning an int, because with factorials, it is easy to quickly exceed
     Integer.MAX_VALUE and get unexpected results).
     Example:  If number is 6, this methods returns 6 * 5 * 4 * 3 * 2 * 1 = 720.0
     Example:  If number is 10, this methods returns 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 362880.0
     Example:  If number is 20, this methods returns 2.43290200817664E18 ≈ 2.43 x 1018
     */
    public double factorial(int number)
    {
        int i = number;
        int r = number; //r for return
        while (i > 1)
        {
            i --;
            r *= i;
        }
        return r;
    }

    /**Prints the individual digits in number separately, starting with the rightmost digit first.
     Example:  If number is 361, this methods prints 1, then 6, then 3
     Example:  If number is 150856, this methods prints 6, then 5, then 8, then 0, then 5, then 1
     */
    public void printDigits(int number)
    {
        int i = number;//i for input
        String r = "";//r for return
        while (i > 0)
        {
            r += i % 10 + " ";
            i -= i % 10;
            i /= 10;
        }
        System.out.println(r);
    }

    /**Returns the sum of the digits in number.
     Example:  If number is 361, this methods returns 3 + 6 + 1 = 10
     Example:  If number is 150856, this methods returns 1 + 5 + 0 + 8 + 5 + 6 = 25
     */
    public int sumOfDigits(int number)
    {
        int i = number;//i for input
        int r = 0;//r for return
        while (i > 0)
        {
            r += i % 10;
            i -= i % 10;
            i /= 10;
        }
        return r;
    }


    /**Returns true if number is prime (i.e. it has exactly two divisors: 1 and itself) and false
     if it is not prime (i.e. it has at least one other divisor); however, if number is 1, return false, as 1 is
     actually considered non-prime*
     Example:  If number is 2, return true (it can only be divided by 1 and 2)
     Example:  If number is 13, return true (it can only be divided by 1 and 13)
     Example:  If number is 14, return false (in addition to 1 and 14, it can be divided by 2 and 7)
     Example:  If number is 30, return false (in addition to 1 and 30, it can be divided by 2, 3, 5, 6, 10, 15)
     Example:  If number is 1, return false (it has only a single divisor: 1*)

     * 1 is considered non-prime because prime numbers have exactly two divisors - the number and itself -
     but 1 has only a single divisor! (don’t believe it? Google it!)
     */
    public boolean isPrime(int number)
    {
        int i = number;//i for input
        int d = 2;//d for divide
        while (i % d != 0 && d < 10)
        {
            d++;
        }
        if (number == 2)
        {
            return true;
        }
        else if (number == 1)
        {
            return false;
        }
        else if (i % d == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**Returns the maximum number of times that number can be doubled (multiplied by 2) before it exceeds
     threshold
     Example:  If number is 4 and threshold is 20, return 2, since 4 can be doubled a maximum of two
     times, 4 → 8 → 16, without exceeding the threshold value of 20.

     Example:  If number is 2 and threshold is 65, return 5, since 2 can be doubled a maximum of five
     times, 2 → 4 → 8 → 16 → 32 → 64, without exceeding the threshold value of 65.

     Example:  If number is 5 and threshold is 500, return 6, since 5 can be doubled a maximum of six
     times, 5 → 10 → 20 → 40 → 80 → 160 → 320, without exceeding the threshold value of 500.

     Example:  If number is 2 and threshold is 64, return 5, since 2 can be doubled a maximum of five
     times, 2 → 4 → 8 → 16 → 32 → 64, without exceeding the threshold value of 64.

     Example:  If number is 2 and threshold is 63, return 4, since 2 can be doubled a maximum of four
     times, 2 → 4 → 8 → 16 → 32, without exceeding the threshold value of 63.

     Example:  If number is 8 and threshold is 10, return 0, since 8 cannot be doubled without
     exceeding threshold.

     Example:  If number is 8 and threshold is 5, return 0, since 8 already exceeds threshold.

     Precondition: number > 0, threshold > 0
     */
    public int maxDoubles(int number, int threshold)
    {
        int i = number;//i for input
        int t = threshold;//t for threshold
        int r = 0;//r for return
        while (i * 2 <= t)
        {
            i = i * 2;
            r ++;
        }
        return r;
    }
}
