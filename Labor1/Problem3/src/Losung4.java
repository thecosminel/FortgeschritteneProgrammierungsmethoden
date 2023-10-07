public class Losung4
{
    /**
     * Divides two numbers
     * @param number1 represented as array - example: 321 = [3, 2, 1]
     * @param number2 integer
     * @return result = number1 / number2
     */
    public static int [] solve(int[] number1, int number2)
    {
        int buffer = 0;
        for (int i = 0; i < number1.length; i++)
        {
            buffer *= 10;
            buffer += number1[i];
            number1[i] = buffer / number2;
            buffer %= number2;
        }
        return number1;
    }
}
