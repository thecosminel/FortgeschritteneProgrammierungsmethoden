public class Losung1
{
    /**
     * Adds two numbers with the same digits count
     * @param number1 represented as array
     * @param number2 represented as array
     *                example: 321 = [3, 2, 1]
     * @return number1 + number2
     */
    public static int [] solve(int[] number1, int[] number2)
    {
        int addToNextDigit = 0;
        for (int i = number1.length - 1; i >= 0; i--)
        {
            number1[i] += number2[i] + addToNextDigit;
            // Resulting digit should not be greater than 9
            if (number1[i] > 9)
            {
                number1[i] -= 10;
                addToNextDigit = 1;
            }
            else addToNextDigit = 0;
        }
        // Return
        if (addToNextDigit != 0)
        {
            // The result has one digit more than the numbers given
            int [] result = new int[number1.length + 1];
            // number1 = [a, b, c] ---> result = [1, a, b, c]
            System.arraycopy(number1, 0, result, 1, number1.length);
            result[0] = addToNextDigit;
            return result;
        }
        else return number1;
    }
}
