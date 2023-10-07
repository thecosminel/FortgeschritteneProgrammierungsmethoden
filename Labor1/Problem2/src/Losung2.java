public class Losung2
{
    /**
     * Find the minimum value in an array
     * @param numbers representing an array of positive numbers
     * @return minimum number || -1 if array is empty
     */
    public static int solve(int[] numbers)
    {
        int minimumNr = Integer.MAX_VALUE;
        for(int number : numbers)
        {
            if (number < minimumNr) minimumNr = number;
        }
        return minimumNr;
    }
}
