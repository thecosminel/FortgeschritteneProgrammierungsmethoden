public class Losung2
{
    /**
     * Subtracts two numbers with the same digits count
     * CONDITION: number1 >= number2
     * @param number1 represented as array
     * @param number2 represented as array
     *                example: 321 = [3, 2, 1]
     * @return number1 - number2
     */
    public static int[] solve(int[] number1, int[] number2)
    {
        int subtractFromNextDigit = 0;
        for (int i = number1.length - 1; i >= 0; i--)
        {
            number1[i] -= number2[i] + subtractFromNextDigit;
            // Resulting digit should not be smaller than 0
            if (number1[i] < 0)
            {
                number1[i] += 10;
                subtractFromNextDigit = 1;
            }
            else subtractFromNextDigit = 0;
        }
        // Case for negative results not specified
        return number1;
    }
}
