public class Losung3
{
    /**
     * Multiplies two numbers
     * @param number1 represented as array - example: 321 = [3, 2, 1]
     * @param number2 integer
     * @return result = number1 * number2
     */
    public static int [] solve(int[] number1, int number2)
    {
        int addToNextDigit = 0;
        for (int i = number1.length - 1; i >= 0; i--)
        {
            number1[i] *= number2;
            number1[i] += addToNextDigit;
            // Resulting digit should not be greater than 9
            addToNextDigit = number1[i] / 10;
            number1[i] %= 10;
        }
        // Return
        if (addToNextDigit != 0)
        {
            // The result has one digit more than the numbers given
            int [] result = new int[number1.length + 1];
            // number1 = [a, b, c] ---> result-* = [1, a, b, c]
            System.arraycopy(number1, 0, result, 1, number1.length);
            result[0] = addToNextDigit;
            return result;
        }
        else return number1;
    }
}
