public class Losung4
{
    /**
     * Find the minimum sum of n-1 numbers from an array
     * @param numbers representing an array of positive numbers
     * @return minimum sum
     */
    public static int solve(int[] numbers)
    {
        int sum = 0;
        int maximumNr = -1;
        // Calculate sum of all numbers and find the minimum number
        for(int number : numbers)
        {
            sum += number;
            if (number > maximumNr) maximumNr = number;
        }
        // Subtract the minimum number from the array
        sum -= maximumNr;
        return sum;
    }
}
