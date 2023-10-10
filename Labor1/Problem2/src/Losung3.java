public class Losung3
{
    /**
     * Find the maximum sum of n-1 numbers from an array
     * @param numbers representing an array of positive numbers
     * @return maximum sum
     */
    public static int solve(int[] numbers)
    {
        int sum = 0;
        int minimumNr = Integer.MAX_VALUE;
        // Calculate sum of all numbers and find the minimum number
        for(int number : numbers)
        {
            sum += number;
            if (number < minimumNr) minimumNr = number;
        }
        // Subtract the minimum number from the array
        sum -= minimumNr;
        return sum;
    }
}
