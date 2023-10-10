public class Losung1
{
    /**
     * Find the maximum value in an array
     * @param numbers representing an array of positive numbers
     * @return maximum number || -1 if array is empty
     */
    public static int solve(int[] numbers)
    {
        int maximumNr = -1;
        for(int number : numbers)
        {
            if (number > maximumNr) maximumNr = number;
        }
        return maximumNr;
    }
}
